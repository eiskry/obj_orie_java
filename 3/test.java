class test{
    static int power(int x, int y){
        int answer =1;
        for (int i=0;i<y;i++){
            answer *=x;
        }
        return answer;
    }
  public static void main(String args[]){
    double k =power(10,5);
    System.out.println(k);
    double l = (double)140/k;
    System.out.println(l);
    
  }
}