/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Subscriber implements SubscriberObject {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    
    @Override
    public void update(String availability) {
        System.out.println("Updating : "+name+".NewsPaper availability : "+availability);
    }
    
}
