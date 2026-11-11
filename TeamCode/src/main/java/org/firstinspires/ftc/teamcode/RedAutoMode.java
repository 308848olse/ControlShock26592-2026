package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name ="Robot: Autonomous Red Mode", group = "Robot")
public class  RedAutoMode extends LinearOpMode {

    private DcMotor         backLeftDrive   = null;
    private DcMotor         backRightDrive   = null;
    private DcMotor         frontLeftDrive   = null;
    private DcMotor         frontRightDrive   = null;


    @Override
    public void runOpMode() {


        backLeftDrive = hardwareMap.get(DcMotor.class, "BLmotor");
        backRightDrive = hardwareMap.get(DcMotor.class, "BRmotor");
        frontLeftDrive = hardwareMap.get(DcMotor.class, "FLmotor");
        frontRightDrive = hardwareMap.get(DcMotor.class, "FRmotor");

        waitForStart();

        backRightDrive.setPower(1);
        backLeftDrive.setPower(1);
        frontLeftDrive.setPower(1);
        frontRightDrive.setPower(1);
        frontRightDrive.setDirection(DcMotor.Direction.FORWARD);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backRightDrive.setDirection(DcMotor.Direction.FORWARD);
        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);

        while (opModeIsActive()) {