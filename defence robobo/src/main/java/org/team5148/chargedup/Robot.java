package org.team5148.chargedup;

//import com.revrobotics.CANSparkMax;
//import com.revrobotics.SparkMax;
//import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.XboxController;


//import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

	//CANSparkMax frontLeft = new CANSparkMax(1, MotorType.kBrushless);
	//CANSparkMax frontRight = new CANSparkMax(3, MotorType.kBrushless);
	//CANSparkMax backLeft = new CANSparkMax(2, MotorType.kBrushless);
	//CANSparkMax backRight = new CANSparkMax(4, MotorType.kBrushless);
	XboxController driveController = new XboxController(0);
	//MecanumDrive MDrive = new MecanumDrive(frontLeft , backLeft , frontRight , backRight);

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
		//MDrive.driveCartesian(ySpeed, xSpeed, zRotation);
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