package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name ="Robot: Autonomous Red Mode", group = "Robot")
public class  RedAutoMode extends LinearOpMode {

    private DcMotor         backLeftDrive   = null;
    private DcMotor         backRightDrive   = null;
    private DcMotor         frontLeftDrive   = null;
    private DcMotor         frontRightDrive   = null;


    private ElapsedTime         runtime = new ElapsedTime();

    static final double     FORWARD_SPEED = 0.6;
    static final double     TURN_SPEED    = 0.5;

    @Override
    public void runOpMode() {


        backLeftDrive = hardwareMap.get(DcMotor.class, "BLmotor");
        backRightDrive = hardwareMap.get(DcMotor.class, "BRmotor");
        frontLeftDrive = hardwareMap.get(DcMotor.class, "FLmotor");
        frontRightDrive = hardwareMap.get(DcMotor.class, "FRmotor");

        frontRightDrive.setDirection(DcMotor.Direction.FORWARD);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backRightDrive.setDirection(DcMotor.Direction.FORWARD);
        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Status", "Ready to run");
        telemetry.update();

        waitForStart();

        backLeftDrive.setPower(TURN_SPEED);
        backRightDrive.setPower(-TURN_SPEED);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.3)) {
            telemetry.addData("Path", "Leg 2: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();

            backLeftDrive.setPower(1);
            backRightDrive.setPower(1);

            telemetry.addData("Path", "Complete");
            telemetry.update();
            sleep(1000);

        }

    }

}



