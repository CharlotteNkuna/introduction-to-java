import java.util.Scanner;


public class votingsystem {
    static void main(String[] args) {
        //Register
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the voting application");
            System.out.println("============= Register ================ ");
            System.out.println("enter username");
            String username = input.nextLine();
            System.out.println("enter 4 digit pin");
            int pin = input.nextInt();
            input.nextLine();

            // Login
            System.out.println("you can login");
            System.out.println("=============== Login ================= ");
            System.out.println("enter username");
            String loginusername = input.nextLine();
            System.out.println("enter 4 pin");
            int loginpin = input.nextInt();


            if (loginusername.equals(username) && loginpin == pin){
                System.out.println("you have logged in sucessfully");
                System.out.println("enter you age to vote");
                int age = input.nextInt();

                if(age>=18){
                    System.out.println("you can vote");
                } else{
                    System.out.println("you cant vote");
                }

            } else{
                System.out.println(" you have entered wrong pin or username");
                System.out.println(" try again");
            }

        }
    }

