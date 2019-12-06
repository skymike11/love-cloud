package team.seckillgoods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 秒杀商品信息表
 * </p>
 *
 * @author van
 * @since 2019-12-06
 */
@TableName("t_seckill_goods")
public class SeckillGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * seckillgoodsid
     */
    @TableId(value = "seckill_goods_id", type = IdType.AUTO)
    private Long seckillGoodsId;

    /**
     * goodsid
     */
    private String goodsId;

    /**
     * 数量
     */
    private Long quanty;

    /**
     * 秒杀价格
     */
    private Long price;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;


    public Long getSeckillGoodsId() {
        return seckillGoodsId;
    }

    public SeckillGoods setSeckillGoodsId(Long seckillGoodsId) {
        this.seckillGoodsId = seckillGoodsId;
        return this;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public SeckillGoods setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Long getQuanty() {
        return quanty;
    }

    public SeckillGoods setQuanty(Long quanty) {
        this.quanty = quanty;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public SeckillGoods setPrice(Long price) {
        this.price = price;
        return this;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public SeckillGoods setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public SeckillGoods setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    @Override
    public String toString() {
        return "SeckillGoods{" +
        "seckillGoodsId=" + seckillGoodsId +
        ", goodsId=" + goodsId +
        ", quanty=" + quanty +
        ", price=" + price +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        "}";
    }
}
