public class FourSquare {
    public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot();
        robot.moveForward(100);  // 「前へ100歩進め」
        //右
        robot.turnLeft(45);     // 「左へ450度回れ」
        for (int i = 0; i < 4; i++) {
            robot.moveForward(100);  // 「前へ50歩進め」
            robot.turnRight(90);
        }
        robot.turnRight(45);

        robot.moveForward(-100);  // 「後ろへ100歩進め」
        robot.turnRight(90);     // 「左へ120度回れ」
        robot.moveForward(100);  // 「前へ100歩進め」

        //下
        robot.turnLeft(45);     // 「左へ450度回れ」
        for (int i = 0; i < 4; i++) {
            robot.moveForward(100);  // 「前へ50歩進め」
            robot.turnRight(90);
        }
        robot.turnRight(45);

        robot.turnRight(180);
        robot.moveForward(200);  // 「後ろへ100歩進め」
        
        //上
        robot.turnLeft(45);     // 「左へ450度回れ」
        for (int i = 0; i < 4; i++) {
            robot.moveForward(100);  // 「前へ50歩進め」
            robot.turnRight(90);
        }
        robot.turnRight(45);

        robot.moveForward(-100);
        robot.turnRight(90);
        robot.moveForward(-100);
        robot.turnRight(180);
        
        //左
        robot.turnLeft(45);     // 「左へ450度回れ」
        for (int i = 0; i < 4; i++) {
            robot.moveForward(100);  // 「前へ50歩進め」
            robot.turnRight(90);
        }
    }
}