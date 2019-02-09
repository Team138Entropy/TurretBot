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
        // System.out.println(Boolean.toString(cargoPresent));

        Boolean isLeft = OI.nykoController.getRawButton(OI.NykoController.leftTrigger);
        Boolean isRight = OI.nykoController.getRawButton(OI.NykoController.rightTrigger);

        // System.out.println("left " + isLeft + " right " + isRight);
        if(isLeft){
            Robot.roller.set(true, false);
        }else if(isRight){
            Robot.roller.set(true, true);
        }else{
            Robot.roller.set(false, false);
        }
    }

    protected boolean isFinished() {
        return false;
    }
}