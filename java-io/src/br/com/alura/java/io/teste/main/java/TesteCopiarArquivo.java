import java.io.*;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        InputStream fis = System.in; //new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
        //  System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }

}
