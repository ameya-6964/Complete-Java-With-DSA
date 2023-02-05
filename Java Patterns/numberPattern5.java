/* 
Print Following Patern 
1
23
456
78910 
*/

import java.util.Scanner;

public class numberPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        int p = 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                p++;
            }
            System.out.println();
        }

        sc.close();
    }
}
