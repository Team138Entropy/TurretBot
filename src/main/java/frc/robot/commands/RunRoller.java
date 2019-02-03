package frc.robot.commands;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.Sensors;

import edu.wpi.first.wpilibj.command.Command;

public class RunRoller extends Command {
    public RunRoller() {
        requires(Robot.roller);
    }

    protected void execute() {
        boolean cargoPresent = Sensors.isCargoPresent();

        // Debug
        System.out.println(Boolean.toString(cargoPresent));

        Robot.roller.set(OI.nykoController.getRawButton(OI.NykoController.leftTrigger)
                         && !cargoPresent
                        );
    }

    protected boolean isFinished() {
        return false;
    }
}