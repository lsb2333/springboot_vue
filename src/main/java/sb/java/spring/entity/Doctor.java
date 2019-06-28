package sb.java.spring.entity;

import javax.persistence.*;

public class Doctor {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 头像
     */
    private String image;

    /**
     * 姓名
     */
    private String username;

    /**
     * 科类
     */
    private String section;

    /**
     * 个人描述
     */
    private String describes;

    /**
     * 推荐指数
     */
    private String recommendation;

    /**
     * 从医时间
     */
    private Integer years;

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
     * 获取头像
     *
     * @return image - 头像
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置头像
     *
     * @param image 头像
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
     * 获取科类
     *
     * @return section - 科类
     */
    public String getSection() {
        return section;
    }

    /**
     * 设置科类
     *
     * @param section 科类
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * 获取个人描述
     *
     * @return describes - 个人描述
     */
    public String getDescribes() {
        return describes;
    }

    /**
     * 设置个人描述
     *
     * @param describes 个人描述
     */
    public void setDescribes(String describes) {
        this.describes = describes;
    }

    /**
     * 获取推荐指数
     *
     * @return recommendation - 推荐指数
     */
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * 设置推荐指数
     *
     * @param recommendation 推荐指数
     */
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * 获取从医时间
     *
     * @return years - 从医时间
     */
    public Integer getYears() {
        return years;
    }

    /**
     * 设置从医时间
     *
     * @param years 从医时间
     */
    public void setYears(Integer years) {
        this.years = years;
    }

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", image=" + image + ", username=" + username + ", section=" + section
				+ ", describes=" + describes + ", recommendation=" + recommendation + ", years=" + years + "]";
	}
}