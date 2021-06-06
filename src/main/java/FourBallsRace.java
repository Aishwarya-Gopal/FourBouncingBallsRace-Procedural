import processing.core.PApplet;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class FourBallsRace extends PApplet {

    private final int SKETCH_WIDTH = 640;
    private final int SKETCH_HEIGHT = 480;
    private final int BALL_DIAMETER = 25;
    Color black, red, green, blue, violet;

    HashMap<String, Integer> ballOne, ballTwo, ballThree, ballFour;
    ArrayList<HashMap<String, Integer>> balls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBallsRace", args);
    }

    @Override
    public void settings() {
        black = new Color(0);
        red = new Color(235, 52, 52);
        green = new Color(79, 255, 56);
        blue = new Color(56, 232, 255);
        violet = new Color(183, 89, 255);
        size(SKETCH_WIDTH, SKETCH_HEIGHT);
    }

    @Override
    public void setup() {
        setBlackBackground();
        setBallOneParams();
        setBallTwoParams();
        setBallThreeParams();
        setBallFourParams();

        balls.add(ballOne);
        balls.add(ballTwo);
        balls.add(ballThree);
        balls.add(ballFour);
    }

    @Override
    public void draw() {
        if (!isGameOver()) {
            for (int ballNum = 0; ballNum < 4; ballNum++) {
                fill(getParam(ballNum, "color"));
                ellipse(getParam(ballNum, "x_position"), getParam(ballNum, "y_position"), BALL_DIAMETER, BALL_DIAMETER);
                moveTheBall(ballNum);
            }
        } else
            exit();
    }

    private Boolean isGameOver() {
        return getParam(0, "x_position") > SKETCH_WIDTH;
    }

    private void setBlackBackground() {
        background(black.getRGB());
    }

    private int setYCoor(int ballNo) {
        return (int) ((SKETCH_HEIGHT * ballNo) / 5.0);
    }

    private int getParam(int ballNum, String param) {
        return balls.get(ballNum).get(param);
    }

    private void moveTheBall(int ballNum) {
        balls.get(ballNum).put("x_position", balls.get(ballNum).get("x_position") + balls.get(ballNum).get("speed"));
    }

    private void setBallOneParams() {
        ballOne = new HashMap<>();
        ballOne.put("x_position", 0);
        ballOne.put("y_position", setYCoor(1));
        ballOne.put("color", red.getRGB());
        ballOne.put("speed", 1);
    }

    private void setBallTwoParams() {
        ballTwo = new HashMap<>();
        ballTwo.put("x_position", 0);
        ballTwo.put("y_position", setYCoor(2));
        ballTwo.put("color", green.getRGB());
        ballTwo.put("speed", 2);
    }

    private void setBallThreeParams() {
        ballThree = new HashMap<>();
        ballThree.put("x_position", 0);
        ballThree.put("y_position", setYCoor(3));
        ballThree.put("color", blue.getRGB());
        ballThree.put("speed", 3);
    }

    private void setBallFourParams() {
        ballFour = new HashMap<>();
        ballFour.put("x_position", 0);
        ballFour.put("y_position", setYCoor(4));
        ballFour.put("color", violet.getRGB());
        ballFour.put("speed", 4);
    }
}
