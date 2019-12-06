package team.seckillstock.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author van
 * @since 2019-12-05
 */
public class GoodsStock implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * goodsstockid
     */
    @TableId(value = "goods_stock_id", type = IdType.AUTO)
    private Long goodsStockId;

    /**
     * dailygoodsid
     */
    private Long dailyGoodsId;

    /**
     * 剩余数量
     */
    private BigDecimal quanty;


    public Long getGoodsStockId() {
        return goodsStockId;
    }

    public GoodsStock setGoodsStockId(Long goodsStockId) {
        this.goodsStockId = goodsStockId;
        return this;
    }

    public Long getDailyGoodsId() {
        return dailyGoodsId;
    }

    public GoodsStock setDailyGoodsId(Long dailyGoodsId) {
        this.dailyGoodsId = dailyGoodsId;
        return this;
    }

    public BigDecimal getQuanty() {
        return quanty;
    }

    public GoodsStock setQuanty(BigDecimal quanty) {
        this.quanty = quanty;
        return this;
    }

    @Override
    public String toString() {
        return "GoodsStock{" +
        "goodsStockId=" + goodsStockId +
        ", dailyGoodsId=" + dailyGoodsId +
        ", quanty=" + quanty +
        "}";
    }
}
