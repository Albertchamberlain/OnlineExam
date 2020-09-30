package com.amos.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Amos
 */
public class Msg {
    private  int code;
    private String msg;
    private Map<String ,Object> extend = new HashMap<String, Object>();

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
