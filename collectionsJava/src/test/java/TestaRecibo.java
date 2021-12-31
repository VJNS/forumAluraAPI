import java.util.TreeSet;

public class TestaRecibo {

    public static void main(String[] args) {

        Recibo rec1 = new Recibo("Valter", 340015, 1196.00);
        Recibo rec2 = new Recibo("Marcelo", 340016, 1491.00);
        Recibo rec3 = new Recibo("Erick", 340017, 1294.00);

        TreeSet<Recibo> recibos = new TreeSet<>();

        recibos.add(rec1);
        recibos.add(rec2);
        recibos.add(rec3);

    }
}
