package team103.robot.teleop;

import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import team103.robot.Input;
import team103.robot.Robot;
import team103.robot.subsystems.SubsystemsTank;

public class Teleop {

    public Teleop() {

    }

    private Thread runThread;

    public void start() {

        runThread = new Thread() {
            @Override
            public void run() {
                SubsystemsTank.init();

                loop();

                try {
                    join();
                } catch (InterruptedException e) {
                    System.out.println("Teleop Thread Interupted");
                    e.printStackTrace();
                }
            }
        };
        runThread.start();
    }

    public void stop() {
        runThread.interrupt();
    }

    private void loop() {

        while (RobotState.isOperatorControl() && RobotState.isEnabled()) {
            input();

            SubsystemsTank.robotDrive.tankDrive(Input.Controllers.LeftStick.getRawAxis(1),
                                                Input.Controllers.RightStick.getRawAxis(1));

        }
        stop();
    }

    private void input() {

        

    }

}
