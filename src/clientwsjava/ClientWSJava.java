/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwsjava;

/**
 *
 * @author Rio
 */
public class ClientWSJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        consultaLibres(1,6102015);
        reservaHabitacion(1,6102015);
    }

    private static int consultaLibres(int idHotel, int fecha) {
        hotel.HotelWS_Service service = new hotel.HotelWS_Service();
        hotel.HotelWS port = service.getHotelWSPort();
        return port.consultaLibres(idHotel, fecha);
    }

    private static int reservaHabitacion(int idHotel, int fecha) {
        hotel.HotelWS_Service service = new hotel.HotelWS_Service();
        hotel.HotelWS port = service.getHotelWSPort();
        return port.reservaHabitacion(idHotel, fecha);
    }
    
}
