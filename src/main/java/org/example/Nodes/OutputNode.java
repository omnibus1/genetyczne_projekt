package org.example.Nodes;

import org.example.Factory;
import org.example.Node;

public class OutputNode extends Node {
    public String variable;
    @Override
    public int getDepth(){
        return 1;
    }
    public OutputNode(){
        this.variable = Factory.generateRandomVariable(0,4);
    }
    public String toString(){
        return String.format("output(%s)\n", this.variable);
    }
}
