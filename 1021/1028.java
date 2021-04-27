//입력된 정수 그대로 출력한다.

\import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //자바에는 unsigned int가 존재하지 않는다.
    //따라서 범위가 더 큰 long 을 사용한다.
    long n = sc.nextLong();
    
    System.out.println(n);
  }
}


