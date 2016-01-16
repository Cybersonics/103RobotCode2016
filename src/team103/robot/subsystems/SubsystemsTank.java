package team103.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import team103.robot.Input;

/**
 * Created by Cybersonics 103 on 1/16/2016.
 */
public class SubsystemsTank {

    public static class CIM {
        public static final Talon LeftFront = new Talon(1);
        public static final Talon LeftRear = new Talon(0);
        public static final Talon RightFront = new Talon(3);
        public static final Talon RightRear = new Talon(2);
    }

    public static RobotDrive robotDrive;

    public static void init(){

        robotDrive = new RobotDrive(CIM.LeftFront, CIM.LeftRear, CIM.RightFront, CIM.RightRear);
        robotDrive.setSafetyEnabled(false);

    }

}
