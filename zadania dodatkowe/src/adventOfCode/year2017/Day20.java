package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day20 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input20.txt"));

        List<Particle> particles = new ArrayList<>();
        List<Particle> particlesCollisions = new ArrayList<>();
        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split(", ");
            String positions = splitLine[0].substring(3, splitLine[0].length()-1);
            String [] positionsSplit = positions.split(",");
            String velocities = splitLine[1].substring(3, splitLine[1].length()-1);
            String [] velocitiesSplit = velocities.split(",");
            String accelerations = splitLine[2].substring(3, splitLine[2].length()-1);
            String [] accelerationsSplit = accelerations.split(",");
            Particle particle = new Particle(positionsSplit[0], positionsSplit[1], positionsSplit[2], velocitiesSplit[0], velocitiesSplit[1], velocitiesSplit[2], accelerationsSplit[0], accelerationsSplit[1], accelerationsSplit[2]);
            particles.add(particle);
            particlesCollisions.add(particle);
            line = filereader.readLine();
        }

        for(int i = 0; i < 10000; i++){
            for(Particle p: particles){
                p.update();
            }
        }

        double min = Integer.MAX_VALUE;
        int position = Integer.MIN_VALUE;
        Set<Double> distances = new HashSet<>();
        for(int i = 0; i < particles.size(); i++){
            //System.out.println(p.distanceFrom000());
            double distance = particles.get(i).distanceFrom000();
            if(min > distance){
                min = distance;
                position = i;
            }
            distances.add(distance);
        }

        Set<Integer> collisions = new HashSet<>();
        List<Integer> collisionsList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            
            for(int j = 0; j < particlesCollisions.size(); j++){
                Particle particleJ = particlesCollisions.get(j);
                for(int k = 0; k < particlesCollisions.size(); k++){
                   if(j != k){
                    Particle particleK = particlesCollisions.get(k);
                    if(particleJ.positionX == particleK.positionX
                        && particleJ.positionY == particleK.positionY
                        && particleJ.positionZ == particleK.positionZ){
                            collisions.add(j);
                            collisions.add(k);
                    }
                   } 
                    
                }
            }
            
            for(int l = 0; l < collisions.size(); l++){
                int max = Collections.max(collisions);
                collisionsList.add(max);
                collisions.remove(max);
            }
            for(int l: collisionsList){
                System.out.print(collisionsList.size());
                particlesCollisions.remove(l);
            }
            for(Particle p: particlesCollisions){
                p.update();
            }
        }

        System.out.println(Collections.min(distances));
        System.out.println(min);
        System.out.println(position);

        System.out.println(particlesCollisions.size());

        filereader.close();
    }

    private static class Particle{
        double positionX = 0;
        double positionY = 0;
        double positionZ = 0;
        int velocityX = 0;
        int velocityY = 0;
        int velocityZ = 0;
        int accelerationX = 0;
        int accelerationY = 0;
        int accelerationZ = 0;

        private Particle(){

        }

        private Particle(String positionX, String positionY, String positionZ, 
                         String velocityX, String velocityY, String velocityZ, 
                         String accelerationX, String accelerationY, String accelerationZ){
            this.positionX = Integer.parseInt(positionX);
            this.positionY = Integer.parseInt(positionY);
            this.positionZ = Integer.parseInt(positionZ);
            this.velocityX = Integer.parseInt(velocityX);
            this.velocityY = Integer.parseInt(velocityY);
            this.velocityZ = Integer.parseInt(velocityZ);
            this.accelerationX = Integer.parseInt(accelerationX);
            this.accelerationY = Integer.parseInt(accelerationY);
            this.accelerationZ = Integer.parseInt(accelerationZ);
        }

        private void update(){
            velocityX += accelerationX;
            velocityY += accelerationY;
            velocityZ += accelerationZ;
            positionX += velocityX;
            positionY += velocityY;
            positionZ += velocityZ;
        }

        private double distanceFrom000(){
            return Math.abs(positionX) + Math.abs(positionY) + Math.abs(positionZ);
        }
    }

}
