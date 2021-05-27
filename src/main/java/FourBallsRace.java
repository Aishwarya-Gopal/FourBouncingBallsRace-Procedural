import processing.core.PApplet;

public class FourBallsRace extends PApplet {
    private final int SKETCH_HEIGHT = 480;
    private final int BALL_DIAMETER = 25;
    private int ballOneXCoor, ballOneYCoor;
    private int ballTwoXCoor;
    private int ballTwoYCoor;
    private int ballThreeXCoor;
    private int ballThreeYCoor;
    private int ballFourXCoor;
    private int ballFourYCoor;

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
        ballOneYCoor = setYCoor(1);
        ballTwoXCoor = 0;
        ballTwoYCoor = setYCoor(2);
        ballThreeXCoor = 0;
        ballThreeYCoor = setYCoor(3);
        ballFourXCoor = 0;
        ballFourYCoor = setYCoor(4);
    }

    @Override
    public void draw() {
        fill(235, 52, 52);
        ellipse(ballOneXCoor, ballOneYCoor, BALL_DIAMETER, BALL_DIAMETER);
        ballOneXCoor++;

        fill(79, 255, 56);
        ellipse(ballTwoXCoor, ballTwoYCoor, BALL_DIAMETER, BALL_DIAMETER);
        ballTwoXCoor += 2;

        fill(56, 232, 255);
        ellipse(ballThreeXCoor, ballThreeYCoor, BALL_DIAMETER, BALL_DIAMETER);
        ballThreeXCoor += 3;

        fill(183, 89, 255);
        ellipse(ballFourXCoor, ballFourYCoor, BALL_DIAMETER, BALL_DIAMETER);
        ballFourXCoor += 4;
    }

    private void setBlackBackground() {
        int SKETCH_BACKGROUND_COLOR = 0;
        background(SKETCH_BACKGROUND_COLOR);
    }

    private int setYCoor(int ballNo) {
        return (int) ((SKETCH_HEIGHT * ballNo) / 5.0);
    }
}
