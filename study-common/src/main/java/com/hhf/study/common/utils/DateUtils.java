package com.hhf.study.common.utils;

import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huanghongfei
 * @file DateUtils.java
 * @date 2017年12月11日 下午4:45:45
 * @declaration
 */
public class DateUtils {

    /**
     * 时间戳转日期
     *
     * @param timestamp
     * @return date
     */
    public static Date timestampToDate(long timestamp) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d = format.format(timestamp);
        Date date = null;
        try {
            date = format.parse(d);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

    /**
     * 获取日期时间字符串
     *
     * @param date
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String getTimeStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

    /**
     * 获取日期字符串
     *
     * @param date
     * @return yyyy-MM-dd
     */
    public static String getDateStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    /**
     * 获取月份字符串
     *
     * @param date
     * @return yyyy-mm
     */
    public static String getMonthStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        return format.format(date);
    }

    /**
     * 根据时间字符串获取时间
     *
     * @param time 1992-10-10 00:00:00
     * @return date
     */
    public static Date getTimeByStr(String time) {
        if (StringUtils.isEmpty(time)) {
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
