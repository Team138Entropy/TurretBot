package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

    // Nyko Air Flow Controller Map
    private static final int nykoControllerPort = 0;

    public static class NykoController extends Joystick {

        // Buttons
        public static final int button1 = 1;
        public static final int button2 = 2;
        public static final int button3 = 3;
        public static final int button4 = 4;
        public static final int leftBumper = 5;
        public static final int rightBumper = 6;
        public static final int leftTrigger = 7;
        public static final int rightTrigger = 8;
        public static final int middle9 = 9;
        public static final int middle10 = 10;
        public static final int middle11 = 11;
        public static final int leftStick = 12;
        public static final int rightStick = 13;
        
        // Axes
        public static final int leftXAxis = 0;		// X Axis on Driver Station
        public static final int leftYAxis = 1;		// Y Axis on Driver Station
        public static final int rightYAxis = 2;	// Z Axis on Driver Station
        public static final int rightXAxis = 3;	// Rotate Axis on Driver Station

        public NykoController(int port) {
            super(port);
        }

    }
    
    public static NykoController nykoController = new NykoController(nykoControllerPort);
}