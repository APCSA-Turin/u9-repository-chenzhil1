package U9T1Lab2;


public class Laptop extends Computer{
    private boolean trackPadCalibrated;


    public Laptop(int screenSize, int memory) {
        super(screenSize, memory);
        trackPadCalibrated = false;
    }


    public boolean isTrackPadCalibrated() {
        return trackPadCalibrated;
    }


    public void calibrateTrackpad() {
        if (!trackPadCalibrated) {
            trackPadCalibrated = true;
            System.out.println("Calibration complete!");
        } else {
            System.out.println("No need to calibrate");
        }
    }
}

