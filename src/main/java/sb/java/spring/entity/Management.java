package sb.java.spring.entity;

import javax.persistence.*;

public class Management {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 性别
     */
    private String sex;

    /**
     * 身高
     */
    private String height;

    /**
     * 正常体重
     */
    private String weight;

    /**
     * 正常血压
     */
    private String pressure;

    /**
     * 正常视力
     */
    private String sight;

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
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
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
     * 获取正常体重
     *
     * @return weight - 正常体重
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置正常体重
     *
     * @param weight 正常体重
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 获取正常血压
     *
     * @return pressure - 正常血压
     */
    public String getPressure() {
        return pressure;
    }

    /**
     * 设置正常血压
     *
     * @param pressure 正常血压
     */
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    /**
     * 获取正常视力
     *
     * @return sight - 正常视力
     */
    public String getSight() {
        return sight;
    }

    /**
     * 设置正常视力
     *
     * @param sight 正常视力
     */
    public void setSight(String sight) {
        this.sight = sight;
    }

	@Override
	public String toString() {
		return "Management [id=" + id + ", sex=" + sex + ", height=" + height + ", weight=" + weight + ", pressure="
				+ pressure + ", sight=" + sight + "]";
	}
}