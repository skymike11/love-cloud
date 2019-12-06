package team.seckillorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import team.seckillorder.entity.Order;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author van
 * @since 2019-12-05
 */
public interface IOrderService extends IService<Order> {

    void createOrder(String daily_goods_id, Long user_id);
}
