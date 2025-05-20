/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readcsv;

//[ebs] para leituras
import java.io.BufferedReader;
//[ebs] pode dar erro, então Exception de Entrada e Saída
import java.io.IOException;
//[ebs] métodos de caminho de arquivos
import java.nio.file.Files;
//[ebs] path para representar caminhos de arquivos
import java.nio.file.Path;
//[ebs] import paths para instancias do Path
import java.nio.file.Paths;


/**
 *
 * @author Erley Barbosa
 */
public class ReadCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = "src\\resources\\dados.csv";
        Path filePath = Paths.get(fileName);
        String delimiter = ";";
        
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            // store each line from file
            String line;
            int lineNumber = 0;
            
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] fields = line.split(delimiter);
                // write on console
                System.out.println( "Values:" + java.util.Arrays.toString(fields));

                // print line number
                System.out.println("Line " + lineNumber + ": ");
                for (int i = 0; i < fields.length; i++) {
                    // print each field
                    System.out.println(" Field " + (i + 1) + ": " + fields[i].trim());
                }
                System.out.println("-------------------------------------");
            }
        } catch (IOException e) {
            System.err.println("Read File Error: " + e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
