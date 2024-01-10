package org.example;

import java.util.Random;

public class GP {

    static Random rd = new Random();
    public static final int MAX_DEPTH = 5;

    public static final int POPULATION_SIZE = 4;
    static Individual [] population = new Individual[POPULATION_SIZE];

    static void CreatePopulation(int depth){
        for(int i = 0;i<POPULATION_SIZE;i++){
            population[i] = new Individual(depth,3);
        }
    }

    public static Individual generateRandomIndividual(int numberOfNodes){
        return new Individual(MAX_DEPTH,numberOfNodes);
    }
    static int CROSSOVER_CHANCE=50;
    static int MUTATE_CHANCE=25;
    public static void main(String[] args) {
        Individual random1 = generateRandomIndividual(2);
        Individual random2 = generateRandomIndividual(2);

        System.out.println(random1.program);
        System.out.println("==========================================");
        System.out.println(random2.program);
        System.out.println("==================CROSS===================");
        random1.program.cross(random2.program, CROSSOVER_CHANCE);
        System.out.println(random1.program);
        System.out.println("==================MUTATE==================");
        random1.program.grow(5);
        System.out.println(random1.program);
    }
}