package com.jtools.str;

/**
 * @author yi
 * @ClassName 关于字符串的工具类
 * @Description TODO
 * @Date
 **/
public class StringTools {


    /**
     * --------------------------------------------基本封装开始---------------------------------------------------------
     */

    /**
     * 判断非空 如果为true 表示为空 如果为false 表示非空
     */
    public static boolean isEmpty(String str) {

       return null == str || str.isEmpty();
    }


    /**
     * 判断两值是否相等
     */
    public static boolean isEquals(String str1,String str2) {
        /**
         * 如果都不为空 返回 true
         */
        if (notNullTwoStr(str1,str2)) {
            return str1.equals(str2);
        } else {
            return false;
        }


    }

    /**
     * 忽略大小写比较
     */
    public static boolean isEqualsIgnoreCase(String str1,String str2) {
        /**
         * 如果都不为空 返回 true
         */
        if (notNullTwoStr(str1,str2)) {
            return str1.equalsIgnoreCase(str2);
        } else {
            return false;
        }
    }

    /**
     * 小写字母转大写
     */
    public static String toUpperCase(String str) {
        if (!isEmpty(str)) {
            return str.toUpperCase();
        } else {
            return str;
        }
    }


    /**
     * 大写转小写
     */
    public static String toLowerCase(String str) {
        if (!isEmpty(str)) {
            return str.toLowerCase();
        } else {
            return str;
        }
    }

    /**
     * 两个字符串都不能为空的情况下 返回true
     * @param str1
     * @param str2
     * @return
     */
    private static boolean notNullTwoStr(String str1,String str2) {

       return notNullStrs(str1,str2);

    }


    /**
     * n个字符串不能为空
     * Object...args 可变参数 可以传n个
     * 只要有一个为空 返回false
     */
    public static boolean notNullStrs(String...args) {
        for (Object arg:args) {
           if (isEmpty((String)arg)) {
               return false;
           }
        }
        return true;
    }


    /** 111,112,113,114,   --> 111,112,113,114
     * 将字符串最后一位截取
     */
    public static String subString(String str) {
        if (!isEmpty(str)) {
            return subString(str,0,len(str)-1);
        } else {
            return "";
        }

    }

    /**
     * 重载上面的方法
     * @param sb
     * @return
     */
    public static String subString(StringBuilder sb) {
        return subString(String.valueOf(sb));
    }

    /**
     * 获取字符串长度
     * @param str
     * @return
     */
    public static int len(String str) {
        if (!isEmpty(str)) {
            return str.length();
        } else {
            return 0;
        }
    }


    public static String subString(String str,int bIndex, int eIndex) {
        if (!isEmpty(str)) {
            return str.substring(bIndex,eIndex);
        } else {
            return "";
        }
    }

    /**
     * 对应索引上的值
     * @param str
     * @param indexStr
     * @param args
     * @return
     */
    public static int indexOf(String str,String indexStr,Integer ... args) {
       switch (args.length){
           case 0:
               return str.indexOf(indexStr);
           case 1:
               return str.indexOf(indexStr,args[0]);
           case 2:
               return str.indexOf(args[0],args[1]);
       }
       return 0;
    }

    /**
     * --------------------------------------------基本封装结束---------------------------------------------------------
     */






















}
