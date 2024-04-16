public class Electronica extends Producte {
    int diesGarantia;

    public Electronica(float preu, String nom, String codiBarres, int diesGarantia) {
        super(preu + preu * (diesGarantia / 365f) * 0.1f, nom, codiBarres);

        this.diesGarantia = diesGarantia;
    }
}
