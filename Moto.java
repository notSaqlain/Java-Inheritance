public class Moto extends Veicolo {
    public static void main(String[] args) {
        Veicolo myMoto = new Moto();
        myMoto.honk();
        System.out.println(myMoto.brand + " " + myMoto.model);
    }
    
}
