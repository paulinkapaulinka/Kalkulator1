import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        Scanner scanner = new Scanner(System.in);
        String name = "cokolwiek";
        name.
        System.out.println("Wpisz pierwsza liczbe");
        int x = scanner.nextInt();
        System.out.println("Wpisz druga liczbe");
        int y = scanner.nextInt();
        System.out.println("Suma to "+kalkulator.add(x, y));
    }
}
