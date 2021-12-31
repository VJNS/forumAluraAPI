import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.US_ASCII);

        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner linhaScanner = new Scanner(linha);

            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format("%s - %04d/%08d - %20s - %015.2f \r\n", tipoConta, agencia, numero, titular, saldo);

            linhaScanner.close();
        }

        scanner.close();
    }

}
