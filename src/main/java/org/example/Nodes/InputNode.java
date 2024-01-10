package org.example.Nodes;

import org.example.Factory;
import org.example.Node;

import java.util.Random;

public class InputNode extends Node {
    public String variable;
    @Override
    public int getDepth(){
        return 1;
    }

    public InputNode(){
        this.variable = Factory.generateRandomVariable(0,4);
    }
    public String toString(){
        return String.format("input(%s)\n", this.variable);
    }
}
