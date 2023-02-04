import java.util.Date;

public class TarjetaCredito {
    private String emisor;
    private long cupo;
    private String numero;
    private short cvv;
    private Date fechaVencimiento;

    public TarjetaCredito(){
    }

    public TarjetaCredito(String emisor, long cupo, String numero, short cvv, Date fechaVencimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numero = numero;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public long getCupo() {
        return cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public short getCvv() {
        return cvv;
    }

    public void setCvv(short cvv) {
        this.cvv = cvv;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String imprimir(){
        return "Numero: " + numero + " " + emisor + "\nFecha de vencimiento " + fechaVencimiento.getMonth() + "/" + fechaVencimiento.getYear() +
                " CVV: " + cvv + "\nCupo: " + cupo + "$.\n";
    }
}
