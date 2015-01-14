class ScopeDemo {
  public static void main(String args[]) {
    int x;
    x = 10;
    if(x == 10) {
      int y = 20;
      System.out.println("x is " + x + " and y is " + y);
      x = y * 2;
    }
    // y = 100; y value set outside of scope of if statement
    System.out.println("x is " + x);
  }
}
