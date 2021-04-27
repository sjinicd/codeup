import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String n = sc.nextLine();
    //next() 는 문자 혹은 문자열을 공백 기준으로 한 단어 또는 한 문자씩 입력을 받는다. ex.Hello
    //nextLine() 는 스페이스바로 띄어쓰기 한 문장 전체를 읽어 낼 수 있다. ex.Hello World
    //문자열로 입력받은 후,
    // Integer.parseInt(문자열, 원하는 진수)
    
    int num = Integer.parseInt(n,8);
    //8진수로 변환
    System.out.println(num);
  }
}
