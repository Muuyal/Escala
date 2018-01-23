package escala;

import com.muuyal.escala.dao.PassengerDAOImpl;
import com.muuyal.escala.dao.PaymentDAOImpl;
import com.muuyal.escala.dao.TravelDAOImpl;
import com.muuyal.escala.interfaces.PassengersDAO;
import com.muuyal.escala.interfaces.PaymentDAO;
import com.muuyal.escala.interfaces.TravelDAO;
import com.muuyal.escala.passenger.Passenger;
import com.muuyal.escala.payment.Payment;
import com.muuyal.escala.travel.Travel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pruebas {
    public static void main(String[] args) {
    /*
        //Travel

        DateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
        String fecha = formato.format(new Date());

        Travel travel = new Travel(0, "","", 0);

        //travel.setId(3);
        //travel.setName("Potatoes");
        //travel.setDestination("Amarillo");
        //travel.setDeparture(fecha);
        //travel.setDeadline(fecha);
        //travel.setPrice(15000);
        //travel.setPayments(10);
        //travel.setId(3);

        try{
            TravelDAO dao = new TravelDAOImpl();
            //dao.eliminar(travel);

            dao.listar();

            for (Travel t : dao.listar()){

                System.out.print(t.getId()+" ");
                System.out.print(t.getName()+" ");
                System.out.print(t.getDestination()+" ");
                System.out.print(t.getDeparture()+" ");
                System.out.print(t.getDeadline()+" ");
                System.out.print(t.getPrice()+" ");
                System.out.println(t.getPayments()+" ");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    */

    /*
        //Passenger

        Passenger passenger = new Passenger("", "","", "");

        passenger.setId(2);
        passenger.setName("Potato");
        passenger.setTravel("Amarillo");
        passenger.setPhone("6391002487");
        passenger.seteMail("Anuma!!!");
        passenger.setAddressStreet("jajaja");
        passenger.setAddressCity("Soy pro");
        passenger.setAddressColony("niño ratta");
        passenger.setAddressPC(9080);
        passenger.setNotes("Hakeo feisbu y otras cosas");
        passenger.setId(2);

        try{

            PassengersDAO dao = new PassengerDAOImpl();
            //dao.modificar(passenger);

            dao.listar();

            for (Passenger p : dao.listar()){

                System.out.print(p.getId()+" ");
                System.out.print(p.getName()+" ");
                System.out.print(p.getTravel()+" ");
                System.out.print(p.getPhone()+" ");
                System.out.print(p.geteMail()+" ");
                System.out.print(p.getAddressStreet()+" ");
                System.out.print(p.getAddressCity()+" ");
                System.out.print(p.getAddressColony()+" ");
                System.out.print(p.getAddressPC()+" ");
                System.out.println(p.getNotes());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    */

    /*
        //Payment

        Payment payment = new Payment("","",0,"");
        /*payment.setId(3);
        payment.setUser("Papu");
        payment.setTravel("perro");
        payment.setPaymentAmount(1);
        payment.setTotal(2);
        payment.setAmountLeft(3);
        payment.setDate("01/01/1944");
        payment.setId(3);

        try{
            PaymentDAO dao = new PaymentDAOImpl();
            //dao.eliminar(payment);

            dao.listar();

            for (Payment p : dao.listar()){

                System.out.print(p.getId()+" ");
                System.out.print(p.getUser()+" ");
                System.out.print(p.getTravel()+" ");
                System.out.print(p.getPaymentAmount()+" ");
                System.out.print(p.getTotal()+" ");
                System.out.print(p.getAmountLeft()+" ");
                System.out.println(p.getDate()+" ");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    */

    

    }
}
