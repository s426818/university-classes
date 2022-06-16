package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day21 {

    private static int damageDealt(int damage, int armor){
        if(damage > armor){
            return damage - armor;
        } else{
            return 1;
        }
    }

    private static Boolean battle(Person player, Person boss){
        while(player.hitpoints > 0 && boss.hitpoints > 0){
            boss.hitpoints -= damageDealt(player.damage, boss.armor);
            if(boss.hitpoints > 0){
                player.hitpoints -= damageDealt(boss.damage, player.armor);
            }
        }
        if(player.hitpoints <= 0){
            
            System.out.println("Winner is boss."); 
            System.out.print("Player's hitpoints: ");
            System.out.println(player.hitpoints);
            System.out.print("Boss's hitpoints: ");
            System.out.println(boss.hitpoints);
            
            return false;
        } else{
            
            System.out.println("Winner is player.");
            System.out.print("Player's hitpoints: ");
            System.out.println(player.hitpoints);
            System.out.print("Boss's hitpoints: ");
            System.out.println(boss.hitpoints);
            
            return true;
        }
        
    }
    
    private static List<ArrayList<Weapon>> weaponChoice(List<Weapon> weapons){
        List<ArrayList<Weapon>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(Weapon weapon : weapons){
            ArrayList<Weapon> newWeapon = new ArrayList<>();
            newWeapon.add(weapon);
            list.add(newWeapon);
        }
        return list;
    }
    
    private static List<ArrayList<Armor>> armorChoice(List<Armor> armors){
        List<ArrayList<Armor>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(Armor armor : armors){
            ArrayList<Armor> newArmor = new ArrayList<>();
            newArmor.add(armor);
            list.add(newArmor);
        }
        return list;
    }

    /*
    private static List<ArrayList<Ring>> ringChoice(List<Ring> rings){
        List<ArrayList<Ring>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(Ring ring : rings){
            ArrayList<Ring> newRing = new ArrayList<>();
            newRing.add(ring);
            list.add(newRing);
            for(Ring secondRing : rings){
                if(!ring.equals(secondRing)){
                    ArrayList<Ring> twoRings = new ArrayList<>();
                    twoRings.add(ring);
                    twoRings.add(secondRing);
                    list.add(twoRings);
                }
            }
        }
        return list;
    }
    */

    private static List<ArrayList<Ring>> ringChoiceSecond(List<Ring> rings){
        List<ArrayList<Ring>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int i = 0; i < rings.size(); i++){
            ArrayList<Ring> newRing = new ArrayList<>();
            newRing.add(rings.get(i));
            list.add(newRing);
            for(int j = 0; j < i; j++){
                if(!rings.get(i).equals(rings.get(j))){
                    ArrayList<Ring> twoRings = new ArrayList<>();
                    twoRings.add(rings.get(i));
                    twoRings.add(rings.get(j));
                    list.add(twoRings);
                }
            }
        }
        return list;
    }

    private static List<ArrayList<Item>> generateItemChoice(List<ArrayList<Ring>> rings, List<ArrayList<Weapon>> weapons, List<ArrayList<Armor>> armors){
        List<ArrayList<Item>> list = new ArrayList<>();
        for(ArrayList<Weapon> listOfW : weapons){
            for(ArrayList<Armor> listOfArmor : armors){
                for(ArrayList<Ring> listOfRings : rings){
                    ArrayList<Item> newList = new ArrayList<>();
                    newList.addAll(listOfW);
                    newList.addAll(listOfArmor);
                    newList.addAll(listOfRings);
                    list.add(newList);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input21.txt"));

        List<Weapon> weapons = new ArrayList<>();
        weapons.add(new Weapon(8, 4, "Dagger"));
        weapons.add(new Weapon(10, 5, "Shortsword"));
        weapons.add(new Weapon(25, 6, "Warhammer"));
        weapons.add(new Weapon(40, 7, "Longsword"));
        weapons.add(new Weapon(74, 8, "Greataxe"));

        List<Armor> armors = new ArrayList<>();
        armors.add(new Armor(13, 1, "Leather"));
        armors.add(new Armor(31, 2, "Chainmail"));
        armors.add(new Armor(53, 3, "Splintmail"));
        armors.add(new Armor(75, 4, "Bandedmail"));
        armors.add(new Armor(102, 5, "Platemail"));

        List<Ring> rings = new ArrayList<>();
        rings.add(new Ring(25, 1, 0, "Damage +1"));
        rings.add(new Ring(50, 2, 0, "Damage +2"));
        rings.add(new Ring(100, 3, 0, "Damage +3"));
        rings.add(new Ring(20, 0, 1, "Defense +1"));
        rings.add(new Ring(40, 0, 2, "Defense +2"));
        rings.add(new Ring(80, 0, 3, "Defense +3"));

        Person player = new Person(8, 5, 5, new ArrayList<>());

        int bossHitpoints = Integer.parseInt(filereader.readLine().split(" ")[2]);
        Person boss = new Person(bossHitpoints, Integer.parseInt(filereader.readLine().split(" ")[1]), Integer.parseInt(filereader.readLine().split(" ")[1]), new ArrayList<>());
 
        //battle(player, boss);

        List<ArrayList<Armor>> chosenArmors = armorChoice(armors);
        List<ArrayList<Weapon>> chosenWeapons = weaponChoice(weapons);
        List<ArrayList<Ring>> chosenRings = ringChoiceSecond(rings);

        List<ArrayList<Item>> equipement = generateItemChoice(chosenRings, chosenWeapons, chosenArmors);

        /*
        for(ArrayList<Item> temp : equipement){
            for(Item r : temp){
                System.out.print(r.name);
            }
            System.out.println("");
        }
        */

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int k = 0;
        ArrayList<Item> winningEquipement = new ArrayList<>();
        ArrayList<Item> losingEquipement = new ArrayList<>();
        while(k < equipement.size()){
            boss.hitpoints = bossHitpoints;
            ArrayList<Item> chosenEquipement = equipement.get(k);
            if(chosenEquipement.size() == 0){
                player = new Person();
                if(battle(player, boss)){
                    min = 0;
                };
                boss.hitpoints = bossHitpoints;
                if(!battle(player, boss)){
                    max = 0;
                };
            } else{
                int damage = 0;
                int armor = 0;
                int cost = 0;
                for(Item item : chosenEquipement){
                    damage += item.damage;
                    armor += item.armor;
                    cost += item.cost;
                }
                player = new Person(100, damage, armor, chosenEquipement);
                if(battle(player, boss)){
                    if(cost < min){
                        min = cost;
                        winningEquipement = chosenEquipement;
                    }
                } else{
                    if(cost > max){
                        max = cost;
                        losingEquipement = chosenEquipement;
                    }
                }
                /*
                player.hitpoints = 100;
                boss.hitpoints = bossHitpoints;
                if(!battle(player, boss)){
                    System.out.println(cost);
                    if(cost > max){
                        max = cost;
                        losingEquipement = chosenEquipement;
                    }
                }
                */
                
            }
            k += 1;
        }

        System.out.println(min);
        System.out.println(max);

        for(Item r : winningEquipement){
            System.out.print(r.name);
        }
        System.out.println("");

        for(Item r : losingEquipement){
            System.out.print(r.name);
        }
        System.out.println("");

        boss.hitpoints = bossHitpoints;
        battle(new Person(100, 3, 8, new ArrayList<>()), boss);

        /*
        List<ArrayList<Ring>> test = ringChoiceSecond(rings);
        for(ArrayList<Ring> temp : test){
            for(Ring r : temp){
                System.out.print(r.name);
            }
            System.out.println("");
        }
        */

        filereader.close();

    }

    private static class Person{
        int hitpoints = 100;
        int damage = 0;
        int armor = 0;
        List<Item> items = new ArrayList<>();

        private Person(int hitpoints, int damage, int armor, List<Item> items){
            this.hitpoints = hitpoints;
            this.damage = damage;
            this.armor = armor;
            this.items = items;
        }

        private Person(){

        }

    }

    private abstract static class Item{
        int cost = 0;
        int damage = 0;
        int armor = 0;
        String name = "";

        private Item(int cost, int damage, int armor, String name){
            this.cost = cost;
            this.damage = damage;
            this.armor = armor;
            this.name = name;
        }
        private Item(){

        }
    }

    private static class Weapon extends Item{

        private Weapon(int cost, int damage, String name){
            this.cost = cost;
            this.damage = damage;
            this.name = name;
        }

    }

    private static class Armor extends Item{

        private Armor(int cost, int armor, String name){
            this.cost = cost;
            this.armor = armor;
            this.name = name;
        }

    }

    private static class Ring extends Item{

        private Ring(int cost, int damage, int armor, String name){
            this.cost = cost;
            this.damage = damage;
            this.armor = armor;
            this.name = name;
        }

    }
    
}
