
package org.team5148.chargedup;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

  LeftOne drive = new CANSparkMax();
  LeftTwo drive = new CANSparkMax();
  RightOne drive = new CANSparkMax();
  RightTwo drive = new CANSparkMax();
  XboxController driveController = new XboxController(0);

  @Override
  public void robotInit() {
    
  }

  @Override
  public void robotPeriodic() {

  }

  @Override
  public void autonomousInit() {
    
  }

  @Override
  public void autonomousPeriodic() {

    }
  }

  @Override
  public void teleopInit() {
    frontRight.setInverted(true);
		backRight.setInverted(true);
  }

  @Override
  public void teleopPeriodic() {
    Double ySpeed = driveController.getLeftY();
		Double xSpeed = driveController.getLeftX();
		Double zRotation = driveController.getRightX(); 
		MDrive.driveCartesian(ySpeed, xSpeed, zRotation);
  }

  @Override
  public void disabledInit() {

  }

  @Override
  public void disabledPeriodic() {

  }

  @Override
  public void testInit() {

  }

  @Override
  public void testPeriodic() {

  }
}
