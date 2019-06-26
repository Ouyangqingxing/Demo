package com.common.util;

public class StringUtils {

    /**
     * 判断是否为空
     */
    public static boolean isEmpty(final String str) {
        return (str == null) || (str.length() == 0);
    }

    /**
     * 判断是否不为空
     */
    public static boolean isNotEmpty(final String str) {
        return !isEmpty(str);
    }

    /**
     * 判断是否空白
     */
    public static boolean isBlank(final String str) {
        int strLen;
        if ((str == null) || ((strLen = str.length()) == 0))
            return true;
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断是否不是空白
     */
    public static boolean isNotBlank(final String str) {
        return !isBlank(str);
    }

}