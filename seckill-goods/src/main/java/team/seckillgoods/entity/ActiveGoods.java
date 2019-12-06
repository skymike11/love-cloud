package team.seckillgoods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 秒杀商品信息表
 * </p>
 *
 * @author van
 * @since 2019-12-05
 */
public class ActiveGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * activegoodsid
     */
    @TableId(value = "active_goods_id", type = IdType.AUTO)
    private Long activeGoodsId;

    /**
     * dailygoodsid
     */
    private Long dailyGoodsId;

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


    public Long getActiveGoodsId() {
        return activeGoodsId;
    }

    public ActiveGoods setActiveGoodsId(Long activeGoodsId) {
        this.activeGoodsId = activeGoodsId;
        return this;
    }

    public Long getDailyGoodsId() {
        return dailyGoodsId;
    }

    public ActiveGoods setDailyGoodsId(Long dailyGoodsId) {
        this.dailyGoodsId = dailyGoodsId;
        return this;
    }

    public Long getQuanty() {
        return quanty;
    }

    public ActiveGoods setQuanty(Long quanty) {
        this.quanty = quanty;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public ActiveGoods setPrice(Long price) {
        this.price = price;
        return this;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public ActiveGoods setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public ActiveGoods setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    @Override
    public String toString() {
        return "ActiveGoods{" +
        "activeGoodsId=" + activeGoodsId +
        ", dailyGoodsId=" + dailyGoodsId +
        ", quanty=" + quanty +
        ", price=" + price +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        "}";
    }
}
