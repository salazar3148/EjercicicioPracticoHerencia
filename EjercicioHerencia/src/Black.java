import java.util.Date;

public class Black extends TarjetaCredito{
    public Black(String emisor, long cupo, String numero, short cvv, Date fechaVencimiento) {
        super(emisor, cupo, numero, cvv, fechaVencimiento);
    }
}
