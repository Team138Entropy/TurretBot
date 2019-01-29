package frc.robot.subsystems;

import frc.robot.Constants;
import frc.robot.commands.RunRoller;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Roller extends Subsystem {
    private static WPI_TalonSRX rollerTalon = new WPI_TalonSRX(Constants.talonID);
    
    protected void initDefaultCommand() {
        setDefaultCommand(new RunRoller());
    }

    public synchronized void set(boolean on) {
        rollerTalon.set(ControlMode.PercentOutput, on ? 5.0 : 0);
    }
}