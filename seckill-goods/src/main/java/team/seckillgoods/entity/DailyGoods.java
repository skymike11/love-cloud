package team.seckillgoods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 商品信息表
 * </p>
 *
 * @author van
 * @since 2019-12-05
 */
public class DailyGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dailygoodsid
     */
    @TableId(value = "daily_goods_id", type = IdType.AUTO)
    private Long dailyGoodsId;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品的图片，多个图片以‘,’分割
     */
    private String images;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 销售价格
     */
    private Long price;

    /**
     * 商品规格参数json键值对，反序列化时请使用linkedHashMap，保证有序
     */
    private String ownSpec;

    /**
     * 是否有效，0无效，1有效
     */
    private Boolean enable;

    /**
     * 添加时间
     */
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime updateTime;


    public Long getDailyGoodsId() {
        return dailyGoodsId;
    }

    public DailyGoods setDailyGoodsId(Long dailyGoodsId) {
        this.dailyGoodsId = dailyGoodsId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public DailyGoods setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getImages() {
        return images;
    }

    public DailyGoods setImages(String images) {
        this.images = images;
        return this;
    }

    public Integer getStock() {
        return stock;
    }

    public DailyGoods setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public DailyGoods setPrice(Long price) {
        this.price = price;
        return this;
    }

    public String getOwnSpec() {
        return ownSpec;
    }

    public DailyGoods setOwnSpec(String ownSpec) {
        this.ownSpec = ownSpec;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public DailyGoods setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public DailyGoods setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public DailyGoods setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "DailyGoods{" +
        "dailyGoodsId=" + dailyGoodsId +
        ", title=" + title +
        ", images=" + images +
        ", stock=" + stock +
        ", price=" + price +
        ", ownSpec=" + ownSpec +
        ", enable=" + enable +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
