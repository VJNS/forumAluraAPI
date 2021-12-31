import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

    public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter ps = new BufferedWriter(osw);

//        BufferedWriter ps = new BufferedWriter(new FileWriter("loren2.txt"));

//        PrintStream ps = new PrintStream("lorem2.txt");

        long ini = System.currentTimeMillis();

        PrintWriter pw = new PrintWriter("lorem2.txt", "UTF-8");

        pw.println("É sal - Matuê");
        pw.println("Dior - Pop Smoke");
        pw.print("SICKO MODE - Travis Scott");

        pw.close();

        long fim = System.currentTimeMillis();

        System.out.println("Passaram-se: " + (fim - ini) + " milissegundos");
    }
}
