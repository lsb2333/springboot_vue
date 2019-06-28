package sb.java.spring.entity;

import javax.persistence.*;

@Table(name = "health_insurance")
public class HealthInsurance {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 学号
     */
    @Column(name = "student_no")
    private String studentNo;

    /**
     * 姓名
     */
    private String username;

    /**
     * 系别
     */
    private String dept;

    /**
     * 年级
     */
    private String grade;

    /**
     * 专业
     */
    private String major;

    /**
     * 班级
     */
    private String glass;

    /**
     * 医保卡号
     */
    @Column(name = "card_no")
    private String cardNo;

    /**
     * 身份证卡号
     */
    @Column(name = "id_no")
    private String idNo;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 开始日期
     */
    @Column(name = "start_date")
    private String startDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    private String endDate;

    /**
     * 状态
     */
    @Column(name = "hi_status")
    private String hiStatus;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取学号
     *
     * @return student_no - 学号
     */
    public String getStudentNo() {
        return studentNo;
    }

    /**
     * 设置学号
     *
     * @param studentNo 学号
     */
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
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
     * 获取系别
     *
     * @return dept - 系别
     */
    public String getDept() {
        return dept;
    }

    /**
     * 设置系别
     *
     * @param dept 系别
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * 获取年级
     *
     * @return grade - 年级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置年级
     *
     * @param grade 年级
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取专业
     *
     * @return major - 专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置专业
     *
     * @param major 专业
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 获取班级
     *
     * @return glass - 班级
     */
    public String getGlass() {
        return glass;
    }

    /**
     * 设置班级
     *
     * @param glass 班级
     */
    public void setGlass(String glass) {
        this.glass = glass;
    }

    /**
     * 获取医保卡号
     *
     * @return card_no - 医保卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置医保卡号
     *
     * @param cardNo 医保卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * 获取身份证卡号
     *
     * @return id_no - 身份证卡号
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置身份证卡号
     *
     * @param idNo 身份证卡号
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * 获取电话
     *
     * @return mobile - 电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置电话
     *
     * @param mobile 电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取开始日期
     *
     * @return start_date - 开始日期
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 设置开始日期
     *
     * @param startDate 开始日期
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束日期
     *
     * @return end_date - 结束日期
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 设置结束日期
     *
     * @param endDate 结束日期
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取状态
     *
     * @return hi_status - 状态
     */
    public String getHiStatus() {
        return hiStatus;
    }

    /**
     * 设置状态
     *
     * @param hiStatus 状态
     */
    public void setHiStatus(String hiStatus) {
        this.hiStatus = hiStatus;
    }

	@Override
	public String toString() {
		return "HealthInsurance [id=" + id + ", studentNo=" + studentNo + ", username=" + username + ", dept=" + dept
				+ ", grade=" + grade + ", major=" + major + ", glass=" + glass + ", cardNo=" + cardNo + ", idNo=" + idNo
				+ ", mobile=" + mobile + ", startDate=" + startDate + ", endDate=" + endDate + ", hiStatus=" + hiStatus
				+ "]";
	}
}