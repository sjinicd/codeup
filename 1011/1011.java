import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    //Scanner는 문자를 입력받는 기능이 없다.
    Scanner sc = new Scanner(System.in);
    
    //방법 1
    String c= sc.next();
    char x= c.charAt(0);
    
    //방법 2
    //char x = sc.next().chartAt(0);
    
    System.out.println(x);
  }
}

//charAt() String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
