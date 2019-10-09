/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Order {
    Inventory inventory;
    Payment payment;
    
    public Order(){
        inventory=new Inventory();
        payment=new Payment();
        
    }
    public void placeOrder(String orderID){
        System.out.println(inventory.checkInventory(orderID)+payment.deductPayment(orderID));
        
    }
}
