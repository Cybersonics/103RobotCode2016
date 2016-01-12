package team103.robot.core;



import edu.wpi.first.wpilibj.IterativeRobot;
import team103.robot.auto.Autonomous;
import team103.robot.teleop.Teleop;
import team103.robot.subsystems.Subsystems;

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
	
	public static Subsystems subsystems;
	public static Autonomous auto;
	public static Teleop teleop;
	
    public void robotInit() {

    	subsystems = new Subsystems();
    	auto = new Autonomous();
    	teleop = new Teleop();
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	auto.start();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        teleop.start();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
