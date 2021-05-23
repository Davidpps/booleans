package ejercicios;

import java.util.Scanner;

public class StdinStdout {public static void main(String[] args) {
    /*Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();             

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);*/
            
    /*
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
    int a=sc.nextInt();
    System.out.println(a); */
    
    Scanner scan = new Scanner(System.in);
    for(int i=0;i<3;i++)
    { 
        int a=scan.nextInt();
        System.out.println(a); 
    }
    scan.close();
            
}
    
}




