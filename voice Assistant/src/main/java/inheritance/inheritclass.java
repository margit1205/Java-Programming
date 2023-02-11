package inheritance;
import java.util.Scanner;

public class inheritclass {
     String song;
    Scanner scan = new Scanner(System.in);
    String company;
    String secret;
    int userwork;
    String user;





        public void getdetails () {
        System.out.println("Hey this is your voice assistance ");
        System.out.println("What is your Good Name ");
        user = scan.nextLine();
        System.out.println("Which is your favourite voice assitant ");
        company = scan.nextLine();
            System.out.println(" What is your favourite song ");
            secret = scan.nextLine();

        System.out.println("What can i do for you : 1.TELL A A JOKE  2.SING A SONG");
        userwork = scan.nextInt();

    }
        public void response () {
        System.out.println("Thank you  " + user + "  for chosing : " + company);

        if (userwork == 1) {
            System.out.println("Why are snails slow? Because they’re carrying a house on their back.");
        } else if (userwork == 2) {
            System.out.println("I'm unstoppable\n" +
                    "I'm a Porsche with no brakes\n" +
                    "I'm invincible\n" +
                    "Yeah, I win every single game\n" +
                    "I'm so powerful\n" +
                    "I don't need batteries to play\n" +
                    "I'm so confident\n" +
                    "Yeah, I'm unstoppable today");

        } else {
            System.out.println("Please choose right option ");
        }

    }




}

class Childclass extends inheritclass {

     public void childfunction(String st){
         System.out.println("Your favourite song is "+st);

     }
}