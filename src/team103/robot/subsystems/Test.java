package team103.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;

public class Test {

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
}
