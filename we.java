public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        greetUser("Alice");
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);
        printSquare(7);
    }

    // Method to greet a specific user
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java.");
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method to print the square of a number
    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Square of " + number + " is " + square);
    }

    public void pp(){
        System.out.println("Hello");
    }
}
