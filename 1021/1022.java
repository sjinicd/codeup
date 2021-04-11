//nextLine()의 경우에는 문자 혹은 엔터를 치기 전까지의 문장 전체를 입력받는다. 
//next() 는 문자 혹은 문자열을 공백 기준으로 한 단어 또는 한 문자씩 입력을 받는다. 

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
    System.out.println(s);
  }
}
    
