/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public abstract class Tree_Decorator implements Tree {
    Tree tree;

    public Tree_Decorator(Tree tree) {
        this.tree = tree;
    }
    
    @Override
    public void display() {
        tree.display();
        
    }
    
}
