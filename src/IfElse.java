import java.util.Scanner;

public class IfElse {
    static void main(String[] args) {

        int age = 18;
//   If Statement: executes only if the condition is true
        if (age >= 18){
            System.out.println("passed");
        }


//   If Else: for 2 possibilities
     int requiredAge = 16;
        if (requiredAge >= 18) {
            System.out.println("You are permitted");
        }
        else {
            System.out.println("You are underage");
        }

//   Else If: more than 2 possibilities
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age ");
        int ages = input.nextInt();

        if (ages == 19) {
            System.out.println("You may enter still");
        }
        else if (ages >= 18) {
            System.out.println("You may enter");
        }
        else {
            System.out.println("You are not permitted");
        }

//   Ternary Operator: Short way of IF ELSE
        int marks = 80;
        String results = marks >= 50? "Pass": "Fail";
        System.out.println(results);

//   Switch Statements: For many possibilities
        int day = 1;

        switch(day){

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid");

        }
    }
}
