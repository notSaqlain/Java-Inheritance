public class Main {
    public Main(String[] args) {
        Garage garage = new Garage(10);

        Moto moto1 = new Moto("Yamaha", "MT-07");
        Auto auto1 = new Auto("Fiat", "500");

        garage.addVeicolo(moto1);
        garage.addVeicolo(auto1);

        System.out.println(garage);

        System.out.println("Uscita dal programma");
    }
}