package com.muuyal.escala.interfaces;

import com.muuyal.escala.payment.Payment;
import java.util.List;

public interface PaymentDAO {

    public void save(Payment payment) throws Exception;
    public void update(Payment payment) throws Exception;
    public void delete(Payment payment) throws Exception;
    public List<Payment> findAll() throws Exception;
}
