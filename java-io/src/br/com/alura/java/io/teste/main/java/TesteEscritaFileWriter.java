import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("loren2.txt"));

        bw.write("Teste Escrita, favor desconsiderar");
        bw.write(System.lineSeparator());
        bw.write("Houston, we have a problem!");

        bw.close();
    }
}
