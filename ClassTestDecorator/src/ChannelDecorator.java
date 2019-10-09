/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public abstract class ChannelDecorator implements Channel {
    Channel channel;

    public ChannelDecorator(Channel channel) {
        this.channel = channel;
    }
    
    @Override
    public void create(){
        channel.create();
    }
}
