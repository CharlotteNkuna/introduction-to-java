public class typecasting {
     static void main(String[] args) {

            //TYPE CASTING
            //IMPLICIT/ WIDENING CASTING
            byte num = -128;

            double newNum = num;
            int newNum2 = num;

            System.out.println("new number is "+ newNum);
            System.out.println("new number2 is "+ newNum2);

            //EXPLICIT/ NARROWING
            float p = 12.123458F;
            double age = 127.99;

            int newPrice = (int) p; // this is placed because it targets
            // data type in parentheses (int) right before the variable p
            System.out.println("new price is "+ newPrice);

            short newAge = (short) age;
            System.out.println("age =" + newAge);

        }
    }

