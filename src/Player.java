import vehicles.Vehicle;

import java.util.ArrayList;

public class Player {
    public String playerName;
    private Double cash;
    public ArrayList<Vehicle> playerGarage= new ArrayList<>();
    public ArrayList<String> history=new ArrayList<>();

    public Player(String playerName,Double cash){
        this.playerName=playerName;
        this.cash = cash;
    }

    public boolean PurchaseVehicle(Vehicle vehicle){
        if(vehicle.price < cash){
            System.out.println("Vehicle was purchased");
            cash -= vehicle.price;
            return true;
        }
        System.out.println("not enough Cash");
        return false;
    }

    public void checkCash(){
        System.out.println("Your account balance: "+Math.round(cash));
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