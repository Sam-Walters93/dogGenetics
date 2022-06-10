/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.doggenetics;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stwal
 */
public class DogGenetics {

    public static void main(String[] args) {
        int total = 101;
        List<Integer> myIntArray = new ArrayList<Integer>();
        
        Scanner myScanner = new Scanner(System.in);
        
        String[] dogBreeds = {"German Shepard", "English Bulldog", "Cane Courso", "Great Dane", "Samoyed", "Great Pyr", "Labrador", "Poodle", "Afghan Hound", "Chihuahua", "Berenese Mountain Dog", "Australian Shepard", "Boxer", "Bull Terrier", "Pug", "St. Bernard", "Doberman", "Dachshund", "Bullmastiff"};
        
        System.out.println("What's your Doggo's name?");
        String dogName = myScanner.nextLine();
        
        
        for (int i = 0; i < 5; i++) {
            int random = (1 + (int)(Math.random() * ((dogBreeds.length - 1) + 1)));
            myIntArray.add(random);
        }
        
        
        System.out.println(myIntArray);
        int gene1 = (1 + (int)(Math.random() * ((100 - 1) + 1)));
        total -= gene1;
        int gene2 = (1 + (int)(Math.random() * ((total - 1) + 1)));
        total -= gene2;
        int gene3 = (1 + (int)(Math.random() * ((total - 1) + 1)));
        total -= gene3;
        int gene4 = (1 + (int)(Math.random() * ((total - 1) + 1)));
        total -= gene4;
        int gene5 = total;
        
        System.out.println(dogName + " is:");
        System.out.println(gene1 + "% " + dogBreeds[myIntArray.get(0)]);
        System.out.println(gene2 + "% " + dogBreeds[myIntArray.get(1)]);
        System.out.println(gene3 + "% " + dogBreeds[myIntArray.get(2)]);
        System.out.println(gene4 + "% " + dogBreeds[myIntArray.get(3)]);
        System.out.println(gene5 + "% " + dogBreeds[myIntArray.get(4)]);
        System.out.println("And most importantly, " + dogName + " is 100% perfect");
        
    }
}
