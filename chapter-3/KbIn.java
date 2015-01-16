class KbIn {
  public static void main(String args [])
    throws java.io.IOException {
      char ch;
      System.out.print("Please a key follow by ENTER");
      ch = (char) System.in.read();
      System.out.println("Your key is: " + ch);
    }
}
