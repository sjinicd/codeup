//[기초-입출력] 단어 1개 입력받아 나누어 출력하기(설명)

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      int len = a.length();
      for(int i=0<len; i++){
        System.out.printf("\'%c\'\n", a.charAt(i));
        //for문안에서 \'%c\'값을 하나씩 공백추가해서 
      }
  }
