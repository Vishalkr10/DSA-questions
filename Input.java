 import java.util.*;
 public class Input{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("type name");
        String name=sc.nextLine();
        System.out.println("type a");
        int a=sc.nextInt();
        System.out.println("type b");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
    }
 }