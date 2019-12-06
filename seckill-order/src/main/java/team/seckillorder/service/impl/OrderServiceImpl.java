package team.seckillorder.service.impl;

import team.seckillorder.entity.Order;
import team.seckillorder.mapper.OrderMapper;
import team.seckillorder.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author van
 * @since 2019-12-06
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
