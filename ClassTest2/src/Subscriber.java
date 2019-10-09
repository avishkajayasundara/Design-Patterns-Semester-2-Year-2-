/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Subscriber implements Observer {
       private String name;

    public Subscriber(String name) {
        this.name = name;
    }

       
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
       
    @Override
    public void update(String string) {
        System.out.println("Subscriber "+name+" NewsPaper is now "+string);
        
    }
    
}
