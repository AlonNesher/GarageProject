import java.awt.*;
import java.util.Scanner;

abstract class Vehicle implements Fixable {

    private String name;

    public Vehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me a name: ");
        String choice = scanner.nextLine();
        this.name = choice;
    }

    public abstract int getFixTime();

    public String getName() {
        return this.name;
    }
}