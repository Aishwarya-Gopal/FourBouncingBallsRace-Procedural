import processing.core.PApplet;

public class FourBallsRace extends PApplet {
    private int SKETCH_BACKGROUND_COLOR = 0;

    public static void main(String[] args) {
        PApplet.main("FourBallsRace", args);
    }

    @Override
    public void settings() {
        super.settings();
    }

    @Override
    public void setup() {
        setBlackBackground();
    }

    @Override
    public void draw() {
        super.draw();
    }

    private void setBlackBackground() {
        background(SKETCH_BACKGROUND_COLOR);
    }
}
