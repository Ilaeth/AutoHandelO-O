import vehicles.Vehicle;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Player {
    String playerName;
    final static BigDecimal DEFAULT_CASH = new BigDecimal("1000000.0");
    BigDecimal cash;
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    ArrayList<String> history=new ArrayList<>();

    public Player(String playerName){
        this.playerName = playerName;
        this.cash = DEFAULT_CASH;
    }

    public BigDecimal getterCash() {
        return this.cash;
    }

    public void buy(BigDecimal cash) {
        this.cash = this.cash.subtract(cash);
    }

    public void sell(BigDecimal cash) {
        this.cash = this.cash.add(cash);
    }

    public static void checkCash(Player player1){
        System.out.println("Stan konta: " + player1.getterCash());
    }

    public void buyVehicle(Vehicle v, ArrayList<Vehicle> vehicles) {
        BigDecimal price = new BigDecimal("0");
        price = price.add(v.getterValue());
        if (this.cash.compareTo(price) < 0) {
            System.out.println("Nie stać cię! " + price);
            System.out.println("Stan konta: " + Main.player1.getterCash());
        } else {
            this.cash = this.cash.subtract(price);
            this.vehicles.add(v);
            vehicles.remove(v);
            System.out.println("Kupiłeś pojazd za " + price);
            System.out.println("Stan konta po transakcji: " + Main.player1.getterCash());
            history.add("Kupiłeś " + v + " za " + price);
        }
    }

    public ArrayList<Vehicle> getterVehicles() {
        return this.vehicles;
    }

    public void checkPlayerGarage(){
        System.out.println("Twoje pojazdy");
        int i = 1;
        for (Vehicle v: Main.player1.getterVehicles()) {
            System.out.println("Pojazd " + i + v);
            i++;
        }
    }

    public void showHistory(){
        if (history.isEmpty()){
            System.out.println("Brak historii");
        }else {
            for(int i=0;i<history.size();i++){
                System.out.println("Numer transakcji "+(i+1)+". "+history.get(i));
            }
        }
    }
}