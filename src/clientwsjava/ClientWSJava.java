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
        consultaLibres_1(2,7102015);
        reservaPlaza(2,7102015);
    }

    private static int consultaLibres(int idHotel, int fecha) {
        hotel.HotelWS_Service service = new hotel.HotelWS_Service();
        hotel.HotelWS port = service.getHotelWSPort();
        System.out.println("Hi ha "+port.consultaLibres(idHotel, fecha)+" lliures");
        return port.consultaLibres(idHotel, fecha);
    }

    private static int reservaHabitacion(int idHotel, int fecha) {
        hotel.HotelWS_Service service = new hotel.HotelWS_Service();
        hotel.HotelWS port = service.getHotelWSPort();
        System.out.println("S'ha reservat l'habitacio, ara queden "+port.reservaHabitacion(idHotel, fecha)+" lliures");
        return port.reservaHabitacion(idHotel, fecha);
    }

    private static int consultaLibres_1(int idVuelo, int fecha) {
        vuelo.VueloWS_Service service = new vuelo.VueloWS_Service();
        vuelo.VueloWS port = service.getVueloWSPort();
        System.out.println("Hi ha "+port.consultaLibres(idVuelo, fecha)+ " lliures");
        return port.consultaLibres(idVuelo, fecha);
    }

    private static int reservaPlaza(int idVuelo, int fecha) {
        vuelo.VueloWS_Service service = new vuelo.VueloWS_Service();
        vuelo.VueloWS port = service.getVueloWSPort();
        System.out.println("S'ha reservat el vol, ara queden "+port.reservaPlaza(idVuelo, fecha)+ " lliures");
        return port.reservaPlaza(idVuelo, fecha);
    }
    
}
