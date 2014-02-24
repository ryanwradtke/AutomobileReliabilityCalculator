/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public interface NodeInterface<T> {
    
    /*
    *   Returns the type of node.
    */
    String getType();
    
    /*
    *   Returns the Prob of failure
    */
    double getProblty(int days);
    
    /*
    *   Returns the next node.
    */
    T getNext();
    
    void setNext(T t);

}
