
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        ArrayList strings=new ArrayList();
        strings.add("Avishka");
        strings.add("Chathura");
        strings.add("Tinogie");
        
        PrintableList p1=new PrintableListAdapter();
        p1.printList(strings);
        
    }
}
