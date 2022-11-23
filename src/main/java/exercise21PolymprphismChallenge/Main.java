package exercise21PolymprphismChallenge;

public class Main {
    public static void main(String[] args) {

        Flat[] flats = new Flat[10];


        for(int i = 0; i < flats.length; i++){
            int randIndex = (int)(Math.random() * 3);
            switch (randIndex){
                case 0:
                    flats[i] = new Flat("Suchedniow","Baker");
                    break;
                case 1:
                    flats[i] = new House("Sko", "Moon", 45.5f);
                    break;
                case 2:
                    flats[i] = new Residence("Kielce", "Sportowa", 74.5f,10f);
            }
        }

        for(int i = 0; i < flats.length;i++){
            System.out.println("Number: " + (i+1));

            if(flats[i] instanceof Residence){
                Residence residences = (Residence) flats[i];
                System.out.println(residences);
            } else if(flats[i] instanceof House) {
                House house = (House) flats[i];
                System.out.println(house);
            } else {
                System.out.println(flats[i].toString());
            }
        }


    }
}
