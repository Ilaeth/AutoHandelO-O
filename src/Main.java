import vehicles.Vehicle;

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
        System.out.println("1. Przeglądaj bazę pojazdów do kupienia.");
        System.out.println("2. Kup pojazd.");
        System.out.println("3. Przeglądaj bazę posiadanych pojazdów.");
        System.out.println("4. Napraw pojazd.");
        System.out.println("5. Przejrzyj potencjalnych klientów.");
        System.out.println("6. Sprzedaj pojazd za określoną cenę potencjalnemu klientowi");
        System.out.println("7. Kup reklamę");
        System.out.println("8. Sprawdź stan konta");
        System.out.println("9. Sprawdź historię transakcji");
        System.out.println("10. Sprawdź historię napraw każdego pojazdu");
        System.out.println("11. Sprawdź sumę kosztów napraw i mycia dla każdego z posiadanych pojazdów");
        System.out.println("");
        System.out.println("12. Zakończ/wyłącz program");
        System.out.println("");
        System.out.println("Wybierz liczbę z menu i napisz od 1 do 12");
        System.out.println("");
        int firstSwitch = scanner.nextInt();
        System.out.println("Wybrałeś " + firstSwitch);

        switch (firstSwitch) {
            case 1:
                System.out.println("Lista pojazdów");
                ArrayList<Vehicle> vehicles = Vehicle.generateRandomVehicles(5);
                int i = 1;
                for (Vehicle v: vehicles) {
                    System.out.println("Pojazd " + i + v);
                    i++;
                }
                backToMenu();
                break;
        }
    }

    public static void backToMenu() {
        System.out.println("Co dalej? ");
        menu();
    }
}