/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CircularList;

import Model.CharactersLibrary.Classes.Fighter;
import Model.CharactersLibrary.Intefaces.ILeveled;

/**
 *
 * @author Esteb
 */
public class Node {
    private ILeveled fighterOrItem; 
    
    private Node next; 
    private Node back;

    public Node(ILeveled fighter) {
        this.fighterOrItem = fighter;
    }
    
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getBack() {
        return back;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public ILeveled getIleveled() {
        return fighterOrItem;
    }
    
}
