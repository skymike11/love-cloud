package team.seckillorder.service.impl;

import org.springframework.stereotype.Component;
import team.seckillorder.service.IGoodsRemoteService;

@Component
public class IGoodsRemoteHystric implements IGoodsRemoteService {
    @Override
    public String sayGoods(String goods_id) {
        return "sorry , server sleep";
    }

    @Override
    public String sayTest() {
        return "sorry , server sleep";
    }
}
