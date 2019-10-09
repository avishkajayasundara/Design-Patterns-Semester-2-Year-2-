/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Bulb extends Tree_Decorator {
    
    public Bulb(Tree tree) {
        super(tree);
    }
    @Override
    public void display(){
    tree.display();
        System.out.print("Adding Bulbs...");
    }
    
}
