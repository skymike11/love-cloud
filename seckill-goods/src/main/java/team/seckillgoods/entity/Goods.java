package team.seckillgoods.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2019-12-06
 */
@TableName("t_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * goodsid
     */
    @TableId(value = "goods_id", type = IdType.AUTO)
    private Long goodsId;

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


    public Long getGoodsId() {
        return goodsId;
    }

    public Goods setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Goods setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getImages() {
        return images;
    }

    public Goods setImages(String images) {
        this.images = images;
        return this;
    }

    public Integer getStock() {
        return stock;
    }

    public Goods setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public Goods setPrice(Long price) {
        this.price = price;
        return this;
    }

    public String getOwnSpec() {
        return ownSpec;
    }

    public Goods setOwnSpec(String ownSpec) {
        this.ownSpec = ownSpec;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public Goods setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public Goods setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public Goods setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "Goods{" +
        "goodsId=" + goodsId +
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
