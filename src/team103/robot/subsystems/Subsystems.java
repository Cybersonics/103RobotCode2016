package team103.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;

public class Subsystems {
	
	public static enum Controllers {
	
		LeftFront(new CANTalon(0)),
		LeftBack(new CANTalon(1)),
		RightFront(new CANTalon(2)),
		RightBack(new CANTalon(3));
		
		private CANTalon speedController;
		
		Controllers(CANTalon speedController){
			this.speedController = speedController;
		}
		
		public CANTalon get(){
			return speedController;
		}
		
		public int getID(){
			return speedController.getDeviceID();
		}
	}
	
	/*public static enum Encoders {
		
		LeftFront(new Encoder(0, Controllers.LeftFront.getID()));
		
		private Encoder encoder;
		
		Encoders(Encoder encoder){
			this.encoder = encoder;
		}
		
		public Encoder get(){
			return encoder;
		}
	}*/
	
	/*public static enum PID {
		
		LeftFront(new PIDController(Controllers.LeftFront.get().getP(),
				Controllers.LeftFront.get().getI(),
				Controllers.LeftFront.get().getD(),
				Controllers.LeftFront.get().,
				Controllers.LeftFront.get()));
		
		private PIDController pidController;
		
		PID(PIDController pidController){
			this.pidController = pidController;
		}
		
	}*/
	
	public static RobotDrive robotDrive;
	
	public static void init(){
		
		robotDrive = new RobotDrive(Controllers.LeftFront.get(), Controllers.LeftBack.get(),
				                    Controllers.RightFront.get(), Controllers.RightBack.get());

        Controllers.LeftFront.get().setPID(1.0, 0.0, 0.0);
        Controllers.LeftFront.get().changeControlMode(CANTalon.ControlMode.Position);
        Controllers.LeftFront.get().setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
        Controllers.LeftFront.get().set(12);

	}
	
}
