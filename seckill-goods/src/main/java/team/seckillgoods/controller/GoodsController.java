package team.seckillgoods.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import team.seckillgoods.service.IGoodsService;

/**
 * <p>
 * 商品信息表 前端控制器
 * </p>
 *
 * @author van
 * @since 2019-12-06
 */
@RestController
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;
    @RequestMapping("/goods")
    public String index(@RequestParam String goods_id) {
        return goodsService.getById(goods_id).getTitle();
    }
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}

