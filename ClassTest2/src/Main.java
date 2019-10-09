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
        Subscriber s=new Subscriber("Dilupa");
        Subscriber s1=new Subscriber("Avishka");
        NewsPaper paper=new NewsPaper("Daily Mirror");
        
        paper.registerObserver(s);
        paper.registerObserver(s1);
        
        paper.setAvailability("Available");
        paper.notifyObservers();
        
        
    }
}
