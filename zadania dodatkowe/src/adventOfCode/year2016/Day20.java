package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class Day20 {

    private static Boolean isRangeWider(Range a, Range b){
        if(a.start <= b.start && a.end >= b.end){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input20.txt"));

        List<Range> blocked = new ArrayList<>();
        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split("-");
            Range range = new Range(Long.parseLong(splitLine[0]), Long.parseLong(splitLine[1]));
            for(Range r: blocked){
                if(range.start >= r.start && range.start < r.end){
                    range.start = r.start;
                }
                if(range.end < r.end && range.end > r.start){
                    range.end = r.end;
                }                
            }
            if(!blocked.contains(range) && range.isValid()){
                List<Range> newBlocked = new ArrayList<>();
                for(Range r: blocked){
                    if(!isRangeWider(range, r)){
                        newBlocked.add(r);
                    }
                }
                blocked = newBlocked;
                blocked.add(range);
            }
            line = filereader.readLine();
        }

        for(Range r: blocked){
            System.out.print(r.start);
            System.out.print("-");
            System.out.println(r.end);
        }

        long k = 0;
        Boolean check = true;
        while(check){
            check = false;
            long temp = Integer.MIN_VALUE;
            for(Range r: blocked){
                if(r.isInRange(k)){
                    check = true;
                    if(temp < r.end + 1){
                        temp = r.end + 1;
                    }
                }
            }
            if(k < temp){
                k = temp;
            }            
        }

        System.out.println(k);

        /*
        System.out.print("Rozmiar przed: ");
        System.out.println(blocked.size());

        long size = blocked.size();
        Boolean changeSize = true;
        while(changeSize){
            changeSize = false;
            List<Range> lista = new ArrayList<>();
            for(int i = 0; i < blocked.size()-1; i++){
                Range [] listas = blocked.get(i).combine(blocked.get(i+1));
                for(Range r: listas){
                    lista.add(r);
                }
            }
            blocked = lista;
            if(blocked.size() < size){
                changeSize = true;
            }
        }

        System.out.print("Rozmiar po: ");
        System.out.println(blocked.size());
        */

        /*
        long counter = 0l;
        for(Range r: blocked){
            counter += r.end - r.start;
            counter += 1;
        }

        System.out.println(counter);
        long minus = Integer.MAX_VALUE + Integer.MAX_VALUE + 1;
        System.out.println(minus);
        System.out.println(minus - counter);
        */

        filereader.close();
    }

    private static class Range{
        long start = Long.MIN_VALUE;
        long end = Long.MAX_VALUE;

        private Range(){

        }

        private Range(long start, long end){
            this.start = start;
            this.end = end;
        }

        private Boolean isValid(){
            if(start <= end){
                return true;
            } else{
                return false;
            }
        }

        private Boolean isInRange(long k){
            if(k >= start && k <= end){
                return true;
            } else{
                return false;
            }
        }

        private Range [] combine(Range r){
            if(start > r.end || end < r.start){
                Range [] ranges = new Range [2];
                ranges[0] = this;
                ranges[1] = r;
                return ranges;
            } else{
                Range [] ranges = new Range [1];
                if(start > r.start && end > r.end){
                    ranges[0] = new Range(r.start, end);
                } else{
                    ranges[0] = new Range(start, r.end);
                }
                return ranges;
            }
        }
    }
    
}
