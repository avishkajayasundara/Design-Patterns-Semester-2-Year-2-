/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SProtocol extends Channel_Decorator {
    
    public SProtocol(Channel channel) {
        super(channel);
    }
    @Override
    public void create(){
        channel.create();
        System.out.print("Added Security Protocol ");
    }
}
