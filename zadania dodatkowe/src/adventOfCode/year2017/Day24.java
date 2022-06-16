package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day24 {

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input24.txt"));

        List<Component> components = new ArrayList<>();
        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split("/");
            Component component = new Component(Integer.parseInt(splitLine[0]), Integer.parseInt(splitLine[1]));
            components.add(component);
            line = filereader.readLine();
        }

        for(Component c: components){
            System.out.println(c);
        }

        filereader.close();

        List<Bridge> bridges = new ArrayList<>();
        Bridge bridge = new Bridge(components);
        bridges.add(bridge);

        Boolean changes = true;
        while(changes){
            int counter = 0;
            for(Bridge b: bridges){
                List<Component> componentsToRemove = new ArrayList<>();
                for(Component c: b.componentsToUse){
                    if(b.isItValid(c)){
                        counter += 1;
                        componentsToRemove.add(c);

                        Bridge newBridge = new Bridge();
                        newBridge.components = b.components;
                        newBridge.lastPort = b.lastPort;
                        newBridge.strength = b.strength;
                        newBridge.componentsToUse = b.componentsToUse;
                        newBridge.addComponent(c);
                        bridges.add(newBridge);
                    }
                }
                if(componentsToRemove.size()!=0){
                    for(Component c: componentsToRemove){
                        bridges.get(bridges.size()-1).componentsToUse.remove(c);
                    }
                }
                
            }
            if(counter == 0){
                changes = false;
            }
        }

        for(Bridge b: bridges){
            System.out.println(b.strength);
        }

    }

    private static class Bridge{
        List<Component> components = new ArrayList<>();
        List<Component> componentsToUse = new ArrayList<>();
        int lastPort = 0;
        int strength = 0;

        Bridge(){

        }

        Bridge(List<Component> componentsToUse){
            this.componentsToUse = componentsToUse;
        }
        
        Boolean isItValid(Component component){
            if(components.size() == 0){
                if(component.port1 == 0 || component.port2 == 0){
                    return true;
                }
            } else{
                if(component.port1 == lastPort || component.port2 == lastPort){
                    return true;
                }
            }
            return false;
        }

        void addComponent(Component component){
            if(isItValid(component)){
                if(component.port1 == lastPort){
                    lastPort = component.port2;
                } else{
                    lastPort = component.port1;
                }
                components.add(component);
                strength += component.port1 + component.port2;
            }
        }
    }

    private static class Component{
        int port1 = 0;
        int port2 = 0;

        Component(){

        }

        Component(int port1, int port2){
            this.port1 = port1;
            this.port2 = port2;
        }

        @Override
        public String toString() {
            return "Component [port1=" + port1 + ", port2=" + port2 + "]";
        }

    }
}
