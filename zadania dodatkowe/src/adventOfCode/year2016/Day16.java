package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day16 {

    private static String addMoreData(String data, int desiredLength){
        while(data.length() < desiredLength){
            String extraData = "";
            for(int i = data.length()-1; i >= 0; i--){
                if(data.charAt(i) == '0'){
                    extraData += "1";
                } else{
                    extraData += "0";
                }
            }
            data += "0" + extraData;
        }
        if(data.length() > desiredLength){
            data = data.substring(0, desiredLength);
        }
        return data;
    }
    
    private static String countChecksum(String data){
        String checksum = "";
        String [] dataSplit = data.split("");
        for(int i = 0; i < dataSplit.length; i += 2){
            if(dataSplit[i].equals(dataSplit[i+1])){
                checksum += "1";
            } else{
                checksum += "0";
            }
        }
        while(checksum.length() % 2 == 0){
            checksum = countChecksum(checksum);
        }
        return checksum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input16.txt"));
        String data = filereader.readLine();
        String dataCopy = data;
        filereader.close();

        data = addMoreData(data, 272);
        String checksum = countChecksum(data);
        System.out.println(checksum);

        dataCopy = addMoreData(dataCopy, 35651584);
        String checksumCopy = countChecksum(dataCopy);
        System.out.println(checksumCopy);
    }
}
