package cn.iponkan.openapi.feign;

import java.util.Date;

/**
 * 接口返回。
 *
 * @author xietao
 */
public class Response<T> {
    private boolean success;
    private String msg;
    private String code;
    private Date timestamp;
    private T payload;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Response{" + "success=" + success + ", msg='" + msg + '\'' + ", code='" + code + '\''
                + ", timestamp=" + timestamp + ", payload=" + payload + '}';
    }
}
