package sb.java.spring.entity;

import javax.persistence.*;

public class Emr {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 病历名称
     */
    private String recordname;

    /**
     * 病历时间
     */
    private String recordtime;

    /**
     * 姓名
     */
    private String username;

    /**
     * 就诊日期
     */
    private String treatmenttime;

    /**
     * 发病时间
     */
    private String diseasetime;

    /**
     * 症状
     */
    private String symptom;

    /**
     * 状态
     */
    private String status;

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
     * 获取病历名称
     *
     * @return recordname - 病历名称
     */
    public String getRecordname() {
        return recordname;
    }

    /**
     * 设置病历名称
     *
     * @param recordname 病历名称
     */
    public void setRecordname(String recordname) {
        this.recordname = recordname;
    }

    /**
     * 获取病历时间
     *
     * @return recordtime - 病历时间
     */
    public String getRecordtime() {
        return recordtime;
    }

    /**
     * 设置病历时间
     *
     * @param recordtime 病历时间
     */
    public void setRecordtime(String recordtime) {
        this.recordtime = recordtime;
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
     * 获取就诊日期
     *
     * @return treatmenttime - 就诊日期
     */
    public String getTreatmenttime() {
        return treatmenttime;
    }

    /**
     * 设置就诊日期
     *
     * @param treatmenttime 就诊日期
     */
    public void setTreatmenttime(String treatmenttime) {
        this.treatmenttime = treatmenttime;
    }

    /**
     * 获取发病时间
     *
     * @return diseasetime - 发病时间
     */
    public String getDiseasetime() {
        return diseasetime;
    }

    /**
     * 设置发病时间
     *
     * @param diseasetime 发病时间
     */
    public void setDiseasetime(String diseasetime) {
        this.diseasetime = diseasetime;
    }

    /**
     * 获取症状
     *
     * @return symptom - 症状
     */
    public String getSymptom() {
        return symptom;
    }

    /**
     * 设置症状
     *
     * @param symptom 症状
     */
    public void setSymptom(String symptom) {
        this.symptom = symptom;
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
		return "Emr [id=" + id + ", recordname=" + recordname + ", recordtime=" + recordtime + ", username=" + username
				+ ", treatmenttime=" + treatmenttime + ", diseasetime=" + diseasetime + ", symptom=" + symptom
				+ ", status=" + status + "]";
	}
}