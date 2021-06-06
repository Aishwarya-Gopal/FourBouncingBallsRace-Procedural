import processing.core.PApplet;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FourBallsRace extends PApplet {

    public static final int BALL_ONE_INDEX = 0;
    public static final int SKETCH_LEFT_PX = 0;
    public static final double SKETCH_SPLIT_THRESHOLD = 5.0;
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
        ballOne = setBallParams(setYCoor(1), red.getRGB(), 1);
        ballTwo = setBallParams(setYCoor(2), green.getRGB(), 2);
        ballThree = setBallParams(setYCoor(3), blue.getRGB(), 3);
        ballFour = setBallParams(setYCoor(4), violet.getRGB(), 4);

        Collections.addAll(balls, ballOne, ballTwo, ballThree, ballFour);
    }

    @Override
    public void draw() {
        if (!isGameOver()) {
            for (int ballNum = 0; ballNum < balls.size(); ballNum++) {
                fill(getParam(ballNum, "color"));
                ellipse(getParam(ballNum, "x_position"), getParam(ballNum, "y_position"), BALL_DIAMETER, BALL_DIAMETER);
                moveTheBall(ballNum);
            }
        } else
            exit();
    }

    private Boolean isGameOver() {
        return getParam(BALL_ONE_INDEX, "x_position") > SKETCH_WIDTH;
    }

    private void setBlackBackground() {
        background(black.getRGB());
    }

    private int setYCoor(int ballNo) {
        return (int) ((SKETCH_HEIGHT * ballNo) / SKETCH_SPLIT_THRESHOLD);
    }

    private int getParam(int ballNum, String param) {
        return balls.get(ballNum).get(param);
    }

    private void moveTheBall(int ballNum) {
        balls.get(ballNum).put("x_position", balls.get(ballNum).get("x_position") + balls.get(ballNum).get("speed"));
    }

    private HashMap<String, Integer> setBallParams(int y_position, int color, int speed){
        HashMap<String, Integer> ball = new HashMap<>();
        ball.put("x_position", SKETCH_LEFT_PX);
        ball.put("y_position", y_position);
        ball.put("color", color);
        ball.put("speed", speed);
        return ball;
    }
}
