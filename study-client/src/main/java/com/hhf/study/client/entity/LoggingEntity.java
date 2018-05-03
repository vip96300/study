package com.hhf.study.client.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 11:45 2018/5/2
 */
@Entity
@Table(name="study_logging")
public class LoggingEntity extends BaseEntity{

    public LoggingEntity(){}

    public LoggingEntity(String sessionId,String requestURI,String ip,String args,String userAgent,int status,String exception){
        this.sessionId=sessionId;
        this.requestURI=requestURI;
        this.ip=ip;
        this.args=args;
        this.userAgent=userAgent;
        this.status=status;
        this.exception=exception;
    }
    /**
     * 会话编号
     */
    @Column(nullable=false)
    private String sessionId;
    /**
     * 资源路径
     */
    @Column(nullable=false)
    private String requestURI;
    /**
     * ip地址
     */
    @Column(nullable=false)
    private String ip;
    /**
     * 参数
     */
    @Column()
    private String args;
    /**
     * user-agent
     */
    @Column(length=1000)
    private String userAgent;
    /**
     * 访问状态
     */
    @Column()
    private Integer status;
    /**
     * 异常信息
     */
    @Column(length=1000)
    private String exception;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getRequestURI() {
        return requestURI;
    }

    public void setRequestURI(String requestURI) {
        this.requestURI = requestURI;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
