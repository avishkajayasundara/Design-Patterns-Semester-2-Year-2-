/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CtoFAdapter implements Temperature {

    @Override
    public double getTemperatureC(double temp) {
        double ftemp=(temp-32)*5/9;
                TempC t=new TempC();
                t.setTemp(ftemp);
                    return ftemp;
    }
    
}
