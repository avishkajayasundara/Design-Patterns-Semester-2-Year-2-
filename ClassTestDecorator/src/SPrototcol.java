/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SPrototcol extends ChannelDecorator {

    public SPrototcol(Channel channel) {
        super(channel);
    }

    
    
    @Override
    public void create(){
        channel.create();
        System.out.print("Security protocol implemented");
    }
}
