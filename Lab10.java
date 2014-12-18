/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab10 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
       Display.setSpeed(10);
		 Athlete athena = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
		 clearMaze(athena);
	 }
	 
	 public static void clearMaze(Athlete arg) {
       int x = 0;
		 while(arg.rightIsClear()) {
         arg.turnRight();
         while(arg.frontIsClear()) {
            arg.move();
         }
       }
       while(!arg.frontIsClear()) {
         arg.turnLeft();
       }
       while(arg.frontIsClear()) {
         arg.move();
         x = x+1;
       }
       if(!arg.frontIsClear()&&arg.rightIsClear()) {
         arg.turnRight();
         while(arg.frontIsClear()) {
            arg.move();
         }
       }
       else {
         arg.turnAround();
         while(!arg.leftIsClear()&&arg.frontIsClear()) {
            arg.move();
         }
       }
       if(arg.rightIsClear()) {
         arg.turnRight();
         while(arg.frontIsClear()) {
            arg.move();
         }
       }
       else {
       arg.turnLeft();
         while(arg.frontIsClear()) {
            arg.move();
         }
       }
       if(arg.leftIsClear()) {
         arg.turnLeft();
         while(arg.frontIsClear()) {
            arg.move();
         }
       }
       else {
         arg.turnRight();
         while(arg.frontIsClear()) {
            arg.move();
         }
       }
       if(!arg.frontIsClear()&&arg.leftIsClear()) {
         arg.turnAround();
         arg.move();
       }
       else {
         while(arg.frontIsClear()) {
            arg.move();
         }
       arg.turnRight();
       while(arg.frontIsClear()) {
            arg.move();
         }
       arg.turnLeft();
         while(arg.frontIsClear()) {
            arg.move();
         }
       arg.turnRight();
          while(!arg.leftIsClear()) {
            arg.move();
          }
       }
       if(arg.rightIsClear()) {
         arg.turnRight();
         while(arg.frontIsClear()) {
            arg.move();
         }
       }
       else {
         arg.turnLeft();
         arg.move();
         arg.turnLeft();
         arg.move();
         arg.turnRight();
         while(arg.frontIsClear()) {
            arg.move();
         }
         arg.turnRight();
         while(arg.frontIsClear()) {
            arg.move();
         }
         arg.turnRight();
         while(arg.frontIsClear()) {
            arg.move();
         }
         arg.turnLeft();
         while(!arg.nextToABeeper()) {
            arg.move();
         }
       }
	 }
 }