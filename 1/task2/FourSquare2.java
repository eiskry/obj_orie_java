public class FourSquare2 {
    public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot();
        for (int t=0;t<4;t++)
        {
            robot.moveForward(100);  // 「前へ100歩進め」
            //右
            robot.turnLeft(45);     // 「左へ45度回れ」
            for (int i = 0; i < 4; i++) {
                robot.moveForward(100);  // 「前へ100歩進め」
                robot.turnRight(90);  // 「右へ90度回れ」
            }
            robot.turnRight(45); // 「右へ45度回れ」

            robot.moveForward(-100);  // 「後ろへ100歩進め」
            robot.turnRight(90); // 「右へ90度回れ」
        }
    }
}
