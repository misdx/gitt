package com.cssl.utils;

import java.util.Random;

/**
 * Created by MBENBEN on 2018/9/4.
 */
public class ProductKeyUtil {

    public static String getProductKey() {
        Random random = new Random();
        Integer i = random.nextInt(9000) + 1000;
        return System.currentTimeMillis() + i.toString();
    }


}
