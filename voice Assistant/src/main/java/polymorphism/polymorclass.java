package polymorphism;
import java.util.Scanner;

public class polymorclass {

    Scanner scan=new Scanner(System.in);


         public int Adding(int a,int b){
            System.out.println("Enter two number to add  :  ");
             scan.nextInt();
            return a+b;
        }

        public int Adding(int a,int b,int c){

            System.out.println("Enter three number to add  :  ");
             scan.nextInt();
             return a+b+c;
        }





}
