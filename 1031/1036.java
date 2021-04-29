//아스키코드 값을 10진수로 출력한다.

import java.util.Scanner;

public class Main{
  public static void main(Stringp[] args){
    Scanner sc = sc.next(System.in);
    //next(), nextLine()은 Scanner 클래스의 메소드이다. 공통점은 둘다 문자열을 반환시켜준다는 점이고,
    //차이점은 개행문자를 무시하냐 안하냐의 차이라고 할 수 있다.
    char c = sc.nextLine().charAt(0);
    //charAt()메소드로 nextLine()에 뽑아준 값에서 0번째 값만 뽑아준다.
    int n = (int)c;
    //10진수로 출력한다.
    System.out.println(n);
  }
}
    
    
