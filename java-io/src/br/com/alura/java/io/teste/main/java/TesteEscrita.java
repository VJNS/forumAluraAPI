import java.io.*;
import java.nio.charset.StandardCharsets;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Teste Escrita, favor desconsiderar");
        bw.newLine();
        bw.write("Houston, we have a problem!");

        bw.close();
    }
}
