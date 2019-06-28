package sb.java.spring.entity;

import javax.persistence.*;

public class Disease {
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
     * 名称
     */
    private String username;

    /**
     * 描述
     */
    private String describes;

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
     * 获取名称
     *
     * @return username - 名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置名称
     *
     * @param username 名称
     */
    public void setUsername(String username) {
        this.username = username;
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

	@Override
	public String toString() {
		return "Disease [id=" + id + ", image=" + image + ", username=" + username + ", describes=" + describes + "]";
	}
}