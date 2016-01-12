package team103.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class Subsystems {

	public static SpeedController leftFrontController;
	public static SpeedController rightFrontController;
	public static SpeedController leftBackController;
	public static SpeedController rightBackController;
	
	public static RobotDrive robotDrive;
	
	public static void init(){
		leftFrontController = new Talon(0);
		rightFrontController = new Talon(1);
		leftBackController = new Talon(2);
		rightBackController = new Talon(3);
		
		robotDrive = new RobotDrive(leftFrontController, leftBackController,
									rightFrontController, rightBackController);
		
		
		
	}
	
}
