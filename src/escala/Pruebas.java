package escala;

import com.muuyal.escala.dao.TravelDAOImpl;
import com.muuyal.escala.interfaces.TravelDAO;
import com.muuyal.escala.travel.Travel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pruebas {
    public static void main(String[] args) {
/*
        System.out.println(new Date());

        DateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
        String fecha = formato.format(new Date());
        System.out.println(fecha);
*/
        DateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
        Travel travel = new Travel(0,"", "", 0);
        /*
        travel.setId(3);
        travel.setName("Registro");
        travel.setDestination("A eliminar");
        travel.setDeparture("02/06/2019");
        travel.setDeadline("02/08/2019");
        travel.setPrice(9999);
        travel.setPayments(9);
        travel.setId(2);
        */

        try{
            TravelDAO dao = new TravelDAOImpl();
            //dao.registrar(travel);
            
            for (Travel t : dao.listar()){
                System.out.print(t.getId()+" ");
                System.out.print(t.getName()+" ");
                System.out.print(t.getDestination()+" ");
                System.out.print(t.getDeparture()+" ");
                System.out.print(t.getDeadline()+" ");
                System.out.print(t.getPrice()+" ");
                System.out.println(t.getPayments());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
