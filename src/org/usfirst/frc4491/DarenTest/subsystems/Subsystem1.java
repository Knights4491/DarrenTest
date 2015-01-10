// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4491.DarenTest.subsystems;

import org.usfirst.frc4491.DarenTest.RobotMap;
import org.usfirst.frc4491.DarenTest.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Subsystem1 extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput limitSwitch1 = RobotMap.subsystem1LimitSwitch1;
    SpeedController speedController1 = RobotMap.subsystem1SpeedController1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new Command1());
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void avance(double speed)
    {
    	double realSpeed = 0;
    	
    	if (limitSwitch1.get())
    	{
    		realSpeed = speed;
    	}
    	else if (Math.abs(speed) > 0.3 &&
    			 Math.abs(speed) < 0.4)
    	{
    		realSpeed = 0.9;
    	}
    	else
    	{
    		realSpeed = speed/2;
    	}
    	
    	speedController1.set(realSpeed);
    }
}

