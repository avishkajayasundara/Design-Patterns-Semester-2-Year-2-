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
        Tree tree=new Bulb(new Doll(new Candy(new XMASTree())));
        tree.display();
    }
}
