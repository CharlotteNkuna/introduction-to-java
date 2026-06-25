import java.util.Scanner;

public class practice {

    public  static  void  main (String[] args){
        //primitive datatypes
        String name = "Charlotte";
//        int age = 25;
//        double average = 75.5;
//        float pie = 3.14576879F;
//        boolean isStudent = true;

  //      System.out.println("My name is " + name);
//        System.out.println("I am " + age + " years old");
//        System.out.println("The average number is " + average);
//        System.out.println("Float: " + pie);
//        System.out.println("Are you a student?  " + isStudent);

        //scanner: allows you to receive input
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//
//        String names = input.nextLine();
//        System.out.println("Hello " + names);
//
//        System.out.print("Enter your age: ");
//        int ages = input.nextInt();
//        System.out.println("You are " + ages + " " + "years old.");

//        System.out.print("Enter your date of birth: ");
//        int dob = input.nextInt();
//
//        System.out.print("Enter your age: ");
//        int ageNow = input.nextInt();
//
//        System.out.println(dob % ageNow);



        //reading a single character
//        System.out.print("Enter grade: ");
//        char grade = input.next().charAt(0);
//        System.out.println("you got  " + grade);
//
//        System.out.print("Enter average mark: ");
//        double mark = input.nextDouble();
//        System.out.println("Average Mark: " + mark);

        //using boolean for age
//        System.out.print("Enter your age: ");
//        int aged = input.nextInt();
//
//        // Automatically calculate if they are over 18
//        boolean isOverage = aged >= 18;
//        System.out.println("Is over 18? " + isOverage);

        //using if else
//        System.out.print("Enter your age: ");
//        int age = input.nextInt();
//        if (age >= 18) {
//            System.out.println("welcome ");
//        }
//            else {
//            System.out.println(age + " years is not permitted");
//        }

//       CALCULATOR
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int results = 0;
        boolean validOp = true;

        // results
        switch (operator) {
            case '+':
                results = num1 + num2;
                break;

            case '-':
                results = num1 - num2;
                break;

            case '*':
                results = num1 * num2;
                break;

            case '%':
                results = num1 % num2;
                break;

            case '/':
                // Error handling for division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOp = false;
                } else {
                    results = num1 / num2;
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                validOp = false;
                break;
        }

        if (validOp) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + results);
        }




        //operators
//        int bread = 15;
//        int milk = 20;
//
//        int total = bread + milk;
//        int total = bread - milk;
//        int total = bread * milk;
//        int total = bread % milk;
//        int total = bread / milk;

//        System.out.println(total);
//
//        //Comparison Operators
//        int age = 20;
//        System.out.println(age > 18);




    }
}

