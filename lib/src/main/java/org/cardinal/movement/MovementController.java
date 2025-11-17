package org.cardinal.movement;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class MovementController {

    private DcMotor topLeft, topRight, bottomLeft, bottomRight;

    public MovementController(LinearOpMode opMode) {
        topLeft = opMode.hardwareMap.get(DcMotor.class, "topLeft");
        topRight = opMode.hardwareMap.get(DcMotor.class, "topRight");
        bottomLeft = opMode.hardwareMap.get(DcMotor.class, "bottomLeft");
        bottomRight = opMode.hardwareMap.get(DcMotor.class, "bottomRight");
    }

    public void drive(double power) {
        topLeft.setPower(power);
        topRight.setPower(power);
        bottomLeft.setPower(power);
        bottomRight.setPower(power);
    }
}