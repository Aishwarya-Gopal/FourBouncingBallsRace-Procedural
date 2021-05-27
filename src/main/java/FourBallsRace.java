import processing.core.PApplet;

public class FourBallsRace extends PApplet {
    private final int SKETCH_BACKGROUND_COLOR = 0;
    private final int SKETCH_WIDTH = 640;
    private final int SKETCH_HEIGHT = 480;
    private final int BALL_RADIUS = 25;
    private int ballOneXCoor, ballOneYCoor;

    public static void main(String[] args) {
        PApplet.main("FourBallsRace", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(SKETCH_WIDTH, SKETCH_HEIGHT);
    }

    @Override
    public void setup() {
        setBlackBackground();
        ballOneXCoor = 0;
        ballOneYCoor = SKETCH_HEIGHT / 5;
    }

    @Override
    public void draw() {
        setColorAndMove(235, 52, 52, ballOneXCoor, ballOneYCoor);
    }

    public void setColorAndMove(int R, int G, int B, int x_coor, int y_coor) {
        fill(R, G, B);
        ellipse(x_coor, y_coor, BALL_RADIUS, BALL_RADIUS);
        moveTheBall();
    }

    private void moveTheBall() {
        ballOneXCoor += 1;
    }

    private void setBlackBackground() {
        background(SKETCH_BACKGROUND_COLOR);
    }
}
