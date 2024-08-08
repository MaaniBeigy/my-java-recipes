/* This is just an introductory class*/
public class Intro {
    public static void main(String[] args) {
        System.out.println("Hello World"); // just print out the text.
        /* Declare variables */
        String Name = "James";
        char Initials = 'J';
        int Age = 42;
        double Height = 178.6;
        float Weight = 68.2f;
        boolean IsActive = true;
        // Print out the variables.
        System.out.print("I am " + Name + "!\n");
        System.out.print("You can call me " + Initials + "!\n");
        System.out.print("I'm " + Age + " years old" + "!\n");
        System.out.print("Not that is none of your business but my height is " + Height + " centimeters" + "!\n");
        System.out.print("And my weight is " + Weight + " kilograms" + "!\n");
        System.out.print("It's " + IsActive + " :-) \n");
        int Items = 108;
        int Residue = Items % 5; // calculated variable
        System.out.print("I can give you " + Residue + " books!");
    }
}