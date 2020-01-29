class test{
    static int power(int x, int y){
        int answer =1;
        for (int i=0;i<y;i++){
            answer *=x;
        }
        return answer;
    }
  public static void main(String args[]){
    int k =power(10,0);
    System.out.println(k);
    
  }
}