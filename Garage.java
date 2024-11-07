public class Garage {
    private Veicolo[] veicoli;
    private int numVeicoli;

    public Garage(int maxVeicoli) {
        veicoli = new Veicolo[maxVeicoli];
        numVeicoli = 0;
    }

    public void addVeicolo(Veicolo v) {
        if (numVeicoli < veicoli.length) {
            veicoli[numVeicoli] = v;
            numVeicoli++;
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < numVeicoli; i++) {
            s += veicoli[i] + "\n";
        }
        return s;
    }
}
