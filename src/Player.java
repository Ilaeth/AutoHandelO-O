import vehicles.Vehicle;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Player {
    String playerName;
    final static BigDecimal DEFAULT_CASH = new BigDecimal("1000000.0");
    BigDecimal cash;
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    ArrayList<Vehicle> playerGarage= new ArrayList<>();
    ArrayList<String> history=new ArrayList<>();

    public Player(String playerName){
        this.playerName = playerName;
        this.cash = DEFAULT_CASH;
    }

    public BigDecimal getterCash() {
        return this.cash;
    }

    public static void checkCash(Player player1){
        System.out.println("Stan konta: " + player1.getterCash());
    }

    public void checkPlayerGarage(){
        for(int i=0;i<playerGarage.size();i++){
            System.out.println(i+1+". "+playerGarage.get(i));
        }
    }

    public void showHistory(){
        if (history.isEmpty()){
            System.out.println("No history");
        }else {
            for(int i=0;i<history.size();i++){
                System.out.println("Transaction number "+(i+1)+". "+history.get(i));
            }
        }
    }
}