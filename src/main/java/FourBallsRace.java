import processing.core.PApplet;

import java.util.ArrayList;
import java.util.HashMap;

public class FourBallsRace extends PApplet {

    private final int SKETCH_WIDTH = 640;
    private final int SKETCH_HEIGHT = 480;
    private final int BALL_DIAMETER = 25;

    HashMap<String, Integer> ballOne, ballTwo, ballThree, ballFour;
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
        for (int ballNum = 0; ballNum < 4; ballNum++) {
            fill(getBall(ballNum, "R"), getBall(ballNum, "G"), getBall(ballNum, "B"));
            ellipse(getBall(ballNum, "x_position"), getBall(ballNum, "y_position"), BALL_DIAMETER, BALL_DIAMETER);
            moveTheBall(ballNum);
        }
    }

    private void setBlackBackground() {
        int SKETCH_BACKGROUND_COLOR = 0;
        background(SKETCH_BACKGROUND_COLOR);
    }

    private int setYCoor(int ballNo) {
        return (int) ((SKETCH_HEIGHT * ballNo) / 5.0);
    }

    private int getBall(int ballNum, String param){
        return balls.get(ballNum).get(param);
    }

    private void moveTheBall(int ballNum){
        balls.get(ballNum).put("x_position", balls.get(ballNum).get("x_position")+balls.get(ballNum).get("speed"));
    }

    private void setBallOneParams(){
        ballOne = new HashMap<>();
        ballOne.put("x_position", 0);
        ballOne.put("y_position", setYCoor(1));
        ballOne.put("R", 235);
        ballOne.put("G", 52);
        ballOne.put("B", 52);
        ballOne.put("speed", 1);
    }
    private void setBallTwoParams(){
        ballTwo = new HashMap<>();
        ballTwo.put("x_position", 0);
        ballTwo.put("y_position", setYCoor(2));
        ballTwo.put("R", 79);
        ballTwo.put("G", 255);
        ballTwo.put("B", 56);
        ballTwo.put("speed", 2);
    }

    private void setBallThreeParams(){
        ballThree = new HashMap<>();
        ballThree.put("x_position", 0);
        ballThree.put("y_position", setYCoor(3));
        ballThree.put("R", 56);
        ballThree.put("G", 232);
        ballThree.put("B", 255);
        ballThree.put("speed", 3);
    }

    private void setBallFourParams(){
        ballFour = new HashMap<>();
        ballFour.put("x_position", 0);
        ballFour.put("y_position", setYCoor(4));
        ballFour.put("R", 183);
        ballFour.put("G", 89);
        ballFour.put("B", 255);
        ballFour.put("speed", 4);
    }
}
