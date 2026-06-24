public class Main { //creates class
    public static void main(String[] args) {
        System.out.println("Hello Girl!!!");

        String name = "Charlotte";
        String surname = "Nkuna";
        int age = 20;
        //System.out.println("My name is " + name + " " + surname + " I am " + age + " years old.");

        // Use %s for text and %d for numbers
        System.out.println("My name is %s %s I am %d years old.".formatted(name, surname, age));

        //practice using primitive datatypes
        Byte numb = -100;
        Short shortNumber = -32768;
        int ages = 30;
        long millions = 1245657890L; // Added 'L' for a long number
        float frac = 13.123445F;     // added 'F' for flot
        double price = 19.99;
        boolean isTrue = true;
        char symbol = 'm';

        System.out.println("Byte: " + numb);
        System.out.println("Float: " + frac);
        System.out.println("Char: " + symbol);
        System.out.println("Boolean: " + isTrue);
        System.out.println("int: " + ages);
        System.out.println("Short: " + shortNumber);
        System.out.println("Long: " + millions);
        System.out.println("Double: " + price);


       //casting
        //auto casting implicity
       double newAge = age;
       System.out.println(newAge);

       //manual casting explicity
        int newPrice = (int)price;
        System.out.println(newPrice);


        //arithmetic operators
        int x = 5;
        int y = 100;
        //System.out.println(x%y);
        //comparisons
        System.out.println(x== y);









    }
}