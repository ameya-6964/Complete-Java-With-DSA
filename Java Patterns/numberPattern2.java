import java.util.Scanner;

/* 
Print Following Patern 
1234
1234
1234
1234 
*/

public class numberPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
