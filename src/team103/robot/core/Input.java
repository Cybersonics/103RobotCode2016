package team103.robot.core;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class Input {

	public static enum Controllers{
		
		LeftStick(new Joystick(0)),
		RightStick(new Joystick(1)),
		OperatorStick(new Joystick(2));
		
		private Joystick joystick;
		
		Controllers(Joystick joystick){
			this.joystick = joystick;
		}
		
		public Joystick getStick(){
			return joystick;
		}
		
	}
	
	public static enum Buttons{
		Button1(1),
		Button2(2);
		
		private int numVal;
		
		Buttons(int numVal){
			this.numVal = numVal;
		}
		
		public int getButton(){
			return numVal;
		}
		
	}
	
	interface ButtonCommand{
		void function();
	}
	
	public static void buttonPressed(int buttonCode, Joystick joystick, ButtonCommand command){
		new JoystickButton(joystick, buttonCode).whenPressed(new Command() {
			
			Thread commandThread;
			
			@Override
			protected boolean isFinished() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			protected void interrupted() {
				commandThread.interrupt();
			}
			
			@Override
			protected void initialize() {
			}
			
			@Override
			protected void execute() {
				commandThread = new Thread(){
					@Override
					public void run(){
						command.function();
						try {
							join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
			}
			
			@Override
			protected void end() {
			}
		});
	}
	
}
