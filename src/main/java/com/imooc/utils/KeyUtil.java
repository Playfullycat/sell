package com.imooc.utils;

import java.util.Random;

/**
 * @author yxl
 * @date 2018-12-18 21:26
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     *
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);

    }
}
