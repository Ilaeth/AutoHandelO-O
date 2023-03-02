import vehicles.Car;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Player player1 = new Player("Przemek", 1000000.0);

        System.out.println("                          Hello Auto-Handel");
        System.out.println("                                                                ░░          ░░\n");
        System.out.println("                                              ░░░░  ░░          ▒▒  ░░  ▒▒▒▒▓▓▒▒▓▓░░░░\n");
        System.out.println("                                              ░░                    ▒▒▓▓▒▒▓▓▒▒▓▓▒▒██▓▓▓▓▒▒\n");
        System.out.println("                                                          ░░░░  ▒▒▒▒░░░░▒▒▓▓░░▒▒▓▓▓▓▒▒▒▒▒▒▓▓\n");
        System.out.println("                              ░░░░            ░░    ░░    ░░  ░░░░▒▒▒▒░░██▒▒░░░░▒▒▒▒▓▓▒▒▒▒▒▒░░░░\n");
        System.out.println("                                    ▒▒        ▒▒                ▒▒░░▓▓░░▒▒▓▓████████░░▓▓▓▓▒▒▒▒▓▓░░\n");
        System.out.println("                                ░░        ░░      ▓▓  ░░    ░░░░▓▓▓▓░░██░░  ▓▓██    ██▒▒▒▒▒▒▒▒██▒▒\n");
        System.out.println("                                          ▒▒  ░░      ░░  ░░  ▓▓▒▒░░██        ▒▒      ▓▓▒▒▒▒▓▓▓▓▓▓░░                                  ░░\n");
        System.out.println("                        ░░                    ░░      ░░  ░░▒▒▒▒░░██▓▓      ░░▓▓      ▒▒██▒▒▒▒▓▓▒▒▓▓\n");
        System.out.println("                                                      ▒▒  ▒▒▒▒░░██  ▓▓▓▓    ▒▒▓▓    ░░██░░▓▓░░▓▓▒▒▒▒▒▒\n");
        System.out.println("                                        ▒▒          ▒▒  ░░  ▓▓▒▒░░    ██▓▓  ▒▒██  ▒▒██      ▓▓▓▓▓▓▒▒▒▒\n");
        System.out.println("                                                    ░░  ▓▓░░▒▒██        ██████▓▓████        ▓▓░░▓▓▒▒▓▓\n");
        System.out.println("                                    ▓▓    ░░        ░░░░▒▒██░░██        ▒▒██▒▒▒▒██▓▓        ▒▒░░▓▓▓▓▓▓░░\n");
        System.out.println("                          ░░              ░░  ▒▒  ░░  ░░░░  ░░██████████▓▓██    ▓▓▓▓▓▓████████░░▓▓▒▒▒▒\n");
        System.out.println("                          ░░      ░░        ▒▒    ░░  ░░▒▒▒▒░░▓▓░░  ░░░░████    ████▒▒░░    ██░░▓▓▒▒░░░░\n");
        System.out.println("                                                        ░░▓▓▒▒██        ▒▒██▒▒████▓▓        ▒▒░░▒▒▒▒▓▓\n");
        System.out.println("                                                    ▒▒    ▒▒▒▒▓▓      ░░▓▓▓▓▓▓▓▓▒▒██▒▒      ▓▓░░░░▒▒▓▓\n");
        System.out.println("                                    ░░  ░░      ░░  ░░    ░░▒▒░░▒▒    ██▒▒  ▒▒▓▓  ░░██░░    ▒▒▓▓▒▒▓▓▒▒\n");
        System.out.println("                                                    ▒▒  ▒▒▒▒▒▒▒▒▓▓▒▒██░░    ▒▒▓▓      ██▒▒██▒▒▒▒▒▒▒▒░░\n");
        System.out.println("                                              ░░▒▒    ░░  ░░▒▒░░░░██▓▓      ░░▓▓      ▒▒██░░▒▒▓▓▓▓▒▒\n");
        System.out.println("                      ░░                            ░░    ░░▒▒▓▓▓▓▒▒▓▓░░    ░░▓▓    ░░██░░▓▓▒▒▓▓▒▒\n");
        System.out.println("                                                  ░░    ██  ░░  ▒▒▒▒▓▓░░██▓▓████▓▓██▒▒▒▒▓▓▓▓▓▓▒▒▒▒\n");
        System.out.println("                                            ▒▒▒▒    ▒▒      ░░  ░░▓▓▒▒▓▓▒▒▒▒░░░░░░▓▓▒▒▒▒▒▒▒▒░░▒▒\n");
        System.out.println("                                        ░░          ░░  ▒▒  ░░  ▒▒░░▒▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒\n");
        System.out.println("                                                                  ░░░░░░  ▓▓▒▒▓▓▒▒██░░▒▒░░\n");
        System.out.println("                                                                            ░░\n");
        //https://textart.sh/topic/wheel
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Main-Menu");
        System.out.println("");
        System.out.println("1. Lista pojazdów.");
        System.out.println("2. Moja lista posiadanych pojazdów.");
        System.out.println("3. Kup/dodaj nowy pojazd.");
        System.out.println("4. Sprzedaj/usuń pojazd.");
        System.out.println("5. Mój stan konta.");
        System.out.println("6. Historia Kupna/Sprzedaży");
        System.out.println("7. Zakończ/wyłącz program");
        System.out.println("");
        System.out.println("Wybierz liczbę z menu i napisz od 1 do 7");
        System.out.println("");
        int firstSwitch = scanner.nextInt();
        System.out.println("Wybrałeś " + firstSwitch);

        switch (firstSwitch) {
            case 1:
                ArrayList<String> vehicles = new ArrayList<String>();

                Car car1 = new Car( "1", "BMW", "X3", 2012, 63000.00);
                Car car2 = new Car( "2", "BMW", "5", 2014, 125000.00);

                vehicles.add(String.valueOf(car1));
                vehicles.add(String.valueOf(car2));

                System.out.println("Lista pojazdów");
                System.out.println("");

                System.out.println(vehicles);

                System.out.println("");

                backToMenu();
                break;
        }
    }
    public static void backToMenu() {
        System.out.println("Co dalej? ");
        menu();
    }
}