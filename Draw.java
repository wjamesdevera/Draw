package Draw;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Draw {
    public static void main(String[] args) {
        drawCircle(3, 2, 100);
        // try {
        //     int mLocX, mLocY;
        //     Robot r = new Robot();

        //     Point p = MouseInfo.getPointerInfo().getLocation();
        //     mLocX = p.x;
        //     mLocY = p.y;
        //     int Z = 0;
        //     int[] center = {mLocX, mLocY};

        //     //  Draws A Circle 
        //     double radius = 200;
        //     System.out.println("Center X: " + (center[0] - 50));
        //     System.out.println("Center Y: " + (center[1])+"\n");
        //     int[] circleCenter1 = {center[0] - 50, center[1]};
        //     r.mouseMove(mLocX - 50, mLocY - (int) radius); 
        //     r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //     for (int angle=0; angle<=360;angle++) {
        //         r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //         int newX = circleCenter1[0] + (int) (radius * Math.sin(angle));
        //         int newY = circleCenter1[1] + (int) (-radius * Math.cos(angle));
        //         System.out.println("X: " + newX + "\tY: " + newY + "\tZ: " + Z + "\tC: (" + circleCenter1[0] + ", " + circleCenter1[1] + ")\tr: " + (int) radius);
        //         r.mouseMove(newX, newY);
        //         Thread.sleep(50);
        //         r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //     }
            
        //     r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //     Thread.sleep(1000);

        //     // System.out.println("Center X: " + (center[0] + 50));
        //     // System.out.println("Center Y: " + center[1]+"\n");
        //     // int[] circleCenter2 = {center[0] + 50, center[1]};
        //     // r.mouseMove(mLocX + 50, mLocY - (int) radius); 
        //     // r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //     // for (int angle=0; angle<=100;angle++) {
        //     //     r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //     //     int newX = circleCenter2[0] + (int) (radius * Math.sin(angle));
        //     //     int newY = circleCenter2[1] + (int) (-radius * Math.cos(angle));
        //     //     System.out.println("X: " + newX);
        //     //     System.out.println("Y: " + newY);
        //     //     r.mouseMove(newX, newY);
        //     //     Thread.sleep(50);
        //     //     r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //     // }

        //     // r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //     // Thread.sleep(1000);

        //     // System.out.println("Center X: " + (center[0] - 70));
        //     // System.out.println("Center Y: " + (center[1] + 50) +"\n");
        //     // int[] circleCenter3 = {center[0] - 70, center[1] + 50};
        //     // r.mouseMove(mLocX - 70, mLocY - (int) radius + 50);
        //     // r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //     // for (int angle=0; angle<=100;angle++) {
        //     //     r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //     //     int newX = circleCenter3[0] + (int) (radius * Math.sin(angle));
        //     //     int newY = circleCenter3[1] + (int) (-radius * Math.cos(angle));
        //     //     System.out.println("X: " + newX + "\tY: " + newY);
        //     //     r.mouseMove(newX, newY);
        //     //     Thread.sleep(50);
        //     //     r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //     // }

        //     // r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //     // Thread.sleep(1000);

        //     // System.out.println("Center X: " + (center[0] + 70));
        //     // System.out.println("Center Y: " + (center[1] + 50) +"\n");
        //     // int[] circleCenter4 = {center[0] + 70, center[1] + 50};
        //     // r.mouseMove(mLocX + 70, mLocY - (int) radius + 50);
        //     // r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //     // for (int angle=0; angle<=100;angle++) {
        //     //     r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //     //     int newX = circleCenter4[0] + (int) (radius * Math.sin(angle));
        //     //     int newY = circleCenter4[1] + (int) (-radius * Math.cos(angle));
        //     //     System.out.println("X: " + newX + "\tY: " + newY);
        //     //     r.mouseMove(newX, newY);
        //     //     Thread.sleep(50);
        //     //     r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //     // }

        //     // int[] startCoordinates = {circleCenter3[0], circleCenter3[1]};
        //     // int[] endCoordinates = {circleCenter4[0], circleCenter4[1]};

        //     // int length = (startCoordinates[0] - endCoordinates[0])/5;


        //     // int newX = mLocX + length;
        //     // int newY = mLocY -50;

        //     // r.mouseMove(startCoordinates[0], startCoordinates[1]);
            
        //     // while (mLocX != newX && mLocY != newY) {
        //     //     r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //     //     mLocX += 1;
        //     //     mLocY -= 1;
        //     //     r.mouseMove(mLocX, mLocY);
        //     //     r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        //     // }
        //     // newX = mLocX + length;
        //     // newY = mLocY + 50;
            
            
        //     // while (mLocX != newX && mLocY != newY) {
        //     //     r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //     //     mLocX += 1;
        //     //     mLocY += 1;
        //     //     r.mouseMove(mLocX, mLocY);
        //     //     r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //     // }



            
            

            
        //     //  Draws A Circle 
        //     // double radius = 30;
        //     // int[] center = {mLocX, mLocY};
        //     // System.out.println("Center X: " + center[0]);
        //     // System.out.println("Center Y: " + center[1]+"\n");
        //     // r.mouseMove(mLocX, mLocY - (int) radius); 
        //     // r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //     // for (int angle=0; angle<=100;angle++) {
        //     //     int newX = center[0] + (int) (radius * Math.sin(angle));
        //     //     int newY = center[1] + (int) (-radius * Math.cos(angle));
        //     //     System.out.println("X: " + newX);
        //     //     System.out.println("Y: " + newY);
        //     //     r.mouseMove(newX, newY);
        //     //     Thread.sleep(100);
        //     // }
            
        //     r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            
            
        // } catch (Exception e){
        //     System.out.println(e.getMessage());
        // }

    }
    public static void drawCircle(int x, int y, double radius) {
        try {
            int mLocX, mLocY;
            Robot r = new Robot();

            Point p = MouseInfo.getPointerInfo().getLocation();
            mLocX = p.x;
            mLocY = p.y;
            int Z = 0;
            int[] center = {mLocX, mLocY};

            //  Draws A Circle 
            System.out.println("Center X: " + (center[0] - 50));
            System.out.println("Center Y: " + (center[1])+"\n");
            int[] circleCenter1 = {center[0] - 50, center[1]};
            r.mouseMove(mLocX - 50, mLocY - (int) radius); 
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            for (int angle=0; angle<=360;angle++) {
                r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                int newX = circleCenter1[0] + (int) (radius * Math.sin(angle));
                int newY = circleCenter1[1] + (int) (-radius * Math.cos(angle));
                System.out.println("X: " + newX + "\tY: " + newY + "\tZ: " + Z + "\tC: (" + circleCenter1[0] + ", " + circleCenter1[1] + ")\tr: " + (int) radius);
                r.mouseMove(newX, newY);
                Thread.sleep(50);
                r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
            
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(1000);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void drawZigZag() {
        try {
            int mLocX, mLocY;
            Robot r = new Robot();

            Point p = MouseInfo.getPointerInfo().getLocation();
            mLocX = p.x;
            mLocY = p.y;
            int startX, startY, height, length;
            startX =  mLocX;
            startY  = mLocY;
            length = 10;
            
            int[] startCoordinates = {startX, startY};
            int[] endCoordinates = {startX + length, startY}; 
            // Rise Up
            while (mLocX != endCoordinates[0] && mLocY != (mLocX - (10/2))) {
                r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                mLocX += 1;
                mLocY -= 1;
                r.mouseMove(mLocX, mLocY);
            }

            
        } catch (Exception e){
            System.out.println(e.getMessage());{
            }
        }


    }
    
}
