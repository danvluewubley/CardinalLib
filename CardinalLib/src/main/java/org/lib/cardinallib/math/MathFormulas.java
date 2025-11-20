package org.lib.cardinallib;

public class Math {
    public static double AngleFormula(Pose2d robot, Pose2d goal) {
        double dx = goal.x - robot.x;
        double dy = goal.y - robot.y;
        return Math.atan2(dy, dx);
    }

    public static double DistFormula(Pose2d robot, Pose2d goal) {
        double dx = robot.x - goal.x;
        double dy = robot.y - goal.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

//    public static double PowerConversion() {}

}