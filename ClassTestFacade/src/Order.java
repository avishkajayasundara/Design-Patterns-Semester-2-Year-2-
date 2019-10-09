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
    private String orderId;
    Payment payment;
    Inventory inventory;
    
    public Order(String orderId) {
        this.orderId = orderId;
        inventory=new Inventory();
        payment=new Payment();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void placeOrder(){
        System.out.println("Order ID : "+orderId+". "+inventory.checkInventory(orderId)+". "+payment.processPayment(orderId));
    }
    
}
