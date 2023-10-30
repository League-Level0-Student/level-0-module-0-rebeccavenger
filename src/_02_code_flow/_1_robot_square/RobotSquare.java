package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	
    public static void main(String[] args){
    	Robot rob = new Robot ();
    	rob.penDown();
    	rob.setSpeed(5);
    	int count  = 0;
    	while (count < 4) {
    	rob.move(100);  	
rob.turn(90);
count = count + 1;
    	}

    	
    	// INCREASE COUNT. Add one to the number of sides that have now been drawn like this:
    		  /**     count += 1;    **/

    	
    	// Run the program. Did the Robot draw a line and turn?
    	 
    	
        // LOOP.  Make a while loop and move the DRAW, TURN, and INCREASE COUNT code 
    	//        so it is between the curly braces like the example below. 
    	//        The code in the loop will now repeat 4 times to draw a square.
    	
    	/**     while ( count < 4 ) { 
    	 *            DRAW
    	 *            TURN
    	 *            INCREASE COUNT
    	 *      }
    	 **/
    	
    	
    	// Run the program again. Did your Robot draw a square?


    }
}
