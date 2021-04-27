//8진수로 바꾸어 출력한다.

import java.util.Scanner;

public class Main{
  public class void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String n = sc.nextLine();
    //한문장 출력
    int num = Integer.parseInt(n,16);
    //int n 값 16진수로 형변환
    System.out.println(Integer,toOctalString(num));
    // toOtalString 메소드로 num값 String으로 형변환
  }
}
