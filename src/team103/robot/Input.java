package team103.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class Input {

    public static class Controllers {
        public static final Joystick LeftStick = new Joystick(0);
        public static final Joystick RightStick = new Joystick(1);
        public static final Joystick Operator = new Joystick(2);
    }

    interface ButtonCommand {
        void function();
    }

    public static void buttonPressed(int buttonCode, Joystick joystick, ButtonCommand cmd) {
        new JoystickButton(joystick, buttonCode).whenPressed(new Command() {

            Thread commandThread;

            @Override
            protected boolean isFinished() {
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
                commandThread = new Thread() {
                    @Override
                    public void run() {
                        //cmd.function();
                        try {
                            join();
                        } catch (InterruptedException e) {
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
