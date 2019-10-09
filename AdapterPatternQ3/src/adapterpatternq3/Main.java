/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatternq3;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        Vector v=new Vector(3);
        v.add("Avishka");
        v.add("Gayath");
        v.add("Dilupa");
        
        Iterator iterator=new EnumIterator(v.elements());
        while(iterator.hasNext()){
            System.out.println("HAS NEXT");
            
        }
    }
}
