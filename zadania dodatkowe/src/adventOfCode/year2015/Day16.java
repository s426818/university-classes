package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day16 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input16.txt"));

        String line = filereader.readLine();

        List<Sue> aunts = new ArrayList<>();
        List<Sue> similarAunts = new ArrayList<>();
        List<Sue> betterSimilarAunts = new ArrayList<>();
        Sue sueWeLookFor = null;
        int number = 0;
        int children = -1;
        int cats = -1;
        int samoyeds = -1;
        int pomeranians = -1;
        int akitas = -1;
        int vizslas = -1;
        int goldfish = -1;
        int trees = -1;
        int cars = -1;
        int perfumes = -1;
        while(!line.equals("")){
            String [] splitLine = line.split(" ");
            if(splitLine[0].substring(0, splitLine[0].length()-1).equals("children")){
                children = Integer.parseInt(splitLine[1]);
            }
            if(splitLine[0].substring(0, splitLine[0].length()-1).equals("cats")){
                cats = Integer.parseInt(splitLine[1]);
            }
            if(splitLine[0].substring(0, splitLine[0].length()-1).equals("samoyeds")){
                samoyeds = Integer.parseInt(splitLine[1]);
            }
            if(splitLine[0].substring(0, splitLine[0].length()-1).equals("pomeranians")){
                pomeranians = Integer.parseInt(splitLine[1]);
            }
            if(splitLine[0].substring(0, splitLine[0].length()-1).equals("akitas")){
                akitas = Integer.parseInt(splitLine[1]);
            }
            if(splitLine[0].substring(0, splitLine[0].length()-1).equals("vizslas")){
                vizslas = Integer.parseInt(splitLine[1]);
            }
            if(splitLine[0].substring(0, splitLine[0].length()-1).equals("goldfish")){
                goldfish = Integer.parseInt(splitLine[1]);
            }
            if(splitLine[0].substring(0, splitLine[0].length()-1).equals("trees")){
                trees = Integer.parseInt(splitLine[1]);
            }
            if(splitLine[0].substring(0, splitLine[0].length()-1).equals("cars")){
                cars = Integer.parseInt(splitLine[1]);
            }
            if(splitLine[0].substring(0, splitLine[0].length()-1).equals("perfumes")){
                perfumes = Integer.parseInt(splitLine[1]);
            }
            sueWeLookFor = new Sue(number, children, cats, samoyeds, pomeranians, akitas, vizslas, goldfish, trees, cars, perfumes);
            line = filereader.readLine();
        }

        line = filereader.readLine();
        int k = 1;
        while(line!=null){
            number = k;
            children = -1;
            cats = -1;
            samoyeds = -1;
            pomeranians = -1;
            akitas = -1;
            vizslas = -1;
            goldfish = -1;
            trees = -1;
            cars = -1;
            perfumes = -1;
            Sue aunt = new Sue(number, children, cats, samoyeds, pomeranians, akitas, vizslas, goldfish, trees, cars, perfumes);
            aunt.setAttributes(line.split(" "));
            aunts.add(aunt);
            if(sueWeLookFor.similarity(aunt) == 3){
                similarAunts.add(aunt);
            }
            if(sueWeLookFor.betterSimilarity(aunt) == 3){
                betterSimilarAunts.add(aunt);
            }
            line = filereader.readLine();
            k += 1;
        }

        for(Sue sue: similarAunts){
            System.out.println(sue.number);
        }      
        for(Sue sue: betterSimilarAunts){
            System.out.println(sue.number);
        }     
        
        filereader.close();

    }

    private static class Sue{
        int number = -1;
        int children = -1;
        int cats = -1;
        int samoyeds = -1;
        int pomeranians = -1;
        int akitas = -1;
        int vizslas = -1;
        int goldfish = -1;
        int trees = -1;
        int cars = -1;
        int perfumes = -1;
        List<String> rememberedAttributes = new ArrayList<>();

        private Sue(int number, int children, int cats, int samoyeds, int pomeranians, int akitas, int vizslas, int goldfish, int trees, int cars, int perfumes){
            this.number = number;
            this.children = children;
            this.cats = cats;
            this.samoyeds = samoyeds;
            this.pomeranians = pomeranians;
            this.akitas = akitas;
            this.vizslas = vizslas;
            this.goldfish = goldfish;
            this.trees = trees;
            this.cars = cars;
            this.perfumes = perfumes;
        }

        private void setAttributes(String [] array){
            String [] atrributes = new String[3];
            atrributes[0] = array[2].substring(0, array[2].length()-1);
            atrributes[1] = array[4].substring(0, array[4].length()-1);
            atrributes[2] = array[6].substring(0, array[6].length()-1);
            int [] values = new int [3];
            values[0] = Integer.parseInt(array[3].substring(0, array[3].length()-1));
            values[1] = Integer.parseInt(array[5].substring(0, array[5].length()-1));
            values[2] = Integer.parseInt(array[7]);

            for(int i = 0; i < 3; i++){
                if(atrributes[i].equals("children")){
                    children = values[i];
                    rememberedAttributes.add("children");
                }
                if(atrributes[i].equals("cats")){
                    cats = values[i];
                    rememberedAttributes.add("cats");
                }
                if(atrributes[i].equals("samoyeds")){
                    samoyeds = values[i];
                    rememberedAttributes.add("samoyeds");
                }
                if(atrributes[i].equals("pomeranians")){
                    pomeranians = values[i];
                    rememberedAttributes.add("pomeranians");
                }
                if(atrributes[i].equals("akitas")){
                    akitas = values[i];
                    rememberedAttributes.add("akitas");
                }
                if(atrributes[i].equals("vizslas")){
                    vizslas = values[i];
                    rememberedAttributes.add("vizslas");
                }
                if(atrributes[i].equals("goldfish")){
                    goldfish = values[i];
                    rememberedAttributes.add("goldfish");
                }
                if(atrributes[i].equals("trees")){
                    trees = values[i];
                    rememberedAttributes.add("trees");
                }
                if(atrributes[i].equals("cars")){
                    cars = values[i];
                    rememberedAttributes.add("cars");
                }
                if(atrributes[i].equals("perfumes")){
                    perfumes = values[i];
                    rememberedAttributes.add("perfumes");
                }
            }
        }

        private void printAttributes(){
            System.out.println(number);
            System.out.println(children);
            System.out.println(cats);
            System.out.println(samoyeds);
            System.out.println(pomeranians);
            System.out.println(akitas);
            System.out.println(vizslas);
            System.out.println(goldfish);
            System.out.println(trees);
            System.out.println(cars);
            System.out.println(perfumes);
        }

        private int similarity(Sue sue){
            int counter = 0;
            for(String attribute : sue.rememberedAttributes){
                if(attribute.equals("children")){
                    if(children == sue.children){
                        counter += 1;
                    }
                }
                if(attribute.equals("cats")){
                    if(cats == sue.cats){
                        counter += 1;
                    }
                }
                if(attribute.equals("samoyeds")){
                    if(samoyeds == sue.samoyeds){
                        counter += 1;
                    }
                }
                if(attribute.equals("pomeranians")){
                    if(pomeranians == sue.pomeranians){
                        counter += 1;
                    }
                }
                if(attribute.equals("akitas")){
                    if(akitas == sue.akitas){
                        counter += 1;
                    }
                }
                if(attribute.equals("vizslas")){
                    if(vizslas == sue.vizslas){
                        counter += 1;
                    }
                }
                if(attribute.equals("goldfish")){
                    if(goldfish == sue.goldfish){
                        counter += 1;
                    }
                }
                if(attribute.equals("trees")){
                    if(trees == sue.trees){
                        counter += 1;
                    }
                }
                if(attribute.equals("cars")){
                    if(cars == sue.cars){
                        counter += 1;
                    }
                }
                if(attribute.equals("perfumes")){
                    if(perfumes == sue.perfumes){
                        counter += 1;
                    }
                }
            }
            return counter;
        }

        private int betterSimilarity(Sue sue){
            int counter = 0;
            for(String attribute : sue.rememberedAttributes){
                if(attribute.equals("children")){
                    if(children == sue.children){
                        counter += 1;
                    }
                }
                if(attribute.equals("cats")){
                    if(cats <= sue.cats){
                        counter += 1;
                    }
                }
                if(attribute.equals("samoyeds")){
                    if(samoyeds == sue.samoyeds){
                        counter += 1;
                    }
                }
                if(attribute.equals("pomeranians")){
                    if(pomeranians >= sue.pomeranians){
                        counter += 1;
                    }
                }
                if(attribute.equals("akitas")){
                    if(akitas == sue.akitas){
                        counter += 1;
                    }
                }
                if(attribute.equals("vizslas")){
                    if(vizslas == sue.vizslas){
                        counter += 1;
                    }
                }
                if(attribute.equals("goldfish")){
                    if(goldfish >= sue.goldfish){
                        counter += 1;
                    }
                }
                if(attribute.equals("trees")){
                    if(trees <= sue.trees){
                        counter += 1;
                    }
                }
                if(attribute.equals("cars")){
                    if(cars == sue.cars){
                        counter += 1;
                    }
                }
                if(attribute.equals("perfumes")){
                    if(perfumes == sue.perfumes){
                        counter += 1;
                    }
                }
            }
            return counter;
        }

    }
    
}
