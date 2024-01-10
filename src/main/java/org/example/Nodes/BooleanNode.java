package org.example.Nodes;

import org.example.Factory;
import org.example.Node;

import java.util.Random;

public class BooleanNode extends Node {
    String firstVal;
    String comparator;
    String secondVal;
    @Override
    public int getDepth() {
        return 1;
    }
    public BooleanNode(){
        Random r = new Random();
        int val = r.nextInt(0,2);
        if(val==0){
            this.firstVal = Factory.generateRandomVariable(0,4);
        }
        else{
            this.firstVal = Factory.generateRandomValue(-5,5);
        }
        this.comparator = Factory.generateRandomComparator();
        val = r.nextInt(0,2);
        if(val==0){
            this.secondVal = Factory.generateRandomVariable(0,4);
        }
        else{
            this.secondVal = Factory.generateRandomValue(-5,5);
        }
    }
    public String toString(){
        return this.firstVal+this.comparator+this.secondVal;
    }
}
