import processing.core.PApplet;

public class FourBallsRace extends PApplet {
    private final int SKETCH_HEIGHT = 480;
    private final int BALL_DIAMETER = 25;
    private int ballOneXCoor, ballOneYCoor;
    private int ballTwoXCoor;
    private int ballTwoYCoor;

    public static void main(String[] args) {
        PApplet.main("FourBallsRace", args);
    }

    @Override
    public void settings() {
        super.settings();
        int SKETCH_WIDTH = 640;
        size(SKETCH_WIDTH, SKETCH_HEIGHT);
    }

    @Override
    public void setup() {
        setBlackBackground();
        ballOneXCoor = 0;
        ballOneYCoor = SKETCH_HEIGHT / 5;
        ballTwoXCoor = 0;
        ballTwoYCoor = (SKETCH_HEIGHT * 2) / 5;
    }

    @Override
    public void draw() {
        fill(235, 52, 52);
        ellipse(ballOneXCoor, ballOneYCoor, BALL_DIAMETER, BALL_DIAMETER);
        ballOneXCoor++;

        fill(79, 255, 56);
        ellipse(ballTwoXCoor, ballTwoYCoor, BALL_DIAMETER, BALL_DIAMETER);
        ballTwoXCoor+=2;
    }

    private void setBlackBackground() {
        int SKETCH_BACKGROUND_COLOR = 0;
        background(SKETCH_BACKGROUND_COLOR);
    }
}
