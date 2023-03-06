import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    static Player player1 = new Player("Przemek");
    static ArrayList<Vehicle> vehicles = Vehicle.generateRandomVehicles(50);
    public static void main(String[] args) {
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
        System.out.println(" ");
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
        System.out.println(" ");
        System.out.println("12. Zakończ/wyłącz program");
        System.out.println(" ");
        System.out.println("Wybierz liczbę z menu i napisz od 1 do 12");
        System.out.println(" ");
        int firstSwitch = scanner.nextInt();
        System.out.println("Wybrałeś " + firstSwitch);

        switch (firstSwitch) {
            case 1: {
                System.out.println("Lista pojazdów");
                System.out.println(vehicles.toString());
                backToMenu();
                break;
            }
            case 2: {
                System.out.println("Lista pojazdów do kupienia");
                int i = 1;
                for (Vehicle v : vehicles) {
                    System.out.println("Pojazd " + i + v);
                    i++;
                }
                System.out.println("Podaj numer pojazdu, który chcesz kupić");
                Scanner userInput = new Scanner(System.in);
                int choice;
                choice = userInput.nextInt() - 1;
                player1.buyVehicle(vehicles.get(choice),vehicles);
                backToMenu();
                break;
            }
            case 3: {
                player1.checkPlayerGarage();
                backToMenu();
                break;
            }
            case 4:

            case 5:

            case 6:

            case 7:

            case 8: {
                Player.checkCash(player1);
                backToMenu();
                break;
            }
            case 9: {
                player1.showHistory();
                backToMenu();
                break;
            }
            case 10:

            case 11:

            case 12: {
                System.out.println("Koniec?!?! Napewno?");
                System.out.println(" ");
                System.out.println("1. Tak");
                System.out.println("2. NIE");
                System.out.println(" ");
                System.out.println("Wybierz liczbę i napisz od 1 do 2");
                int endSwitch = scanner.nextInt();
                switch (endSwitch) {
                    case 1: {
                        System.exit(1);
                        break;
                    }
                    case 2: {
                        backToMenu();
                        break;
                    }
                }
            }
        }
    }

    public static void backToMenu() {
        System.out.println("Co dalej? ");
        menu();
    }
}