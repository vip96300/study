package com.hhf.study.client.controller.vo;

/**
 * @Author huanghongfei
 * @Description 显示对象VO
 * @Date Create in 10:20 2018/5/4
 */
public class ResultVo{

    public static ResultVo resultVo;

    private ResultVo(){}

    public static ResultVo instance(int code, String depict, Object data){
        if(resultVo==null){
            resultVo=new ResultVo();
        }
        resultVo.setCode(code);
        resultVo.setDepict(depict);
        resultVo.setData(data);
        return resultVo;
    }

    /**
     * 状态码
     */
    private int code;
    /**
     * 说明
     */
    private String depict;
    /**
     * 数据
     */
    private Object data;

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getDepict() {
        return depict;
    }
    public void setDepict(String depict) {
        this.depict = depict;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
