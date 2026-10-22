package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.ftccommon.internal.manualcontrol.commands.MotorCommands;

@TeleOp(name = "TeleOp", group = "Robot")
public class Teleop extends OpMode {
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

<<<<<<< Updated upstream:TeamCode/src/main/java/org/firstinspires/ftc/teamcode/Teleop.java
        float control_y = gamepad1.left_stick_y;
        float control_x = gamepad1.left_stick_x;
        float rotation = gamepad1.right_stick_x;
        float control_speed = gamepad1.left_trigger;
=======
        if (gamepad1.left_bumper) {
            drive(-gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);
        } else {
            driverFieldRelative(-gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);

        }

        backLeftDrive.setPower(gamepad1.left_stick_y);
        backRightDrive.setPower(gamepad1.right_stick_x);
        frontLeftDrive.setPower(gamepad1.left_stick_y);
        frontRightDrive.setPower(gamepad1.right_trigger);
>>>>>>> Stashed changes:TeamCode/src/main/java/org/firstinspires/ftc/teamcode/Telep.java

        backLeftDrive.setPower(control_speed * (-control_y - control_x + rotation));
        backRightDrive.setPower(control_speed * (-control_y + control_x - rotation));
        frontLeftDrive.setPower(control_speed * (control_y - control_x - rotation));
        frontRightDrive.setPower(control_speed * (control_y + control_x + rotation));

    }

    private void drive(float v, float leftStickX, float rightStickX) {
    }

    private void driverFieldRelative(float v, float leftStickX, float rightStickX) {
    }


}
