import java.util.Scanner;

public class Clear {
    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void pause(Scanner scanner) {
        System.out.println("\nPressione ENTER para continuar...");
        scanner.nextLine(); 
    }
}