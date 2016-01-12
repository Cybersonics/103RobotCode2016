package team103.robot.teleop;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotState;
import team103.robot.core.Input;
import team103.robot.core.Input.Buttons;
import team103.robot.core.Input.Controllers;
import team103.robot.core.Robot;

public class Teleop {

	public Teleop() {
		
	}
	
	public Thread runThread;
	
	public void start(){
	
		runThread = new Thread(){
			@Override
			public void run(){
				Robot.subsystems.robotDrive.tankDrive(Input.Controllers.LeftStick.getStick(), 
						  Input.Controllers.RightStick.getStick());

				loop();
				
				try {
					join();
				} catch (InterruptedException e) {
					System.out.println("Teleop Thread Interupted");
					e.printStackTrace();
				}
			}
		};
	}
	
	public void stop(){
		runThread.interrupt();
	}
	
	private void loop(){
		
		while(RobotState.isOperatorControl() && RobotState.isEnabled()){
			input();
			
			
			
		}
		stop();
	}

	private void input(){
		
		if(Input.isPressed(Buttons.Button1.getButton(), Controllers.LeftStick.getStick())){
			
		}
		
	}
	
}
