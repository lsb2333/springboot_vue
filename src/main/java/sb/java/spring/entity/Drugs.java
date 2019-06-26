package sb.java.spring.entity;

import java.util.Date;
import javax.persistence.*;

public class Drugs {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 价格
     */
    private String price;

    /**
     * 库存
     */
    private String stock;

    /**
     * 描述
     */
    private String describe;

    /**
     * 有效期
     */
    private Date term;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public String getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(String stock) {
        this.stock = stock;
    }

    /**
     * 获取描述
     *
     * @return describe - 描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置描述
     *
     * @param describe 描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 获取有效期
     *
     * @return term - 有效期
     */
    public Date getTerm() {
        return term;
    }

    /**
     * 设置有效期
     *
     * @param term 有效期
     */
    public void setTerm(Date term) {
        this.term = term;
    }
}