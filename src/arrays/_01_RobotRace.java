package arrays;



import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static int add = 50;
	static int win =0;	
	static int wins =0;
	static int numberOf;
	static int numberOf2;
	//1. make a main method
	public static void main(String[] args) {
		_01_RobotRace race = new _01_RobotRace();
		Random ran = new Random();
		numberOf = ran.nextInt(8);
		numberOf+=1;
		int randomAdd = 800/numberOf;
	//2. create an array of 5 robots.
		Robot[] robs = new Robot[numberOf];
	//3. use a for loop to initialize the robots.
		for(int r = 0; r< robs.length; r++) {
			
			robs[r] = new Robot(); 
			robs[r].setX(add);
			robs[r].setY(550);
			add+=randomAdd;
		}
	//4. make each robot start at the bottom of the screen, side by side, facing up
		while(win==0) {
			

		for(int r = 0; r< robs.length; r++) {
			Random run = new Random();
			robs[r].setSpeed(10);
			robs[r].move(run.nextInt(100));
			if(robs[r].getY()<1) {
				win = 1;
				JOptionPane.showMessageDialog(null, "Robot " + r + " WON!");
				for(int rs = 0; rs< robs.length; rs++) {
					robs[rs].hide();
					robs[rs].clear();
					
				}}}}
					race.Circles();
				
			
	}
		void Circles() {
		
		Random rand = new Random();
		numberOf2 = rand.nextInt(8);
		numberOf2+=1;
		int randomAddd = 160/numberOf2;
	//2. create an array of 5 robots.
		Robot[] robots = new Robot[numberOf2];
		add = 10;
	//3. use a for loop to initialize the robots.
		for(int r = 0; r< robots.length; r++) {
			
			robots[r] = new Robot(); 
			robots[r].miniaturize();
			robots[r].setX(200);
			robots[r].setY(add);
			robots[r].setAngle(90);
			robots[r].show();
			add+=randomAddd;
		}
	//4. make each robot start at the bottom of the screen, side by side, facing up
		while(wins==0) {
			

		for(int r = 0; r< robots.length; r++) {
			Random runs = new Random();
			robots[r].setSpeed(10);
			robots[r].move(runs.nextInt(100));
			if(robots[r].getX()>500) {
				robots[r].turn(45);
				robots[r].move(75);
				
			}
			if(robots[r].getX()<100) {
				robots[r].turn(45);
				robots[r].move(50);
				
				
			}
			if(robots[r].getY()<1) {
				wins = 1;
				JOptionPane.showMessageDialog(null, "Robot " + r + " WON!");
				System.exit(0);
			}
		}
		}
		
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}}
	
	
	

