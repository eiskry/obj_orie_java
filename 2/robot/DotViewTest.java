public class DotViewTest {
    public static void main(String[] args) {
        RobotModel robot = new RobotModel();
        RobotView view = new DotView();
        robot.setView(view);
        for (int i = 0; i < 3; i++) {
            robot.moveForward(100);
            robot.turnLeft(90);
            // robot.turnLeft(120);
        }
        // robot.turnLeft(120);
        // robot.moveForward(50);
        // robot.turnLeft(90);
        // robot.moveForward(100);
    }
}