package sb.java.spring.entity;

import javax.persistence.*;

public class Drugs {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 图片
     */
    private String image;

    /**
     * 姓名
     */
    private String username;

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
    private String describes;

    /**
     * 有效期
     */
    private String term;

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
     * 获取图片
     *
     * @return image - 图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片
     *
     * @param image 图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取姓名
     *
     * @return username - 姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置姓名
     *
     * @param username 姓名
     */
    public void setUsername(String username) {
        this.username = username;
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
     * @return describes - 描述
     */
    public String getDescribes() {
        return describes;
    }

    /**
     * 设置描述
     *
     * @param describes 描述
     */
    public void setDescribes(String describes) {
        this.describes = describes;
    }

    /**
     * 获取有效期
     *
     * @return term - 有效期
     */
    public String getTerm() {
        return term;
    }

    /**
     * 设置有效期
     *
     * @param term 有效期
     */
    public void setTerm(String term) {
        this.term = term;
    }

	@Override
	public String toString() {
		return "Drugs [id=" + id + ", image=" + image + ", username=" + username + ", price=" + price + ", stock="
				+ stock + ", describes=" + describes + ", term=" + term + "]";
	}
}