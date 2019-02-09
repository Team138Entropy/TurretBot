package frc.robot.commands;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.Sensors;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Command;

public class Serial extends Command {
    private SerialPort port = new SerialPort(115200, SerialPort.Port.kUSB);

    public Serial() {
        port.enableTermination();
        requires(Robot.serial);
        System.out.println("hello from Serial.java!");
    }

    protected void execute() {
        String str = port.readString();
        str.trim();

        if(str.length() == 0) return;
        if(str.charAt(0) == '#'){
            System.out.println("serial: " + str);
        }else{
            System.out.println("got angle " + str);
        }
    }

    protected boolean isFinished() {
        return false;
    }
}
