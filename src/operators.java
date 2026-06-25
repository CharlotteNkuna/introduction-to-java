public class operators {
    static void main(String[] args) {
        //ARITHMETIC OPERATORS
        int number1 = 5;
        int number2 = 10;

        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Remainder: " + (number1 % number2));

//  FIX: Cast one number to double to get a decimal result
        System.out.println("Division: " + ((double) number1 / number2));


        //COMPARISON OPERATORS
        // == Equal to: Checks whether two values are the same.
        System.out.println("Are values the same? " + (number1 == number2));

        int pin = 1234;
        int enteredPin = 1234;
        System.out.println(pin == enteredPin);

        //Not equal to : Checks if values are different.
        System.out.println("Are not equal to? " + (number1 != number2));

        String password = "admin";
        String userInput = "guest";
        System.out.println(password != userInput);

        //Greater than: Checks whether one number is bigger than another.
        System.out.println("is it greater than? " + (number1 > number2));

        int age = 20;
        System.out.println(age > 18);

        //Less than: Checks if one value is smaller.
        System.out.println(age < 10);

        //Greater Than or Equal: Checks: Greater than OR Equal to
        int num = 18;
        System.out.println(18 >= 18);

        //Less Than or Equal To: Checks Less than OR Equal to
        System.out.println(num <= 10);

        //LOGICAL OPERATORS
        //AND &&: Both condition must be true
        boolean hasStudentCard = true;
        boolean hasExamPermit = true;
        System.out.println(hasStudentCard && hasExamPermit);

        int ages = 20;
        boolean hasID = true;
        System.out.println(ages >= 18 && hasID);

        //OR || Only one condition needs to be true.
        boolean cash = false;
        boolean card = true;
        System.out.println(cash || card);

        int mark = 45;
        System.out.println(mark >= 50 || mark == 45);

        //NOT !
        boolean accountActive = true;
        System.out.println(!accountActive);










    }
}
