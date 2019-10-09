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
     
     RoomDecorator newRoom=new ColorDecorator(new CurtainDecorator(new SimpleRoom()));
     System.out.println("My New Room "+newRoom.showRoom());
     
     RoomDecorator newRoom1=new CurtainDecorator(new ColorDecorator(new SimpleRoom()));
     System.out.println("My new Room "+newRoom1.showRoom());
     
     RoomDecorator newRoom2=new ColorDecorator(new CurtainDecorator(new ColorDecorator(new SimpleRoom())));
     System.out.println("My new Room "+newRoom2.showRoom());
     
     
     
     
     
 }
}