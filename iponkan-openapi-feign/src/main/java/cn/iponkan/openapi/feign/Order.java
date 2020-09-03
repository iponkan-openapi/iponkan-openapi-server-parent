package cn.iponkan.openapi.feign;

import java.io.Serializable;

/**
 * @author dongtangqiang
 */
public class Order implements Serializable {
    /**
     * 单据uuid
     */
    private String id;
    /**
     * 单号
     */
    private String number;
    /**
     * 来源
     */
    private String source;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
