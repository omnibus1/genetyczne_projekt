package org.example;

public class Individual {
    public Program program = new Program();
    public Individual(int depth, int numberOfNodes){
        this.program.generate(depth, numberOfNodes);
    }
}
