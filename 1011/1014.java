import java.util.Scanner;

public class Main{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //방법1
    String s= sc.nextLine();
    
    char a=s.charAt(0);
    char b=s.charAt(2);
    
    System.out.println(a+" "+b);
    
    //방법2
    //char a= sc.next().charAt(0);
    //char b= sc.next().charAt(0);
    //System.out.println(b+""+a);
    }
 }
