import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Clasica tarjetaClasica = new Clasica("VISA", 1800000, "4093550032454656", (short) 129, new Date(2024,4, 0));
        System.out.println(tarjetaClasica.imprimir());

        Dorada tarjetaDorada = new Dorada("MASTERCARD", 3000000, "5412751234126456", (short) 784, new Date(2029,12, 0));
        System.out.println(tarjetaDorada.imprimir());

        Platinum tarjetaPlatinum = new Platinum("AMERICAN EXPRESS", 6500000, "375987654321001", (short) 617, new Date(2025,11, 0));
        System.out.println(tarjetaPlatinum.imprimir());

        Black tarjetaBlack = new Black("VISA", 12000000, "4000123456789010", (short) 879, new Date(2026,6, 0));
        System.out.println(tarjetaBlack.imprimir());

    }
}