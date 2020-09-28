import stanford.karel.*;

public class VotingBox extends SuperKarel {
	public void run() {

		while (frontIsClear()) {

        move();

        checkMiddleBeeper();

        removeExtraBeepers();

        move();

		}

	}

	private void checkMiddleBeeper() {
v
		if (beepersPresent()) {

        move();

        move();

		}

	}

	private void removeExtraBeepers() {

		if (noBeepersPresent()) {

        removeBeepersDown();

        removeBeepersUp();

    }

}

/* Karle standing middle no beeper present 

 * Karel moves down picks beeper if present 

 * returns to the middle facing up

 */

	

	private void removeBeepersDown() {

		turnRight();

		move();

	while (beepersPresent()) {

        pickBeeper();

    }

		turnAround();

		move();

}

/* Karl moves up and picks beepers if present 

 * Karl returns to middle facing east 

 */

	

	private void removeBeepersUp() {


		move();

    if (frontIsClear()) {

        move();

    }

    

    while (beepersPresent()) {

        pickBeeper();

    }

    

    	turnAround();

    	move();

    	turnLeft();

 



    }

		

				

		

}
	