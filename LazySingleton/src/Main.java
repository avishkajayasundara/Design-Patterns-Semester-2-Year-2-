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
    
        Admin admin=Admin.getInstance();
        admin.setName("Amal");
        admin.setId(123);
        admin.printMessage();
}
}
