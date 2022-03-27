import java.util.Scanner;
class Main{
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
    System.out.println("Liczby nieparzyste z przedziału 50-100 to:");

    for(double c=0; c<=300;  c+=20) {
      double a=c*1.8+32;
      System.out.println("c= " + c + "C =" + a);
}
}
}