/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Doll extends Tree_Decorator {
    
    public Doll(Tree tree) {
        super(tree);
    }
    @Override
    public void display(){
        tree.display();
        System.out.print("decorating with Dolls...");
    }
    
}
