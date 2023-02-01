/*
 * For Single String
 * import java.util.Scanner;;
 * 
 * public class TakingInput {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a Name");
 * String str = sc.next();
 * System.out.println("You Have Enter " + str); // You Have Enter Ameya
 * sc.close();
 * }
 * }
 */

/*
 * When Input Is Multiple Lines But You Are Using sc.next() method
 * 
 * import java.util.Scanner;;
 * 
 * public class TakingInput {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Your Only First String Will Be Printed Try" +
 * " Hello My Name Is ");
 * String str = sc.next();
 * System.out.println(str); // Hello
 * sc.close();
 * }
 * }
 */

// When You Want To Print Multiple Sentences Use sc.nextLine() 

import java.util.Scanner;;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Only First String Will Be Printed Try" + " Hello My Name Is ");
        String str = sc.nextLine();
        System.out.println(str); // Hello My Name Is
        sc.close();
    }
}