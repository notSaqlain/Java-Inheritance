public class Auto extends Veicolo {
    String modelName = "Mustang";
    public static void main(String[] args) {

    Veicolo myCar = new Veicolo();
    myCar.honk();
    System.out.println(myCar.brand + " " + myCar.modelName);
    
    }
}
