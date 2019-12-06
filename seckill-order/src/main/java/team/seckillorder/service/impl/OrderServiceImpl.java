package team.seckillorder.service.impl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import team.seckillgoods.entity.DailyGoods;
import team.seckillgoods.service.IDailyGoodsService;
import team.seckillorder.entity.Order;
import team.seckillorder.mapper.OrderMapper;
import team.seckillorder.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.seckilluser.service.IUserService;

import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author van
 * @since 2019-12-05
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
    @Autowired
    IUserService userService;
    @Autowired
    IDailyGoodsService iDailyGoodsService;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Override
    public void createOrder(String daily_goods_id, Long user_id) {
        userService.getById(user_id);
        DailyGoods dailyGoods = iDailyGoodsService.getById(daily_goods_id);
        Order order = new Order();
        order.setUserId(user_id);
        order.setStatus(false);
        order.setTotalFee(dailyGoods.getPrice());
        orderMapper.insert(order);
        rabbitTemplate.convertAndSend("order_queue", order);
    }

}
