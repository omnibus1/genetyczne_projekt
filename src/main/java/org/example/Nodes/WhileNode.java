package org.example.Nodes;

import org.example.Factory;
import org.example.GP;
import org.example.Node;

import java.util.ArrayList;
import java.util.List;

public class WhileNode extends Node {
    List<Node> nodeList = new ArrayList<>();
    BooleanNode condition;
    int indentAmount;
    @Override
    public int getDepth(){
        int res = 0;
        for(Node n:nodeList){
            res = Math.max(res, n.getDepth());
        }
        return res;
    }
    public WhileNode(int maxDepth){
        this.condition = new BooleanNode();
        this.indentAmount = GP.MAX_DEPTH-maxDepth;

        if(maxDepth>1){
            int numOfNodes = Factory.getRandomValue(2,4);
            for(int i=0;i<numOfNodes;i++){
                this.nodeList.add(Factory.generateRandomNode(maxDepth-1));
            }
        }
    }

    public String toString(){
        String indent ="";

        for(int i =0;i<this.indentAmount;i++){
            indent+="\t";
        }
        String res = String.format("while(%s){\n", this.condition);
        for(Node n:this.nodeList){
            res += indent + n.toString();
        }

        res+=indent.substring(0,indent.length()-1)+"}\n";
        return res;

    }
}
