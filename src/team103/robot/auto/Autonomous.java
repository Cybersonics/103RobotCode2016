package team103.robot.auto;

public class Autonomous {

    public Autonomous() {

    }

    public Thread runThread;

    public void start() {
        runThread = new Thread() {
            @Override
            public void run() {

                run();

                try {
                    join();
                } catch (InterruptedException e) {
                    System.out.println("Auton Thread Interupted");
                    e.printStackTrace();
                }
            }
        };
    }

    public void stop() {
        runThread.interrupt();
    }

    private void run() {
        stop();
    }

}
