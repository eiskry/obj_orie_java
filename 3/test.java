class test{
    static int power(int x, int y){
        int answer =1;
        for (int i=0;i<y;i++){
            answer *=x;
        }
        return answer;
    }
  public static void main(String args[]){
    double k =power(10,1);
    System.out.println(1/k);
    double l = (double)1/(double)170;
    System.out.println(l);
    
  }
}