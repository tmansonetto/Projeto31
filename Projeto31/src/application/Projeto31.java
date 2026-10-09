package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Projeto31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        Set<Integer> setC = new HashSet<>();

        System.out.print("Quantos estudantes no curso A? : ");
        int quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            setA.add(input.nextInt());
        }

        System.out.print("Quantos estudantes no curso B? : ");
         quantidade = input.nextInt();
         for (int i = 1; i <= quantidade; i++) {
             setB.add(input.nextInt());
         }
         System.out.print("Quantos estudantes no curso C? : ");
         quantidade = input.nextInt();
         for  (int i = 1; i <= quantidade; i++) {
             setC.add(input.nextInt());
         }

         Set<Integer> totalSet = new HashSet<>(setA);
         totalSet.addAll(setB);
         totalSet.addAll(setC);

         System.out.println("Total de estudantes: " + totalSet.size());

        input.close();
    }
}
