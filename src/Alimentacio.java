import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class Alimentacio extends Producte {
    Date dataCaducitat;

    public Alimentacio(float preu, String nom, String codiBarres, Date dataCaducitat) {
        super((float) (preu - preu * (1f/ ChronoUnit.DAYS.between((Temporal) dataCaducitat, LocalDateTime.now()) + (preu * 0.1))), nom, codiBarres);

        this.dataCaducitat = dataCaducitat;
    }
}
