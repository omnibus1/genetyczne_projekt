package org.example.Nodes;

import org.example.Factory;
import org.example.Node;

import java.util.Random;

public class AssignmentNode extends Node {
    String firstVal;
    String secondVal;
    String operator;
    @Override
    public int getDepth(){
        return 1;
    }
    public AssignmentNode(){
        Random r = new Random();
        int x = r.nextInt(0,2);
        this.firstVal = Factory.generateRandomVariable(0,4);
        if(x==0){
            this.secondVal = Factory.generateRandomVariable(0,4);
        }
        else{
            this.secondVal = Factory.generateRandomValue(-5,5);
        }
        this.operator = Factory.generateRandomOperator();

    }
    public String toString(){
        return String.format("%s%s%s\n", this.firstVal, this.operator, this.secondVal);
    }
}
