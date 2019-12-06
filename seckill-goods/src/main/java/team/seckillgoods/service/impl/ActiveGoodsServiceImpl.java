package team.seckillgoods.service.impl;

import team.seckillgoods.entity.ActiveGoods;
import team.seckillgoods.mapper.ActiveGoodsMapper;
import team.seckillgoods.service.IActiveGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 秒杀商品信息表 服务实现类
 * </p>
 *
 * @author van
 * @since 2019-12-05
 */
@Service
public class ActiveGoodsServiceImpl extends ServiceImpl<ActiveGoodsMapper, ActiveGoods> implements IActiveGoodsService {

}
