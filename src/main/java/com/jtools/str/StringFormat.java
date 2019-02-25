package com.jtools.str;

/**
 * @author yi
 * @ClassName StringFormat
 * @Description TODO
 * @Date 18/02/25 21:25
 **/
public  class StringFormat {

    private static StringBuilder sb;

    private String s;


    static {

        sb = new StringBuilder();
    }


    public StringFormat() {

    }

    public StringFormat(String s) {
        this.s = s;
    }

    public synchronized  StringFormat addStr(Object str, String ... args) {
        s = sb.append(str).append(0 == args.length ?"":args[0]).toString();
        return new StringFormat(s);
    }


    @Override
    public String toString() {
        return s;
    }
}
