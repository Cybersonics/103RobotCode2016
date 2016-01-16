package team103.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.RobotDrive;

public class SubsystemsSwerve {

    public static final CANTalon[] talons = new CANTalon[]{Gear.LeftFront, Gear.LeftBack, Gear.RightFront, Gear.RightBack, CIM.LeftFront, CIM.LeftBack, CIM.RightFront, CIM.RightBack};

    public static class CIM {
        public static final CANTalon LeftFront = new CANTalon(8);
        public static final CANTalon LeftBack = new CANTalon(7);
        public static final CANTalon RightFront = new CANTalon(4);
        public static final CANTalon RightBack = new CANTalon(3);
    }

    public static class Gear {
        public static final CANTalon LeftFront = new CANTalon(6);
        public static final CANTalon LeftBack = new CANTalon(5);
        public static final CANTalon RightFront = new CANTalon(2);
        public static final CANTalon RightBack = new CANTalon(1);
    }

    public static RobotDrive robotDrive;

    public static void init() {

        robotDrive = new RobotDrive(CIM.LeftFront, CIM.LeftFront,
                CIM.LeftFront, CIM.LeftFront);

        robotDrive.setSafetyEnabled(false);

        Gear.LeftFront.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
        Gear.LeftBack.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
        Gear.RightFront.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
        Gear.RightBack.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
        CIM.LeftFront.reset();
        CIM.LeftFront.enable();
        CIM.LeftFront.setSafetyEnabled(false);
        CIM.LeftFront.setEncPosition(0);
        CIM.LeftFront.setPID(1.0, 0.0, 0.0);
        CIM.LeftFront.changeControlMode(CANTalon.TalonControlMode.Position);
        CIM.LeftFront.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
        CIM.LeftFront.set(400);

        Gear.LeftFront.setSafetyEnabled(false);
        Gear.LeftFront.setEncPosition(0);
        Gear.LeftFront.setPID(1.0, 0.0, 0.0);
        Gear.LeftFront.changeControlMode(CANTalon.TalonControlMode.Position);
        Gear.LeftFront.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
        Gear.LeftFront.set(200);

        //while(true) {SmartDashboard.putDouble("Enc: ", CIM.LeftFront.getEncPosition());}


        CIM.LeftFront.reset();
        CIM.LeftFront.enable();
        Gear.LeftFront.setSafetyEnabled(false);
        Gear.LeftFront.setEncPosition(0);
        Gear.LeftFront.setPID(1.0, 0.0, 0.0);
        Gear.LeftFront.changeControlMode(CANTalon.TalonControlMode.Position);
        Gear.LeftFront.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
        Gear.LeftFront.set(200);


        //Jacob Code 1
        Gear.LeftBack.reset();
        Gear.LeftFront.reset();
        Gear.RightBack.reset();
        Gear.RightFront.reset();
        Gear.LeftBack.enable();
        Gear.LeftFront.enable();
        Gear.RightBack.enable();
        Gear.RightFront.enable();
        Gear.LeftBack.set(5000);
        Gear.LeftFront.set(5000);
        Gear.RightBack.set(5000);
        Gear.RightFront.set(5000);

        //JacobCode2
        CIM.LeftFront.reset();
        CIM.RightBack.reset();
        CIM.RightFront.reset();
        CIM.LeftBack.enable();
        CIM.LeftFront.enable();
        CIM.RightBack.enable();
        CIM.RightFront.enable();
        CIM.LeftBack.set(5000);
        CIM.LeftFront.set(5000);
        CIM.RightBack.set(5000);
        CIM.RightFront.set(5000);

        for (CANTalon talon : talons) {
            talon.setSafetyEnabled(false);
            talon.changeControlMode(TalonControlMode.PercentVbus);
        }
    }
}



