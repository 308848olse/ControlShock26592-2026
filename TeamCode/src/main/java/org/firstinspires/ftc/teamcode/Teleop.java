package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.ftccommon.internal.manualcontrol.commands.MotorCommands;

@TeleOp(name = "Robot: Field Relative Mecanum Drive", group = "Robot")
public class Teleop extends OpMode {
    // This declares the four motors needed
    DcMotor backLeftDrive ;
    DcMotor backRightDrive;
    DcMotor frontLeftDrive;
    DcMotor frontRightDrive;

    // This declares the IMU needed to get the current direction the robot is facing
    IMU imu;

    @Override
    public void init() {
        backLeftDrive = hardwareMap.get(DcMotor.class, "BLmotor");
        backRightDrive = hardwareMap.get(DcMotor.class, "BRmotor");
        frontLeftDrive = hardwareMap.get(DcMotor.class, "FLmotor");
        frontRightDrive = hardwareMap.get(DcMotor.class, "FRmotor");

        backLeftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        frontLeftDrive.setDirection(DcMotorSimple.Direction.REVERSE);

        frontLeftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    }

    @Override
    public void loop() {
        telemetry.addLine("Press A to reset Yaw");
        telemetry.addLine("Hold left bumper to drive in robot relative");
        telemetry.addLine("The left joystick sets the robot direction");
        telemetry.addLine("Moving the right joystick left and right turns the robot");

        if (gamepad1.left_bumper) {
            //(-gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);

        } else {

        }

        float control_v = gamepad1.left_stick_y;
        float control_h = gamepad1.left_stick_x;

        backLeftDrive.setPower(0.4 * ((-control_v - control_h) + gamepad1.right_stick_x));
        backRightDrive.setPower(0.4 * ((-control_v + control_h) - gamepad1.right_stick_x));
        frontLeftDrive.setPower(0.4 * ((control_v - control_h) - gamepad1.right_stick_x));
        frontRightDrive.setPower(0.4 * ((control_v + control_h) + gamepad1.right_stick_x));

    }



}
