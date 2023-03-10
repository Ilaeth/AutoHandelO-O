import vehicles.SortVehicleAscending;
import vehicles.SortVehicleDescending;
import vehicles.Vehicle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    static Player player1 = new Player("Przemek");
    static ArrayList<Vehicle> vehicles = Vehicle.generateRandomVehicles(10);
    static ArrayList<Client> clients = Client.generateRandomClient(5);


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
                System.out.println(" ");
                System.out.println("1. Bez sortowania");
                System.out.println("2. Sortowanie rosnąco");
                System.out.println("3. Sortowanie malejąco");
                System.out.println(" ");
                System.out.println("Wybierz liczbę i napisz od 1 do 3");
                int sort = scanner.nextInt();
                switch (sort) {
                    case 1: {
                        System.out.println("Lista pojazdów - Bez sortowania");
                        System.out.println(" ");
                        System.out.println(vehicles.toString());
                        backToMenu();
                        break;
                    }
                    case 2: {
                        System.out.println("Lista pojazdów - Sortowanie rosnąco");
                        System.out.println(" ");
                        vehicles.sort(new SortVehicleAscending());
                        System.out.println(vehicles.toString());
                        backToMenu();
                        break;
                    }
                    case 3: {
                        System.out.println("Lista pojazdów - Sortowanie malejąco");
                        System.out.println(" ");
                        vehicles.sort(new SortVehicleDescending());
                        System.out.println(vehicles.toString());
                        backToMenu();
                        break;
                    }
                }

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
                vehicles = Vehicle.generateRandomVehicles(10);
                backToMenu();
                break;
            }
            case 3: {
                player1.checkPlayerGarage();
                backToMenu();
                break;
            }
            case 4: {
                System.out.println("Wybierz mechanika:");
                System.out.println("1. Janusz - " + "" + "100% szans na naprawę");
                System.out.println("2. Marian - " + "" + "90% szans na naprawę");
                System.out.println("3. Adrian - " + "" + "80% szans na naprawę, ale 2% że zepsuje coś innego podczas naprawy");
                backToMenu();
                break;
            }
            case 5: {
                System.out.println("Lista potencjalnych klientów");
                System.out.println(clients.toString());
                backToMenu();
                break;
            }
            case 6: {
                System.out.println("Lista pojazdów do Sprzedania");
                player1.checkPlayerGarage();
                Scanner userInput = new Scanner(System.in);
                int choice;
                choice = userInput.nextInt() - 1;
                player1.choiceClientToSell(player1.getterVehicle(choice),clients);
                vehicles = Vehicle.generateRandomVehicles(10);
                backToMenu();
                break;
            }
            case 7: {
                final BigDecimal DEFAULT_TV_AD = new BigDecimal("1000000.0");
                final BigDecimal DEFAULT_YT_AD = new BigDecimal("850000.0");
                final BigDecimal DEFAULT_INTERNET_AD = new BigDecimal("750000.0");
                final BigDecimal DEFAULT_RADIO_AD = new BigDecimal("500000.0");
                final BigDecimal DEFAULT_GAZETA_AD = new BigDecimal("250000.0");
                final BigDecimal DEFAULT_PRODUKTY_AD = new BigDecimal("100000.0");
                System.out.println("Kup reklamę");
                System.out.println(" ");
                System.out.println("1. Reklama w TV = " + DEFAULT_TV_AD);
                System.out.println("2. Reklama na YT = " + DEFAULT_YT_AD);
                System.out.println("3. Reklama w Internecie = " + DEFAULT_INTERNET_AD);
                System.out.println("4. Reklama w Radiu = " + DEFAULT_RADIO_AD);
                System.out.println("5. Reklama w Gazecie = " + DEFAULT_GAZETA_AD);
                System.out.println("6. Produkty firmowe (kalendarz, notes) = " + DEFAULT_PRODUKTY_AD);
                System.out.println(" ");
                System.out.println("7. Jednak nie, powrót");
                System.out.println(" ");
                System.out.println("Wybierz liczbę i napisz od 1 do 7");
                int ads = scanner.nextInt();
                switch (ads) {
                    case 1: {
                        System.out.println("Kupiłeś reklamę - TV za = " + DEFAULT_TV_AD);
                        player1.buy(DEFAULT_TV_AD);
                        clients = Client.generateRandomClient(25);
                        backToMenu();
                        break;
                    }
                    case 2: {
                        System.out.println("Kupiłeś reklamę - YT za = " + DEFAULT_YT_AD);
                        player1.buy(DEFAULT_YT_AD);
                        clients = Client.generateRandomClient(20);
                        backToMenu();
                        break;
                    }
                    case 3: {
                        System.out.println("Kupiłeś reklamę - Internecie za = " + DEFAULT_INTERNET_AD);
                        player1.buy(DEFAULT_INTERNET_AD);
                        clients = Client.generateRandomClient(15);
                        backToMenu();
                        break;
                    }
                    case 4: {
                        System.out.println("Kupiłeś reklamę - Radiu za = " + DEFAULT_RADIO_AD);
                        player1.buy(DEFAULT_RADIO_AD);
                        clients = Client.generateRandomClient(10);
                        backToMenu();
                        break;
                    }
                    case 5: {
                        System.out.println("Kupiłeś reklamę - Gazecie za = " + DEFAULT_GAZETA_AD);
                        player1.buy(DEFAULT_GAZETA_AD);
                        clients = Client.generateRandomClient(7);
                        backToMenu();
                        break;
                    }
                    case 6: {
                        System.out.println("Kupiłeś reklamę - Produkty firmowe za = " + DEFAULT_PRODUKTY_AD);
                        player1.buy(DEFAULT_PRODUKTY_AD);
                        clients = Client.generateRandomClient(5);
                        backToMenu();
                        break;
                    }
                    case 7: {
                        System.out.println("Reklama - Jednak nie, powrót");
                        backToMenu();
                        break;
                    }
                }
            }
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
            case 10: {
                backToMenu();
                break;
            }
            case 11: {
                player1.getterSumWash();
                backToMenu();
                break;
            }
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