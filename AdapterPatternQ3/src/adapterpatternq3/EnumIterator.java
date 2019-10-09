/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatternq3;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class EnumIterator implements Iterator {
    Enumeration enums;

    public EnumIterator(Enumeration enums) {
        this.enums = enums;
    }
    
    @Override
    public boolean hasNext() {
            return enums.hasMoreElements();
    }

    @Override
    public Object next() {
        return enums.nextElement();
    }

    @Override
    public void remove() {
        System.out.println("Item was removed");
    }
    
}
