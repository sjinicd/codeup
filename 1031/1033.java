//16진수(대문자)로 출력한다.

import java.util.Scanner;

public class Main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  
  int n = sc.next();
  
  System.out.println(Integer.toHexString(n).toUpperCase());
  }
}

//toUpperCase() : 문자열을 모두 대문자로 변환해준다.
//toLowerCase() : 문자열을 모두 소문자로 변환해준다.
