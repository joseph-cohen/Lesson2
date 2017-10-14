import java.util.Scanner;

/**
 * Exercises on if, for and while loops
 */
public class Exercise {

    Scanner input;

    // Look up the documentation for Scanner and what methods are available
    private Exercise() {
    input = new Scanner(System.in);
    //int number1; // first number to compare
    //int number2; // second number to compare
    }

    //TODO: Write a Java program to compare two numbers.


    public static void main(String[] args) {
        Exercise ex = new Exercise();

        ex.checkZero();
        ex.compare();
        ex.natural();
        ex.reverse();
    }


    public  void compare(){
        int n1, n2;
        System.out.print("Enter number 1"+ '\n');
        n1 = input.nextInt(); //input for number 1
        System.out.print("Enter number 2"+ '\n');
        n2 = input.nextInt(); //input for number 2
        if (n1 == n2){ //checks if the numbers are equal
            System.out.print("Numbers are equal");
        } else {
            if (n1 > n2){ // checks if n1 is bigger than n2
                System.out.print("Number 1 is bigger"+ '\n');
            } else { //if neither of the previous ifs were true, number 2 must be bigger
                System.out.print("Number 2 is bigger"+ '\n');
            }
        }
    }

    // TODO: Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    // TODO: Otherwise, print "positive" or "negative".

    public void checkZero(){
        int number;
        System.out.print("Enter your number"+ '\n');
        number = (int) input.nextFloat(); //input for the number
        if (number == 0) { //checks if number is 0
            System.out.print("zero"+ '\n'); //prints 'zero' if the number is 0
        }else { if (number > 0) { //checks if number is more than 0
            System.out.print("positive"+ '\n'); //if the number is more than 0 it will print that it is positive
        }else {System.out.print("Negative"+ '\n');} //if the number is neither 0 nor higher than 0, it must be negative.
        }
    }

    // TODO: Write a program in Java to display the first 10 natural numbers.

    public void natural() {
        for (int i = 0; i < 11; i ++) { //(declares variable i; says that as long as variable i is less than eleven the loop will run;i will increment 1 by 1 )
            System.out.print("The natural numbers are " + i); //prints i
        }
    }
    // TODO: Write a Java program to reverse a string. Print the before and after.

    public void reverse(){
        String str;
        System.out.print("Type your string"+ '\n');
        str = input.next(); //input for the string
        System.out.print(str + '\n'); //prints out the input
        char[] array = str.toCharArray(); //makes each letter in the string into an item in an array
        for (int i = array.length - 1; i >= 0; i--)//makes it so i is the length of the array (the length of the string), then says to run the loop until it reaches i is 0, then it says to go decreasing i by 1
        {
            System.out.print(array[i]);//prints the item in the array that corresponds to i, since it's going from top to bottom, it will reverse the string
        }
    }
}