/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DCompression extends Channel_Decorator {
    
    public DCompression(Channel channel) {
        super(channel);
    }
    @Override
    public void create(){
        channel.create();
        System.out.print("Added data compression ");
    }
    
}
