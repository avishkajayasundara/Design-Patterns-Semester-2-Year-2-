/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ColorDecorator extends RoomDecorator {
    
    public ColorDecorator(Room customRoom) {
        super(customRoom);
    }
    public String addColor(){
     return "Painting in Purple ";   
    }
    @Override
    public String showRoom(){
        return customRoom.showRoom()+addColor();
    }
    
    
}
