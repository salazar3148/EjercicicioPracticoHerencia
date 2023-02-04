import java.util.Date;

public class Dorada extends TarjetaCredito{
    public Dorada(String emisor, long cupo, String numero, short cvv, Date fechaVencimiento) {
        super(emisor, cupo, numero, cvv, fechaVencimiento);
    }
}
