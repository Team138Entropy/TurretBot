package frc.robot.commands;

import frc.robot.OI;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RunRoller extends Command {
    public RunRoller() {
        requires(Robot.roller);
    }

    protected void execute() {
        Robot.roller.set(OI.nykoController.getRawButton(OI.NykoController.leftTrigger));
    }

    protected boolean isFinished() {
        return false;
    }
}