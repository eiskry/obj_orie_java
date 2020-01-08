public class RandomWalk {
    public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot();
        for (int i = 0; i < 10; i++) {
            robot.moveTo(0, 0);
            robot.setHeading(0);
            for (int j = 0; j < 10; j++) {
                if (Math.random() >= 0.5) {
                    robot.turnLeft(20);
                } else {
                    robot.turnRight(20);
                }
                robot.moveForward(10);
            }
        }
    }
}