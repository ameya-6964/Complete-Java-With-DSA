import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Be Checked");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Number Is Even");
        } else {
            System.out.println("Number Is Odd");

        }
        sc.close();

    }
}
