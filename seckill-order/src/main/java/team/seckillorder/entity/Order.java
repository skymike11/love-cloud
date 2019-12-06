package team.seckillorder.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author van
 * @since 2019-12-06
 */
@TableName("t_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * orderid
     */
    @TableId(value = "order_id", type = IdType.AUTO)
    private Long orderId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总金额
     */
    private Long totalFee;

    /**
     * 订单的状态，1、未付款 2、已付款
     */
    private Boolean status;

    /**
     * 订单创建时间
     */
    private LocalDateTime createTime;

    /**
     * 订单支付时间
     */
    private LocalDateTime payTime;


    public Long getOrderId() {
        return orderId;
    }

    public Order setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public Order setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getTotalFee() {
        return totalFee;
    }

    public Order setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    public Boolean getStatus() {
        return status;
    }

    public Order setStatus(Boolean status) {
        this.status = status;
        return this;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public Order setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public Order setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
        "orderId=" + orderId +
        ", userId=" + userId +
        ", totalFee=" + totalFee +
        ", status=" + status +
        ", createTime=" + createTime +
        ", payTime=" + payTime +
        "}";
    }
}
