/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class Transmission implements NodeInterface<NodeInterface> {

    private static final String type = "Transmission";
    private int mtbf1;
    private NodeInterface next;

    public Transmission(int mtbf1) {
        this.mtbf1 = mtbf1;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getProblty(int days) {
        return (double)days/(double)mtbf1;
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
        return "Transmission: " + mtbf1;
    }

}
