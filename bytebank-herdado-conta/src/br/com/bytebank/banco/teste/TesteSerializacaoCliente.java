package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Valter");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("42508722968");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//        Cliente cliente = (Cliente) ois.readObject();
//        ois.close();
//        System.out.println(cliente.getCpf() + ", Nome: " + cliente.getNome());

        ContaCorrente cc = new ContaCorrente(4353, 8540578);
        cc.deposita(600.0);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();


    }
}
