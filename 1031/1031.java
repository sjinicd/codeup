import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    System.out.println(Integer.toOctalString(n));
  }
}


//10진수 -> 8진수 String
//java.lang패키지에 있는 Integer클래스는
//10진수 값을 8진수로 바꾸고 8진수를 10진수로 바꿔주는 함수를 지원한다.
