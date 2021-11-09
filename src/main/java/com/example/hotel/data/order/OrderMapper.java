package com.example.hotel.data.order;

import com.example.hotel.po.Order;
import com.example.hotel.vo.OrderVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: chenyizong
 * @Date: 2020-03-04
 */
@Mapper
@Repository
public interface OrderMapper {

    int addOrder(Order order);

    List<Order> getAllOrders();

    List<Order> getExceptionalOrders();

//    List<Order> getUserHotelOrders(@Param("userid") int userid, @Param("hotelid") int hotelid);

    List<Order> getUserOrders(@Param("userid") int userid);

    List<Order> getUserHotelOrders(@Param("userid") int userid, @Param("hotelid") int hotelid);

    int annulOrder(@Param("orderid") int orderid);

    Order getOrderById(@Param("orderid") int orderid);

    int markOrderAsHandled(@Param("orderid") int orderid);

    void deleteByHotelId(Integer hotelId);

    void checkIn(Integer orderId);

    void checkOut(Integer orderId);

    void deleteById(Integer orderId);

    void setException(Integer orderId);
}
