import java.util.Scanner;

public class Main{
  Scanner sc = new Scanner(System.in);
  
  String s = sc.next();
  String list[] = s.split(":");
  
  //주소값을 비교할때는 "=="
  //내용값을 비교할때는 "equals"
  if(list[1].equals("00"))
      System.out.println("0");
  else
    System.out.println(list[1]);
  }
}
