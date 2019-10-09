/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public abstract class RoomDecorator implements Room {
    Room customRoom;

    public RoomDecorator(Room customRoom) {
        this.customRoom = customRoom;
    }
    @Override
    public String showRoom(){
        return customRoom.showRoom();
    }
}
