// This is Comment
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        greet(); // Method Calling Statement
        int result = addTwoNumbers(22, 33);
        System.out.println(result);
        int result1 = addTwoNumbers(22, 33);
        System.out.println(result1);
    }

    public static void greet() {
        System.out.println("Hello User :)");
    }

    public static int addTwoNumbers(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int multiplyTwoNumbers(int a, int b) {
        int c = a * b;
        return c;
    }
}