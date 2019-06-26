package sb.java.spring.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="appointment")
public class Appointment {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 就诊日期
     */
    private Date treatmenttime;

    /**
     * 发病时间
     */
    private Date diseasetime;

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
     * 获取就诊日期
     *
     * @return treatmenttime - 就诊日期
     */
    public Date getTreatmenttime() {
        return treatmenttime;
    }

    /**
     * 设置就诊日期
     *
     * @param treatmenttime 就诊日期
     */
    public void setTreatmenttime(Date treatmenttime) {
        this.treatmenttime = treatmenttime;
    }

    /**
     * 获取发病时间
     *
     * @return diseasetime - 发病时间
     */
    public Date getDiseasetime() {
        return diseasetime;
    }

    /**
     * 设置发病时间
     *
     * @param diseasetime 发病时间
     */
    public void setDiseasetime(Date diseasetime) {
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
}