/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Candy extends Tree_Decorator {
    
    public Candy(Tree tree) {
        super(tree);
    }
    @Override
    public void display(){
        tree.display();
        System.out.print("Decorating with Candy...");
                
    }
}
