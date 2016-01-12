package team103.robot.core;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Input {

	//public static Joystick leftStick = new Joystick(1);
	//public static Joystick rightStick = new Joystick(2);
	//public static JoystickButton button1 = new JoystickButton(leftStick, 1);

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
	
	public static boolean isPressed(int buttonCode, Joystick joystick){
		return joystick.getRawButton(buttonCode);
	}
	
}
