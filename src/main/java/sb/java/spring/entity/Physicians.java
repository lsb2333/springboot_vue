package sb.java.spring.entity;

import javax.persistence.*;

public class Physicians {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 内容
     */
    private String content;

    /**
     * 图片
     */
    private String image;

    /**
     * 医师名
     */
    private String username;

    /**
     * 医师医院
     */
    private String hospital;
    
    /**
     * 标题
     */
    private String title;

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
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
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
     * 获取医师名
     *
     * @return username - 医师名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置医师名
     *
     * @param username 医师名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取医师医院
     *
     * @return hospital - 医师医院
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * 设置医师医院
     *
     * @param hospital 医师医院
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

	@Override
	public String toString() {
		return "Physicians [id=" + id + ", content=" + content + ", image=" + image + ", username=" + username
				+ ", hospital=" + hospital + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}