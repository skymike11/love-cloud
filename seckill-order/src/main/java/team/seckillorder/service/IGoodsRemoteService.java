package team.seckillorder.service;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;
import team.seckillorder.service.impl.IGoodsRemoteHystric;

@FeignClient(value = "seckill-goods", fallback = IGoodsRemoteHystric.class)
public interface IGoodsRemoteService {

    @RequestMapping(value ="/goods" ,method = RequestMethod.GET)
    String sayGoods(@RequestParam(value = "goods_id") String goods_id);

    @RequestMapping(value ="/test" ,method = RequestMethod.GET)
    String sayTest();
}
