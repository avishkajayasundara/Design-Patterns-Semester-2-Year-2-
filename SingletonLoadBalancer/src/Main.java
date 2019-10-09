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
        LoadBalancer l1=LoadBalancer.getInstance();
        for(int i=0;i<10;i++){
                    System.out.println("Request Dispatched to "+l1.nextServer());

        }
        
    }
}
