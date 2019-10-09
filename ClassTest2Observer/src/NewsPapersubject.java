/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public interface NewsPapersubject {
    public void registerObserver(Subscriber subscriber);
    public void removeObserver(Subscriber subscriber);
    public void notifyObservers();
}
