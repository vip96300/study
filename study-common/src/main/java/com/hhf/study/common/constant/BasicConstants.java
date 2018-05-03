package com.hhf.study.common.constant;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 10:50 2018/4/11
 */
public class BasicConstants {

    /**
     * YN
     */
    public enum YN{
        YES(1),NO(0);
        private int flag;
        YN(int flag){
            this.flag=flag;
        }
        public int getValue(){
            return flag;
        }
    }
}
