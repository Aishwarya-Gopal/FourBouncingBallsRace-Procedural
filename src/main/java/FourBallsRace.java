import processing.core.PApplet;

public class FourBallsRace extends PApplet {
    private final int SKETCH_BACKGROUND_COLOR = 0;
    private final int SKETCH_WIDTH = 640;
    private final int SKETCH_HEIGHT = 480;
    private int ballOneXCoor;

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
    }

    @Override
    public void draw() {
        fill(235, 52, 52);
        ellipse(ballOneXCoor, SKETCH_HEIGHT / 5, 25, 25);
        moveTheBall();
    }

    private void moveTheBall() {
        ballOneXCoor += 1;
    }

    private void setBlackBackground() {
        background(SKETCH_BACKGROUND_COLOR);
    }
}
