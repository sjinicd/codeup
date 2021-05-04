import java.util.Scanner;

public class Main{
  Scanner sc = new Scanner(System.in);
  
  double a = sc.nextInt();
  double b = sc.nextInt();
  System.out.println("%.0f",a+b);
  
  /*
  %04d 의 의미
 % -  명령의시작
 0 - 채워질 문자
 4 - 총 자리수
 d - 십진정수
 
  int user_no = 30;
  String result_user_no = String.format("%04d", user_no);

  result_user_no 는 0030이 된다.
  */
                          
