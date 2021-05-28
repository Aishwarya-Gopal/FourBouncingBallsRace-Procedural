import processing.core.PApplet;

import java.util.ArrayList;
import java.util.HashMap;

public class FourBallsRace extends PApplet {

    private final int SKETCH_WIDTH = 640;
    private final int SKETCH_HEIGHT = 480;
    private final int BALL_DIAMETER = 25;

    ArrayList<HashMap<String, Integer>> balls = new ArrayList<>();

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

        HashMap<String, Integer> ballOne = new HashMap<>();
        ballOne.put("x_position", 0);
        ballOne.put("y_position", setYCoor(1));
        ballOne.put("R", 235);
        ballOne.put("G", 52);
        ballOne.put("B", 52);
        ballOne.put("speed", 1);

        HashMap<String, Integer> ballTwo = new HashMap<>();
        ballTwo.put("x_position", 0);
        ballTwo.put("y_position", setYCoor(2));
        ballTwo.put("R", 79);
        ballTwo.put("G", 255);
        ballTwo.put("B", 56);
        ballTwo.put("speed", 2);

        HashMap<String, Integer> ballThree = new HashMap<>();
        ballThree.put("x_position", 0);
        ballThree.put("y_position", setYCoor(3));
        ballThree.put("R", 56);
        ballThree.put("G", 232);
        ballThree.put("B", 255);
        ballThree.put("speed", 3);

        HashMap<String, Integer> ballFour = new HashMap<>();
        ballFour.put("x_position", 0);
        ballFour.put("y_position", setYCoor(4));
        ballFour.put("R", 183);
        ballFour.put("G", 89);
        ballFour.put("B", 255);
        ballFour.put("speed", 4);

        balls.add(ballOne);
        balls.add(ballTwo);
        balls.add(ballThree);
        balls.add(ballFour);

        System.out.println(balls);
        System.out.println(balls.get(0));
    }

    @Override
    public void draw() {
        for (int i = 0; i < 4; i++) {
            fill((balls.get(i)).get("R"), (balls.get(i)).get("G"), (balls.get(i)).get("B"));
            ellipse(balls.get(i).get("x_position"), balls.get(i).get("y_position"), BALL_DIAMETER, BALL_DIAMETER);
            balls.get(i).put("x_position", balls.get(i).get("x_position") + balls.get(i).get("speed"));
        }
    }

    private void setBlackBackground() {
        int SKETCH_BACKGROUND_COLOR = 0;
        background(SKETCH_BACKGROUND_COLOR);
    }

    private int setYCoor(int ballNo) {
        return (int) ((SKETCH_HEIGHT * ballNo) / 5.0);
    }
}
