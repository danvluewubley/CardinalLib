package org.lib.cardinallib.field;
import org.lib.cardinallib.math.Pose2d;

public class GoalElement extends GameElement {
    private Pose2d pose;

    public GoalElement (double x, double y) {
        super(x, y, 0);
        pose = new Pose2d(x, y, 0);
    }

    @Override
    public void update(double x, double y, double orientation) {
        pose.set(x, y, 0);
        this.x = x;
        this.y = y;
        this.orientation = 0;
    }

    public Pose2d getPose() {
        return pose;
    }

}
