public class Textil extends Producte {
    String composicio;

    public Textil(float preu, String nom, String codiBarres, String composicio) {
        super(preu, nom, codiBarres);

        this.composicio = composicio;
    }
}
