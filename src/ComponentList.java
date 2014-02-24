/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class ComponentList implements
        ListInterface<NodeInterface> {

    private static NodeInterface root;

    @Override
    public void addNode(NodeInterface newNode) {
        newNode.setNext(root);
        root = newNode;
    }
    
    /*
    *   calcTotProblty takes an int, days, and a NodeInterface, tRef.  It
    *   recursively iterates through the list, calling tRef.getProblty for each
    *   node and then multiplying it by the recursive call/return value of each
    *   nodes probibilty of failure.  Then it returns the rate of success: 
    *   i.e. 1 - totProblty or 1 - the rate of failure of all nodes multiplied
    *   by eachother.
    */
    
    @Override
    public double calcTotProblty(int days, NodeInterface tRef) {
        double totProblty;
        if (tRef.getNext() == null) {
            totProblty = tRef.getProblty(days);
            return totProblty;
        }
        totProblty = tRef.getProblty(days) * this.calcTotProblty(days,
                (NodeInterface) tRef.getNext());
        return (1 - totProblty);
    }

    /*
    *   prntList recursivly iterates through the list, printing each node as it 
    *   does so.  This occurs first in, first out.  First in, first out is
    *   accomplished by calling prntList(tRef.getNext()) and checking each time
    *   to see if this.getNext() is equal to null.  When it is equal to null,
    *   i.e. the first node entered, that node is printed and the return begins.
    *   After the first return, the code after the recursive call is implimented,
    *   thereby printing each node.
    */
    
    
    @Override
    public void prntList(NodeInterface tRef) {

        if (tRef.getNext() == null) {
            System.out.println(tRef);
            return;
        }
        this.prntList((NodeInterface) tRef.getNext());
        System.out.println(tRef);
    }

    @Override
    public NodeInterface getRoot() {
        return root;
    }

}
