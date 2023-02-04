import java.util.Date;

public class Platinum extends TarjetaCredito{
    public Platinum(String emisor, long cupo, String numero, short cvv, Date fechaVencimiento) {
        super(emisor, cupo, numero, cvv, fechaVencimiento);
    }
}
