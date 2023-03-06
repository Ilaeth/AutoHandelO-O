import vehicles.Enum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Client {
    Enum.Name name;
    Enum.LastName lastName;
    BigDecimal cash;

    public Client(Enum.Name name, Enum.LastName lastName) {
        this.name = name;
        this.lastName = lastName;
        this.cash = generatecash();
    }

    public static ArrayList<Client> generateRandomClient(int x) {
        ArrayList<Client> clients = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            int randomName = ThreadLocalRandom.current().nextInt(0, Enum.Name.values().length);
            Enum.Name name = Enum.Name.values()[randomName];

            int randomLastName = ThreadLocalRandom.current().nextInt(0, Enum.LastName.values().length);
            Enum.LastName lastName = Enum.LastName.values()[randomLastName];

            int randomClient = ThreadLocalRandom.current().nextInt(0,Enum.Client.values().length);

            switch (randomClient) {
                case 0:
                    clients.add(new Client(name, lastName));
            }
        }
        return clients;
    }

    public BigDecimal generatecash() {
        BigDecimal rand = BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(100000.0, 10000000.0 + 1));
        return rand.setScale(2, RoundingMode.DOWN);
    }

    @Override
    public String toString() {
        return  " {" + "\n" +
                "Imię "+ name + "\n" +
                " Nazwisko " + lastName + "\n" +
                " Budżet = " + cash
                + "\n" + " }";
    }
}