class Break3 {
  public static void main(String args []) {
    for(int i = 0; i < 3; i++) {
      System.out.println("Out loop count: " + i);
      System.out.print(" .. Inner loop count: ");
      int t = 0;
      while( t< 100) {
        if(t == 10) break;
        System.out.print(t + " ");
        t++;
      }
      System.out.println();
    }
    System.out.println("Loop is complete");
  }
}
