package com.usa.ciclo4.retociclo4.repository.crudrepository;


import java.util.Date;
import java.util.List;

import com.usa.ciclo4.retociclo4.model.Order;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    
    List<Order> findBySalesManZone(String zone);
    List<Order> findBySalesManId(Integer id);
    List<Order> findBySalesManIdAndStatus(Integer id, String status);
    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer id);

}
