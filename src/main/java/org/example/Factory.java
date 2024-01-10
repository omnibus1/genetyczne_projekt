package org.example;

import org.example.Nodes.*;

import java.util.Random;

public class Factory {
    static Random random = new Random();
    public static Node generateRandomNode(int depth){
        int val = random.nextInt(0,5);
        if(depth==1){
            val = random.nextInt(0,3);
        }

        if(val==0){
            return new InputNode();
        }
        else if(val==1){
            return new AssignmentNode();
        }
        else if(val==2){
            return new OutputNode();
        }
        else if(val==3){
            return new WhileNode(depth-1);
        }
        else{
            return new IfNode(depth-1);
        }
    }

    public static String generateRandomVariable(int lowerBound, int higherBount){
        int val = random.nextInt(lowerBound, higherBount);
        return "X"+val;
    }
    public static String generateRandomValue(int lowerBound, int higherBound){
        return String.valueOf(random.nextInt(lowerBound,higherBound));
    }
    public static String generateRandomOperator(){
        int val = random.nextInt(0,5);
        if(val==0){
            return "=";
        }
        else if(val==1){
            return "+=";
        }
        else if(val==2){
            return "-=";
        }
        else if(val==3){
            return "*=";
        }
        return "/=";
    }
    public static String generateRandomComparator(){
        int val = random.nextInt(0,5);
        if(val==0){
            return "==";
        }
        else if(val==1){
            return ">=";
        }
        return "<=";
    }
    public static int getRandomValue(int lowerBound, int upperBound){
        return random.nextInt(lowerBound, upperBound);
    }
}
