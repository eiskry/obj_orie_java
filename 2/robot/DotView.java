interface RobotView {
    public void turn(double oldHeading, double newHeading);
    public void move(double oldX, double oldY,
                     double newX, double newY);
}

public class DotView implements RobotView {
    public void turn(double oldHeading, double newHeading){
    }
    
    public void move(double oldX, double oldY,
                        double newX, double newY){

        double x=(newX-oldX)/5.0;
        double y=(newY-oldY)/5.0;
        System.out.println(oldX+" "+ oldY);
        
        System.out.println(x+" "+ y);
        System.out.println(x*2+" "+ y*2);
        System.out.println(x*3+" "+ y*3);
        System.out.println(x*4+" "+ x*4);

        System.out.println(newX+" "+ newY);
    }
}