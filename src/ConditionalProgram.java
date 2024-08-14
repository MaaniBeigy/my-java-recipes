import java.util.Scanner;

public class ConditionalProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        if (temperature >= 100) {
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }
        sc.close();
    }
}
// if(condition) {
// //some code
// } else if(condition) {
// //some other code
// } else {
// //some other code
// }
// < less than
// > greater than
// != not equal to
// == equal to
// <= less than or equal to
// >= greater than or equal to