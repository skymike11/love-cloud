package team.seckillgoods.service.impl;

import team.seckillgoods.entity.Goods;
import team.seckillgoods.mapper.GoodsMapper;
import team.seckillgoods.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息表 服务实现类
 * </p>
 *
 * @author van
 * @since 2019-12-06
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
