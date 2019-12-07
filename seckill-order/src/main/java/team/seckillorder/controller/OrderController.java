package team.seckillorder.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import team.seckillorder.service.IGoodsRemoteService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author van
 * @since 2019-12-06
 */
@RestController
public class OrderController {
    @Autowired
    IGoodsRemoteService goodsRemoteService;

    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public String index(@RequestParam(value = "goods_id") String goods_id) {
        return goodsRemoteService.sayGoods(goods_id);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return goodsRemoteService.sayTest();
    }
}

