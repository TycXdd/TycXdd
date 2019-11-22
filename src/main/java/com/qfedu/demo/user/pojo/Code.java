package com.qfedu.demo.user.pojo;

public class Code {
    private Integer code;
    private Object result;

    public Code() {
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Code{" +
                "code=" + code +
                ", result=" + result +
                '}';
    }
}
