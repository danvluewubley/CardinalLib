package org.lib.cardinallib.field;
import org.lib.cardinallib.math.Pose2d;

public class RobotElement extends GameElement {
    private Pose2d pose;

    public RobotElement(double x, double y, double orientation) {
        super(x, y, orientation);
        pose = new Pose2d(x, y, orientation);
    }

    @Override
    public void update(double x, double y, double orientation) {
        pose.set(x, y, orientation);
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    @Override
    public Pose2d getPose() {
        return pose;
    }

}
