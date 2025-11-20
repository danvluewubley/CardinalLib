package org.lib.cardinallib.math;

public class DistFormula {
    private Pose2d robot;
    private Pose2d goal;

    public DistFormula(Pose2d robot, Pose2d goal) {
        this.robot = robot;
        this.goal = goal;
    }

    public double getDistance() {
        double dx = robot.x - goal.x;
        double dy = robot.y - goal.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}