/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Admin {
    private String name;
    private int id;
    private static Admin admin=new Admin("Avishka",23);
    private Admin(String name,int id){
        this.name=name;
        this.id=id;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public static Admin getInstance(){
        return admin;
    }
    public void printMessage(){
        System.out.println("Name : "+name+", Id : "+id);
    }
    
}
