import java.util.Date;

public class Clasica extends TarjetaCredito{
    public Clasica(String emisor, long cupo, String numero, short cvv, Date fechaVencimiento) {
        super(emisor, cupo, numero, cvv, fechaVencimiento);
    }
}
