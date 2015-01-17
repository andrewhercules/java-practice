class SqrRoot {
  public static void main (String args []) {
    double num, sqRoot, rerror;
    for(num = 1.0; num < 100.0; num++) {
      sqRoot = Math.sqrt(num);
      System.out.println("The square root of " + num + " is " + sqRoot);
      rerror = num - (sqRoot * sqRoot);
      System.out.println("The rounding error is " + rerror);
      System.out.println();
    }
  }
}
