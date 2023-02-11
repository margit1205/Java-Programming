package com.example.votingregistraion;
import java.util.HashMap;
import java.util.Scanner;

public class mainvoting {


    public static void main(String[] args) {

        HashMap<Integer, Nomineee> nominput = new HashMap<>();
        HashMap<Integer, Voter> votinput = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to registration portal\n");

        System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
        int n = sc.nextInt();//int for enter 1 to enter nominee detils



        while (n != 0) {

            int count=0;
            if (n == 1) {


                System.out.println("Enter your name");
                String nomineeName = sc.next();
                sc.nextLine();
                System.out.println("Enter your id");
                int nomineeId = sc.nextInt();
                System.out.println("Enter your Age");
                int nomineeAge = sc.nextInt();


                Nomineee nomini = new Nomineee();

                nomini.setNomineeName(nomineeName);
                nomini.setNomineeId(nomineeId);
                nomini.setNomineeAge(nomineeAge);
                nominput.put(nomineeId, nomini);

                System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                n = sc.nextInt();//int for enter 1 to enter nominee detils


            }

            if (n == 2) {

                //All the operation on user

                Voter voter = new Voter();

                System.out.println("Enter your name");
                String voterName = sc.next();
                sc.nextLine();
                System.out.println("Enter your id");
                int voterId = sc.nextInt();
                System.out.println("Enter your Age");
                int voterAge = sc.nextInt();

                voter.setVoterName(voterName);
                voter.setVoterId(voterId);
                voter.setVoterAge(voterAge);
                votinput.put(voterId, voter);

                System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                n = sc.nextInt();//int for enter 1 to enter nominee detils


            }


            else if (n == 3) {

                boolean elem = votinput.isEmpty();
                if (elem){
                    System.out.println("No voter is inserted yet\n\n");
                    System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                    n = sc.nextInt();
                }

                else {
                    votinput.forEach((k, v) -> System.out.println("Key = "
                            + k + ", Value = " + v));

                    System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                    n = sc.nextInt();


                    continue;
                }
            }

            else if (n == 4) {

                nominput.forEach((k, v) -> System.out.println("Key = "
                        + k + ", Value = " + v));

                System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                n = sc.nextInt();
                continue;


            }




            else if (n == 5) {

                boolean element = nominput.isEmpty();

                if (element) {
                    System.out.println("No nominee is participated");
                    break;

                }



                else {
                    nominput.forEach((k, v) -> System.out.println("Key = "
                            + k + ", Value = " + v));
                    System.out.println("Enter id of nominee to vote");
                    int k = sc.nextInt();
                    System.out.println("You Voted" + nominput.get(k));


                    if (nominput.containsKey(k)) {
                        count = count + 1;
                    }
                    else{
                        System.out.println("Enter valid id");
                    }

                    System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                    n = sc.nextInt();
                }


            }

            else if (n == 6) {
                boolean element = nominput.isEmpty();
                if (element) {
                    System.out.println("No nominee is participated");
                    break;


                }

                else {
                    System.out.println("Enter id of nominee to see vote");
                    int s = sc.nextInt();
                    if(nominput.get(s)==null){
                        System.out.println("Enter valid id");
                    }
                    else {
                        System.out.println("The vote for " + nominput.get(s) + " is " + count);
                        System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                        n = sc.nextInt();
                    }
                }
            }


        }

    }
}














