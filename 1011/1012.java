import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    float x= sc.nextFloat();
    String s = String.format("%.6f",x);
    
    System.out.println(s);
  }
}
