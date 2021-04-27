import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    System.out.println(Integer.toHexString(n));
    
    //10진수-> 16진수(소문자)로 출력한다.
