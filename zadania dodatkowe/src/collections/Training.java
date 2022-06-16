package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Training {
    public static void main(String[] args) {
        Set<String> namesSet = new HashSet<>();
        Map<String, String> nameMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię lub \"-\" żeby zakończyć: ");
        String name = scanner.nextLine();
        while(!name.equals("-")){
            namesSet.add(name);
            name = scanner.nextLine();
        }
        for(String nameInSet: namesSet){
            System.out.println(nameInSet);
        }
        System.out.println("Teraz podawaj po dwa imiona lub \"-\" żeby zakończyć: ");
        name = scanner.nextLine();
        while(!name.equals("-")){
            String pairName = scanner.nextLine();
            nameMap.put(name, pairName);
            name = scanner.nextLine();
        }
        for(Map.Entry<String, String> entry: nameMap.entrySet()){
            System.out.println(entry.getKey() + " + " + entry.getValue());
        }
        scanner.close();
    }
}
