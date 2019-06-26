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
    private String name;

    /**
     * 科类
     */
    private String section;

    /**
     * 个人描述
     */
    private String describe;

    /**
     * 推荐指数
     */
    private String recommendation;

    /**
     * 从医时间
     */
    private Integer year;

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
     * @return describe - 个人描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置个人描述
     *
     * @param describe 个人描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
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
     * @return year - 从医时间
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 设置从医时间
     *
     * @param year 从医时间
     */
    public void setYear(Integer year) {
        this.year = year;
    }
}