interface RobotView {
    public void turn(double oldHeading, double newHeading);
    public void move(double oldX, double oldY,
                     double newX, double newY);
}

public class DotView implements RobotView {
    public void turn(double oldHeading, double newHeading){
    }
    
    public void move(double oldX, double oldY,double newX, double newY){
        //何等分するか
        int t=5;
        
        //y軸と平行 newX==oldX
        // if ( (Math.abs((newX-oldX))) < (1/(10*10*10)) ){
        if (newX==oldX){
            newX=oldX;
            for(int i=0;i<t;i++){
                double Y =(newY-oldY)/t*i;
                System.out.println(oldX+" "+(oldY+Y));
            }
            System.out.println(oldX+" "+newY);
        }
        // x軸と平行 newY==oldY
        // else if( (Math.abs((newY-oldY))) < (1/(10*10*10)) ){
        else if(newY==oldY){
            newY=oldY;
            for(int i=0;i<t;i++){
                double X =(newX-oldX)/t*i;
                System.out.println((oldX+X)+" "+newY);
            }
            System.out.println(newX+" "+oldY);
        }
        //直線
        else {
            //移動する前、移動した後を結ぶ直線
            //y=Ax+B
            double A=(newY-oldX)/(newX-oldX);
            double B=oldY-A*oldX;
            for(int i=0;i<t;i++){
                double X =(newX-oldX)/t*i;
                double Y =A*(oldX+X)+B;
                System.out.println((oldX+X)+" "+Y);
                // System.out.print(String.format("%.1f", oldX+X));
                // System.out.print(" ");
                // System.out.println(String.format("%.1f", Y));
            }
            System.out.println(newX+" "+newY);
            // System.out.print(String.format("%.1f", newX));
            // System.out.print(" ");
            // System.out.println(String.format("%.1f", newY));
        }
    }
}