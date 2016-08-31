package Calandar;

/**
 * Created by Rook on 6/18/2015.
 */
public class FieldOfView {
        private World world;
        private  int depth;
        private  boolean [][] visible;
        private FieldOfView fov;

    public  boolean isVisible(int x, int y , int z){

            return  z == depth && x >= 0 && y >= 0 && x < visible.length
                    && y < visible[0].length && visible[x][y];
        }

    //  private Tile[][][] tile;
    // public Tile tile (int x, int y, int z){return tile[x][y][z]}


    public FieldOfView(World world) {
        this.world = world;
        this.visible = new boolean[world.getWidth()][world.getHeight()];
        this.tiles = new Tile[world.width][world.height];

        for (int x = 0; x < world.width(); x++){
            for (int y = 0; y < world.height(); y++){
                for (int z = 0; z < world.depth(); z++){
                    tiles[x][y][z] = Tile.UNKNOWN; // Labels area as black fog, out of players view till player steps on tile
                }
            }
        }
        



    }
    public void update(int wx, int wy, int wz, int r){
        depth = wz;
        visible = new boolean[world.width()][world.height()];

        for (int x = -r; x < r; x++){
            for (int y = -r; y < r; y++){
                if (x*x + y*y > r*r)
                    continue;

                if (wx + x < 0 || wx + x >= world.width()
                        || wy + y < 0 || wy + y >= world.height())
                    continue;

                for (Point p : new Line(wx, wy, wx + x, wy + y)){
                    Tile tile = world.tile(p.x, p.y, wz);
                    visible[p.x][p.y] = true; // position is revealed player in position
                    tiles[p.x][p.y][wz] = tile;

                    if (!tile.isGround())
                        break;
                }
            }
        }
    // For player
    public boolean canSee(int wx, int wy, int wz) {
        return fov.isVisible(wx, wy, wz);
    }




}
