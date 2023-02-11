package abstraction;
import java.util.Scanner;

public class abstractclass {
    Scanner scan = new Scanner(System.in);
    abstract class googleassistant
    {
        String voice;
        String assistant;
        String system_type="MAC";

            String functionnn(){

            System.out.println(" Hello Boss jarvis command is loading\n"+"I am jarvis\n"+"The system is"+system_type);
            voice=scan.nextLine();
            return voice;
               }


    }
    class newfuctionadd extends googleassistant{

        void fun(){
            System.out.println("Enter your phone no");
            voice=scan.nextLine();
            System.out.println("Enter your mail");
            voice=scan.nextLine();
            System.out.println("most likely used app");
            voice=scan.nextLine();
        }

    }
    }




