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
        NewsPaper n=new NewsPaper("Daily Mirror");
        Subscriber s1=new Subscriber("Avishka");
                Subscriber s2=new Subscriber("Dilupa");
        Subscriber s3=new Subscriber("Gayath");
     
        n.setAvailability("Available");
        n.registerObserver(s3);
        n.registerObserver(s2);
        n.registerObserver(s1);
        
        n.notifyObservers();
    }

        
}
