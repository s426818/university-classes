package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day22 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input22.txt"));

        //List<ArrayList<Integer>> grid = new ArrayList<>();
        List<Node> nodes = new ArrayList<>();

        String line = filereader.readLine();
        line = filereader.readLine();
        line = filereader.readLine();
        /*
        while(line!=null){
            String [] splitLine = line.split(" ");
            String [] fileSystem = splitLine[0].split("/");
            String [] nodeName = fileSystem[3].split("-");            
            int x = Integer.parseInt(nodeName[1].split("")[1]);
            int temp = x;
            List<Integer> untliXChanges = new ArrayList<>();
            while(x == temp && line!=null){
                int y = Integer.parseInt(nodeName[2].split("")[1]);
                untliXChanges.add(y);
            }
        }
        */

        while(line!=null){
            String [] informationAboutNode = line.split(" ");
            List<String> shortedInfo = new ArrayList<>();
            for(int i = 0; i < informationAboutNode.length; i++){
                if(!informationAboutNode[i].equals("")){
                    shortedInfo.add(informationAboutNode[i]);
                }
            }
            /*
            for(String s: shortedInfo){
                System.out.println(s);
            }
            */
            String [] fileSystem = shortedInfo.get(0).split("/");
            String [] nodeName = fileSystem[3].split("-");

            String xString = "";
            for(String s: nodeName[1].split("")){
                if(!s.equals("x")){
                    xString += s;
                }
            }
            int x = Integer.parseInt(xString);

            String yString = "";
            for(String s: nodeName[2].split("")){
                if(!s.equals("y")){
                    yString += s;
                }
            }
            int y = Integer.parseInt(yString);

            String sizeString = "";
            for(String s: shortedInfo.get(1).split("")){
                if(!s.equals("T")){
                    sizeString += s;
                }
            }
            int size = Integer.parseInt(sizeString);

            String usedString = "";
            for(String s: shortedInfo.get(2).split("")){
                if(!s.equals("T")){
                    usedString += s;
                }
            }
            int used = Integer.parseInt(usedString);

            String availibleString = "";
            for(String s: shortedInfo.get(3).split("")){
                if(!s.equals("T")){
                    availibleString += s;
                }
            }
            int availible = Integer.parseInt(availibleString);

            String usedPercentageString = "";
            for(String s: shortedInfo.get(4).split("")){
                if(!s.equals("%")){
                    usedPercentageString += s;
                }
            }
            int usedPercentage = Integer.parseInt(usedPercentageString);

            Node node = new Node(x, y, size, used, availible, usedPercentage);
            nodes.add(node);

            line = filereader.readLine();
        }

        // oba zliczają zbyt dużo
        // wciąż za dużo mimo warunku o pozycjach
        int counter = 0;
        for(int i = 0; i < nodes.size()-1; i++){
            for(int j = i+1; j < nodes.size(); j++){
                if(nodes.get(i).used != 0 && nodes.get(i).used <= nodes.get(j).availible && (nodes.get(i).positionX != nodes.get(j).positionX || nodes.get(i).positionY!= nodes.get(j).positionY)){
                    counter += 1;
                }
            }
        }

        int counterTwo = 0;
        for(Node n: nodes){
            for(Node no: nodes){
                if(n.positionX != no.positionX || n.positionY != no.positionY){
                    if(n.used != 0 && n.used <= no.availible){
                        counterTwo += 1;
                    }
                }
            }
        }

        System.out.println(counter);
        System.out.println(counterTwo);

        System.out.println(nodes.get(0).used);
        System.out.println(nodes.get(0).availible);
        System.out.println(nodes.get(0).size);

        /*
        for(Node n: nodes){
            System.out.print("x: ");
            System.out.print(n.positionX);
            System.out.print(", y: ");
            System.out.println(n.positionY);
        }
        */

        filereader.close();
    }

    private static class Node{
        int positionX = 0;
        int positionY = 0;
        int size = 0;
        int used = 0;
        int availible = 0;
        int usedPercentage = 0;

        private Node(){

        }

        private Node(int positionX, int positionY, int size, int used, int availible, int usedPercentage){
            this.positionX = positionX;
            this.positionY = positionY;
            this.size = size;
            this.used = used;
            this.availible = availible;
            this.usedPercentage = usedPercentage;
        }
    }

}
