package frc.robot;

import frc.robot.Constants;

import edu.wpi.first.wpilibj.DigitalInput;;

public class Sensors {
    private static DigitalInput proximitySensor = new DigitalInput(Constants.proximitySensorChannel);

    
    public static boolean isCargoPresent() {
        return false;
        // return !proximitySensor.get();
    }
}