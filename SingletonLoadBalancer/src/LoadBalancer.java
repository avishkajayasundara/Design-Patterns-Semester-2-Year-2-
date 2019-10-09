
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LoadBalancer {
    private static LoadBalancer loadBalancer;
    private String[] servers=new String[5];
    private Random server=new Random();
    private LoadBalancer(){
        servers[0]="Server 1";
        servers[1]="Server 2";
        servers[2]="Server 3";
        servers[3]="Server 4";
        servers[4]="Server 5";
        
    
    };
    public String nextServer(){
        int number=server.nextInt(servers.length);
        return servers[number];
    }
    public static LoadBalancer getInstance(){
        if(loadBalancer==null){
            loadBalancer=new LoadBalancer();
        }
        return loadBalancer;
    }
    
    
    
}
