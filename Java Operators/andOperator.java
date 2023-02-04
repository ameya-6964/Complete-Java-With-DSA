import java.util.Scanner;

class andOperator {
    public static void main(String[] args) {
        System.out.println("Welcome To Number Checker");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value For Number One");
        int a = sc.nextInt();
        System.out.println("Enter Value For Number Two");
        int b = sc.nextInt();

        if (a > b && a >= 0) {
            System.out.println("Number 1 Is Bigger Then Numnber 2 ");
        } else if (b > a && b >= 0) {
            System.out.println("Number 2 Is Bigger Then Numnber 1 ");
        }
        sc.close();
    }
}