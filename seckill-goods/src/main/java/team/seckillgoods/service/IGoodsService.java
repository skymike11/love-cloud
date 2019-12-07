package team.seckillgoods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import team.seckillgoods.entity.Goods;

/**
 * <p>
 * 商品信息表 服务类
 * </p>
 *
 * @author van
 * @since 2019-12-06
 */

public interface IGoodsService extends IService<Goods> {
    Long getGoodsNumber(String goods_id);
}
