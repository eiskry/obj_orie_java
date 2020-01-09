interface RobotView {
    public void turn(double oldHeading, double newHeading);
    public void move(double oldX, double oldY,
                     double newX, double newY);
}

public class DotView implements RobotView {
    public void turn(double oldHeading, double newHeading){
    }
    
    public void move(double oldX, double oldY,double newX, double newY){
        // System.out.println(oldX+" "+ oldY);
        // System.out.println(newX+" "+ newY);

        //何等分するか
        int t=5;
        
        //移動する前、移動した後を結ぶ直線
        //y=Ax+B
        double A=(newY-oldX)/(newX-oldX);
        double B=oldY-A*oldX;


        //y軸と平行
        if (newX==oldX){
            for(int i=0;i<t;i++){
                double Y =(newY-oldY)/t*i;
                System.out.println(oldX+" "+(oldY+Y));
            }
            System.out.println(newX+" "+newY);
        }
        //x軸と平行
        else if(newY==oldY){
            for(int i=0;i<t;i++){
                double X =(newX-oldX)/t*i;
                System.out.println((oldX+X)+" "+newY);
            }
            System.out.println(newX+" "+newY);
        }
        //直線
        else {
            for(int i=0;i<t;i++){
                double X =(newX-oldX)/t*i;
                System.out.println((oldX+X)+" "+A*(oldX+X)+B);
            }
            System.out.println(newX+" "+newY);
        }
    }
}