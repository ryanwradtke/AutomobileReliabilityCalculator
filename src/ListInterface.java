/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public interface ListInterface<T> {
    
    void addNode(T t);
    double calcTotProblty(int days, T t);
    void prntList(T t);
    NodeInterface getRoot();
    
}
