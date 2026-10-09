//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//@Autonomous(name="Robot: Auto Drive By Encoder", group="Robot")
//@Disabled
//public class RedAutonomus {
////
////    /* Declare OpMode members. */
////    private DcMotor         LeftDrive   = null;
////    private DcMotor         RightDrive  = null;
////
////
////    private ElapsedTime     runtime = new ElapsedTime();
////
////    static final double     COUNTS_PER_MOTOR_REV    = 1440 ;    // eg: TETRIX Motor Encoder
////    static final double     DRIVE_GEAR_REDUCTION    = 1.0 ;     // No External Gearing.
////    static final double     WHEEL_DIAMETER_INCHES   = 4.0 ;     // For figuring circumference
////    static final double     COUNTS_PER_INCH         = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /
////                                                      (WHEEL_DIAMETER_INCHES * 3.1415);
////    static final double     DRIVE_SPEED             = 0.6;
////    static final double     TURN_SPEED              = 0.5;
////
////    @Override
////    public void runOpMode() {
////
////        // Initialize the drive system variables.
////        leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
////        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
////
////        leftDrive.setDirection(DcMotor.Direction.REVERSE);
////        rightDrive.setDirection(DcMotor.Direction.FORWARD);
////
////        leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
////        rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
////
////        leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
////        rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
////
////        // Send telemetry message to indicate successful Encoder reset
////        telemetry.addData("Starting at", "%7d :%7d",
////                leftDrive.getCurrentPosition(),
////                rightDrive.getCurrentPosition());
////        telemetry.update();
////
////        // Wait for the game to start (driver presses START)
////        waitForStart();
////
////        // Step through each leg of the path,
////        // Note: Reverse movement is obtained by setting a negative distance (not speed)
////        encoderDrive(DRIVE_SPEED, 48, 48, 5.0);  // S1: Forward 47 Inches with 5 Sec timeout
////        encoderDrive(TURN_SPEED, 12, -12, 4.0);  // S2: Turn Right 12 Inches with 4 Sec timeout
////        encoderDrive(DRIVE_SPEED, -24, -24, 4.0);  // S3: Reverse 24 Inches with 4 Sec timeout
//    }