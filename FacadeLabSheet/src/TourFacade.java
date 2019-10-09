/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TourFacade implements FacadeInterface {
    Hotel hotel;
    Transport transport;
    Flight flight;

    public TourFacade() {
        hotel=new Hotel();
        transport=new Transport();
        flight=new Flight();
        
    }

    
    @Override
    public void bookTour() {
        hotel.bookHotel();
        transport.arrangeTransport();
        flight.bookFlight();
        
    }
    
}
