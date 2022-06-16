package workWithFiles;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Training {

    
    private void WriteToFile(Scanner scanner, FileWriter filewriter) throws IOException{
        System.out.println("Podaj nazwę pliku: ");
        String path = scanner.nextLine();
        try{
            filewriter = new FileWriter(path);
            System.out.println("Podawaj linijki które chcesz zapisać: ");
            String lineToWrite = scanner.nextLine();
            while(!lineToWrite.equals("-")){
                lineToWrite += System.lineSeparator();
                filewriter.write(lineToWrite);
                lineToWrite = scanner.nextLine();
            }
            filewriter.close();
        } finally{
            if(filewriter!=null){
                filewriter.close();
            }
        }
    }

    private void HowManyLinesInFile(Scanner scanner, BufferedReader filreader) throws IOException{
        System.out.println("Podaj nazwę pliku: ");
        String path = scanner.nextLine();
        try{
            filreader = new BufferedReader(new FileReader(path));
            String line = filreader.readLine();
            int k = 0;
            while(line!=null){
                k += 1;
                line = filreader.readLine();
            }
            filreader.close();
            System.out.println(k);
        } finally{
            if(filreader != null){
                filreader.close();
            }
        }
    }

    
    //nie działa :/
    private void WriteButBinary(Scanner scanner, DataOutputStream outputStream) throws IOException{
        System.out.println("Podaj nazwę pliku: ");
        String path = scanner.nextLine();
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        try{
            outputStream = new DataOutputStream(new FileOutputStream(path));
            outputStream.writeInt(number);
            outputStream.close();
        } finally{
            if(outputStream != null){
                outputStream.close();
            }
        }
    }

    private void ReadButBinary(Scanner scanner, DataInputStream inputStream) throws IOException {
        System.out.println("Podaj nazwę pliku: ");
        String path = scanner.nextLine();
        try{
            inputStream = new DataInputStream(new FileInputStream(path));
            int number = inputStream.readInt();
            System.out.println(number);
            inputStream.close();
        } finally{
            if(inputStream != null){
                inputStream.close();
            }
        }
    }
    

    private ArrayList<String> readNamesTillMinus(Scanner scanner){
        ArrayList<String> array = new ArrayList<>();
        String name = scanner.nextLine();
        while(!name.equals("-")){
            array.add(name);
            name = scanner.nextLine();
        }
        return array;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        FileWriter filewriter = null;
        BufferedReader filereader = null;
        DataOutputStream outputStream = null;
        DataInputStream inputStream = null;
        Training program = new Training();
        
        
        System.out.println("Podawaj linijki które chcesz zapisać: ");
        program.WriteToFile(scanner, filewriter);
        program.HowManyLinesInFile(scanner, filereader);
        program.WriteButBinary(scanner, outputStream);
        program.ReadButBinary(scanner, inputStream);
        

        List<String> array = new ArrayList<>();
        array = program.readNamesTillMinus(scanner);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("human.bin"))) {
            output.writeObject(array);
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("human.bin"))) {
            ArrayList<String> readHuman = (ArrayList<String>) input.readObject();
            for(int i = 0; i<readHuman.size(); i++){
                System.out.println(readHuman.get(i));
            }
        }

    }

    
}
