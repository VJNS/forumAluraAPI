import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamWriter {

    public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter ps = new BufferedWriter(osw);

//        BufferedWriter ps = new BufferedWriter(new FileWriter("loren2.txt"));

        PrintStream ps = new PrintStream("lorem2.txt");

        ps.println("Cavalo de Troia - MC Kevin");
        ps.print("Invencible - Pop Smoke");

        ps.close();
    }
}
