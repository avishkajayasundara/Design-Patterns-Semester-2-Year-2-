/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public interface Subject {
    public void registerObserver(Subscriber observer);
    public void removeObserver(Subscriber observer);
    public void notifyObservers();
    
}
