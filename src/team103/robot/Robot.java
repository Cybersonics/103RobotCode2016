package team103.robot;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import team103.robot.auto.Autonomous;
import team103.robot.subsystems.SubsystemsSwerve;
import team103.robot.subsystems.SubsystemsSwerve.CIM;
import team103.robot.subsystems.SubsystemsSwerve.Gear;
import team103.robot.subsystems.SubsystemsTank;
import team103.robot.teleop.Teleop;

/*import team103.robot.subsystems.SubsystemsSwerve;
import team103.robot.subsystems.SubsystemsSwerve.CIM;
import team103.robot.subsystems.SubsystemsSwerve.Gear;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */

    public static SubsystemsSwerve subsystems;
    public static Autonomous auto;
    public static Teleop teleop;

    public void robotInit() {

        //subsystems = new SubsystemsSwerve();
        //auto = new Autonomous();
        teleop = new Teleop();

        /*LiveWindow.addActuator("Gearmotors", "LeftFront", Gear.LeftFront);
        LiveWindow.addActuator("Gearmotors", "LeftBack", Gear.LeftBack);
        LiveWindow.addActuator("Gearmotors", "RightFront", Gear.RightFront);
        LiveWindow.addActuator("Gearmotors", "RightBack", Gear.RightBack);

        LiveWindow.addActuator("CIMs", "LeftFront", CIM.LeftFront);
        LiveWindow.addActuator("CIMs", "LeftBack", CIM.LeftBack);
        LiveWindow.addActuator("CIMs", "RightFront", CIM.RightFront);
        LiveWindow.addActuator("CIMs", "RightBack", CIM.RightBack);*/

    }

    //@Override
    public void autonomousInit() {
        //auto.start();
    }

    //@Override
    public void teleopInit() {
        //SubsystemsSwerve.init();
        teleop.start();
    }

    @Override
    public void teleopPeriodic() {

        //LiveWindow.run();

        /*LiveWindow.run();
        //SmartDashboard.putDouble("Enc: ", Controllers.LeftFront.get().getEncPosition());

        double set = 2.0 * Math.PI * (double) i / 500.0;
        for (int j = 0; j < SubsystemsSwerve.talons.length; j++)
            SubsystemsSwerve.talons[j].set(Math.sin(2.0 * Math.PI * (double) j / (double) SubsystemsSwerve.talons.length + set));
        i++;*/
    }

    @Override
    public void testInit() {
        //SubsystemsSwerve.init();
        teleop.start();
    }

    private int i = 0;

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }

}







