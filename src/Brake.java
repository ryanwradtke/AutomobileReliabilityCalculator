/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class Brake implements NodeInterface<NodeInterface> {

    private static final String type = "Brake";
    private int mtbf1;
    private int mtbf2;
    private NodeInterface next;

    public Brake(int mtbf1, int mtbf2) {
        this.mtbf1 = mtbf1;
        this.mtbf2 = mtbf2;
    }

    @Override
    public String getType() {
        return type;
    }

    /*
    *   getProblty returns the problty of failure for two brakes running in 
    *   parrallel by multiplying the first failure rate by the second.  
    */
    
    @Override
    public double getProblty(int days) {
        return ((double)days/(double)mtbf1)*((double)days/(double)mtbf2);
    }

    @Override
    public NodeInterface getNext() {
        return next;
    }

    @Override
    public void setNext(NodeInterface next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Brake 1: " + mtbf1 + "\n" + "Brake 2: " + mtbf2;
    }
}
