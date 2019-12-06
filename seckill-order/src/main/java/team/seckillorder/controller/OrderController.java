package team.seckillorder.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import team.seckillorder.service.IOrderService;

import javax.servlet.http.HttpSession;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author van
 * @since 2019-12-05
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;
    @RequestMapping(value = "/createOrder/{user_id}/{daily_goods_id}")
    public void createOrder(@PathVariable("daily_goods_id") String daily_goods_id,
                            @PathVariable("user_id") Long user_id){
        orderService.createOrder(daily_goods_id, user_id);
    }
}