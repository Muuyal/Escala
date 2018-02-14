package escala;

import com.muuyal.escala.dao.*;
import com.muuyal.escala.interfaces.*;
import com.muuyal.escala.passenger.Passenger;
import com.muuyal.escala.payment.Payment;
import com.muuyal.escala.staff.Staff;
import com.muuyal.escala.travel.Travel;
import com.muuyal.escala.user.User;

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


        //Passenger

        Passenger passenger = new Passenger("", "","", "");

        /*passenger.setId(2);
        passenger.setName("Chihuahua - Cd de México");
        passenger.setTravel("CUU-CDMX");
        passenger.setPhone("6142098756");
        passenger.seteMail("correo.user2@gmail.com");
        passenger.setAddressStreet("Revolucion");
        passenger.setAddressCity("Delicias");
        passenger.setAddressColony("Centro sur");
        passenger.setAddressPC(33000);
        passenger.setNotes("Texto de nota establecido por mi en Itntelij XD");
        //passenger.setId(1);*/

        try{

            PassengersDAO dao = new PassengerDAOImpl();
            //dao.save(passenger);

            dao.findAll("CUU");

            for (Passenger p : dao.findAll("CUU")){

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

    /*
        //Staff

        Staff staff = new Staff("", "",0);

        /*staff.setId(3);
        staff.setName("Registro para eliminar");
        staff.seteMail("correo@correo.com");
        staff.setPhone("6141234567");
        staff.setAddress("No me acuerdo");
        staff.setArea("Seguridad");
        staff.setSalary(12000);
        staff.setUser("usuarioGenerico");
        staff.setPassword("passGenericaXD");
        staff.setId(3);

        try{
            StaffDAO dao = new StaffDAOImpl();
            //dao.eliminar(staff);

            dao.listar();

            for (Staff s : dao.listar()){

                System.out.print(s.getId()+" ");
                System.out.print(s.getName()+" ");
                System.out.print(s.geteMail()+" ");
                System.out.print(s.getPhone()+" ");
                System.out.print(s.getAddress()+" ");
                System.out.print(s.getArea()+" ");
                System.out.print(s.getSalary()+" ");
                System.out.print(s.getUser()+" ");
                System.out.println(s.getPassword());

            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
     */

    /*

        //User

        User user = new User("", "");

        user.setUserID("Jogeceva");
        user.setPassword("contaseñarenovada");
        user.setRol("Doctor");
        user.setUserID("Jogeceva");


        try{
            UserDAO dao = new UserDAOImpl();
            //dao.eliminar(user);

            dao.listar();

            for (User u : dao.listar()){

                System.out.print(u.getUserID()+" ");
                System.out.print(u.getPassword()+" ");
                System.out.println(u.getRol()+" ");

            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    */

    }
}
