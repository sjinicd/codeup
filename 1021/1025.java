import java.util.Scanner;

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  String s = sc.next();
  char list[] = new char[s.length()];
  
  for(int i=0;i<s.length();i++){
    list[i]=s.charAt(i);
  }

  for(char i:list){
    System.out.println("'"+i+"'");
    }
  }
}


/*
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  String s = sc.next();
  String a[] = s.split("");
  
  for(int=0; i<a.length; i++)
    System.out.println("'"+a[i]+"'");
    }
   }


*/
  
