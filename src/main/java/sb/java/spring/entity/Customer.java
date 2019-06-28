package sb.java.spring.entity;

import javax.persistence.*;

public class Customer {
    /**
     * 用户编号
     */
    @Id
    private Integer id;

    /**
     * 登录名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String names;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 联系号码
     */
    private String phone;

    /**
     * 状态
     */
    private String status;

    /**
     * 获取用户编号
     *
     * @return id - 用户编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户编号
     *
     * @param id 用户编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取登录名
     *
     * @return username - 登录名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置登录名
     *
     * @param username 登录名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取姓名
     *
     * @return names - 姓名
     */
    public String getNames() {
        return names;
    }

    /**
     * 设置姓名
     *
     * @param names 姓名
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取联系号码
     *
     * @return phone - 联系号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系号码
     *
     * @param phone 联系号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", password=" + password + ", names=" + names
				+ ", email=" + email + ", phone=" + phone + ", status=" + status + "]";
	}
}