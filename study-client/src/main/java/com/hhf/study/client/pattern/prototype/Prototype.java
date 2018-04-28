package com.hhf.study.client.pattern.prototype;

import java.io.*;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 15:05 2018/4/23
 */
public class Prototype implements Cloneable{

    /**
     * 引用数据类型
     */
    private String str;
    /**
     * 基本数据类型
     */
    private int i;

    /**
     * 浅复制，基本数据类型重新创建，引用数据类型会指向原型的地址
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
        Prototype prototype=(Prototype) super.clone();
        return prototype;
    }

    /**
     * 深复制，基本数据类型和引用数据类型全部都重新创建
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写入字节数组输出流
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        //从输出流读出对象
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
