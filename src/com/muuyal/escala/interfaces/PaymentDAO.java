package com.muuyal.escala.interfaces;

import com.muuyal.escala.payment.Payment;
import java.util.List;

public interface PaymentDAO {

    public void registrar(Payment payment) throws Exception;
    public void modificar(Payment payment) throws Exception;
    public void eliminar(Payment payment) throws Exception;
    public List<Payment> listar() throws Exception;
}
