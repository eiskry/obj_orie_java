interface RobotView {
    public void turn(double oldHeading, double newHeading);
    public void move(double oldX, double oldY,
                     double newX, double newY);
}

class DotView implements RobotView {
	public void turn(double oldHeading, double newHeading) {

	}

	public void move(double oldX, double oldY,
			double newX, double newY) {
		for (int i = 0; i < 6; i++) {
			double p = (newX - oldX) / 5;
			double q = (newY - oldY) / 5;
			System.out.println((oldX + p * i) + " " + (oldY + q * i));
		}
	}
}