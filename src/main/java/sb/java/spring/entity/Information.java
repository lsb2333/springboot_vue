package sb.java.spring.entity;

import java.util.Date;
import javax.persistence.*;

public class Information {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 名称
     */
    private String namespace;

    /**
     * 通知信息
     */
    private String info;

    /**
     * 通知时间
     */
    private Date infotime;

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
     * 获取名称
     *
     * @return namespace - 名称
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * 设置名称
     *
     * @param namespace 名称
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * 获取通知信息
     *
     * @return info - 通知信息
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置通知信息
     *
     * @param info 通知信息
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取通知时间
     *
     * @return infotime - 通知时间
     */
    public Date getInfotime() {
        return infotime;
    }

    /**
     * 设置通知时间
     *
     * @param infotime 通知时间
     */
    public void setInfotime(Date infotime) {
        this.infotime = infotime;
    }
}