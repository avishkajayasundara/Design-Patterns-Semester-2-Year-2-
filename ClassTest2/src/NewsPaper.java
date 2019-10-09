
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewsPaper implements Subject {

    String availability;
    String name;

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Subscriber> getList() {
        return list;
    }

    public void setList(ArrayList<Subscriber> list) {
        this.list = list;
    }
    

    public NewsPaper(String name) {
        this.name = name;
    }
    
    ArrayList<Subscriber> list=new ArrayList<Subscriber>();
    
    @Override
    public void registerObserver(Subscriber observer) {
            list.add(observer);
    }
    
    @Override
    public void removeObserver(Subscriber observer) {
        list.remove(observer);
    }
    
    @Override
    public void notifyObservers() {
            System.out.println("Notifying all subscribers");
            for(Subscriber s:list){
                s.update(availability);
            }
    }
    
}
