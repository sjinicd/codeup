import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    double d = sc.nextDouble();
    
    System.out.println(String.format("%.011f",d));
  }
}
