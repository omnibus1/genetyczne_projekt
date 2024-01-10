package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.Factory.generateRandomNode;

public class Program {
    public String[] choices = {"input","assignment","if","while","output"};

    public int calculateFitness(){
        return Factory.getRandomValue(0,5);
    }

    public List<Node> nodes = new ArrayList<>();

    public void generate(int depth, int numberOfNodes){
        for(int i=0;i<numberOfNodes;i++){
            this.nodes.add(generateRandomNode(depth));
        }
    }


    public String toString(){
        String res = "";
        for(Node n:this.nodes){
            res += n.toString();
        }
        return res;
    }
    public void grow(int depth){
        for(int i=0;i<this.nodes.size();i++){
            int val = Factory.getRandomValue(0,100);
            if(val<=GP.MUTATE_CHANCE){
                this.nodes.set(i, Factory.generateRandomNode(depth));
            }
        }
    }

    public void cross(Program otherProgram, int crossPropability){
        for(int i=0;i<Math.min(this.nodes.size(),otherProgram.nodes.size());i++){
            int randomValue = Factory.getRandomValue(0,100);
            if(randomValue<crossPropability){
                this.nodes.set(i,otherProgram.nodes.get(i));
            }
        }
    }
}
