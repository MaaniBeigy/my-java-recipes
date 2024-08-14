import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int Age = sc.nextInt();
        System.out.println(name + " is " + Age + " years old!");
        sc.close();
    }
}