import processing.core.PApplet;

import java.util.Scanner;

public class BallChallenge  extends PApplet {


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static int firstBallWidth = 0;
    public static int secondBallWidth = 0;
    public static int thirdBallWidth = 0;
    public static int fourthBallWidth = 0;

    //int x=4;


    public static void main(String[] args) {PApplet.main("BallChallenge", args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);


    }


    @Override
    public void draw() {
        drawFirstBall();
        drawSecondBall();
        drawThirdBall();
        drawFourthBall();
    }

   // public void drawCircle() {
//
//        int i=1;
//       for (int i = 1; i <6; i++) {
////        ellipse(x,HEIGHT/i,10, 10);
////         x++;
//       }
//    }

    private void drawFirstBall() {

        ellipse(firstBallWidth,10,10, 10);
        firstBallWidth++;
    }
    private void drawSecondBall() {
        ellipse(secondBallWidth,100,10, 10);
        secondBallWidth+=2;
    }

    private void drawThirdBall() {

        ellipse(thirdBallWidth,250,10, 10);
        thirdBallWidth+=3;
    }
    private void drawFourthBall() {
        ellipse(fourthBallWidth,450,10, 10);
        fourthBallWidth+=4;
    }
    private void paintwhite() {
        background(255);
    }
}