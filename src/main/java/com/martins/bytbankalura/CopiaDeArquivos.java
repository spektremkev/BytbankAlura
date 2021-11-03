package com.martins.bytbankalura;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.InputStream;
import java.lang.ClassNotFoundException;
import java.io.BufferedWriter;
import java.net.Socket;


public class CopiaDeArquivos {

    public static void main(String[] args) {
        /*
        String origem = "C:\\Users\\martin\\Desktop\\arquivo.txt";
        String destino = "C:\\Users\\martin\\Desktop\\arquivo_copia.txt";
        


        try {
            
            // Cria um fluxo de entrada para o arquivo de origem
            java.io.FileInputStream fis = new java.io.FileInputStream(origem);
            
            // Cria um fluxo de saida para o arquivo de destino
            java.io.FileOutputStream fos = new java.io.FileOutputStream(destino);
            
            // Cria um buffer de bytes
            byte[] buffer = new byte[1024];
            
            // Lê os bytes do arquivo de origem e escreve no arquivo de destino
            int bytesLidos = fis.read(buffer);
            while (bytesLidos != -1) {
                fos.write(buffer, 0, bytesLidos);
                bytesLidos = fis.read(buffer);
            }
            
            // Fecha os fluxos de entrada e saida
            fis.close();
            fos.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
*/
    public static void main(String[] args)
{
    InputStream fis = new FileInputStream("lorem.txt");
    Reader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);

    String linha = br.readLine();

    while(linha != null) {
        System.out.println(linha);
        linha = br.readLine();
    }

    br.close();


}

}
