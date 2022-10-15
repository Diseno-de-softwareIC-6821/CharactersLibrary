/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CircularList;

import Model.CharactersLibrary.Classes.Fighter;
import Model.CharactersLibrary.Intefaces.ILeveled;
import java.util.ArrayList;

/**
 *
 * @author Esteb
 */
public class CircularStructure {
    public Node first;
    public Node last;

    public CircularStructure() {
        first = null; 
        last = null;
    }
    private void insert(ILeveled selection){
        Node newNode  = new Node(selection);
        if(first == null){
            first = newNode;
            last = newNode; 
            newNode.setNext(first);
            newNode.setBack(last);
        }else{
            last.setNext(newNode);
            newNode.setNext(first);
            newNode.setBack(last);
            last = newNode;
            first.setBack(last);
        }
        System.out.println("\nNode added");
   }
    public void insert (ArrayList<ILeveled> list){
        for(ILeveled oneObject : list){
            insert(oneObject);
        }
    }
}
    

