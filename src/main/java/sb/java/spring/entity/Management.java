package sb.java.spring.entity;

import javax.persistence.*;

public class Management {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 体重
     */
    private String weight;

    /**
     * 身高
     */
    private String height;

    /**
     * 血压
     */
    private String pressure;

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
     * 获取体重
     *
     * @return weight - 体重
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置体重
     *
     * @param weight 体重
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 获取身高
     *
     * @return height - 身高
     */
    public String getHeight() {
        return height;
    }

    /**
     * 设置身高
     *
     * @param height 身高
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * 获取血压
     *
     * @return pressure - 血压
     */
    public String getPressure() {
        return pressure;
    }

    /**
     * 设置血压
     *
     * @param pressure 血压
     */
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}