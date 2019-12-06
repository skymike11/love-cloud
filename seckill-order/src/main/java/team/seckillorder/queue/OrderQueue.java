package team.seckillorder.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import team.seckillorder.entity.Order;
import team.seckillorder.service.IOrderService;

import java.util.Map;

/**
 * @Auther: wdd
 * @Date: 2019/9/13 10:46
 * @Description:
 */
@Component
public class OrderQueue {
    @Autowired
    private IOrderService orderService;

    @RabbitListener(queues = "order_queue")
    public void insertOrder(Order msg){
        //1、接收消息并输出
        System.out.println("消息队列order_queue接收消息："+msg);

        //2、调用一个写入订单方法
        orderService.saveOrUpdate(msg);

        //3、如果没写成功输出错误消息

        //4、成功输出消息
        System.out.println("数据库order处理消息成功！");
    }
}
