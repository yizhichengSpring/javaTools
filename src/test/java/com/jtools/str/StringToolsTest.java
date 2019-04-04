package com.jtools.str;

public class StringToolsTest {


    public static void main(String[] args) {
        String strs = "wW";
        //System.out.println(StringTools.isEmpty(strs));

        String str1 = "123";
        String str2 = "";
        //System.out.println(StringTools.isEqualsIgnoreCase(str1,str2));
       // System.out.println(StringTools.isEquals(str1,str2));
        //System.out.println(StringTools.toLowerCase(str1));

        //System.out.println(StringTools.notNullStr("","456"));

        //StringBuilder sb = new StringBuilder();
//        sb.append("1234567890");
        //System.out.println(StringTools.subString(sb));
        //System.out.println(StringTools.len(null));

        //System.out.println("abcde".indexOf(0,2));
        //System.out.println(StringTools.indexOf("abcdefg","d"));

        //System.out.println(StringTools.addStr("abcde").append("fgh").append("ijklmn"));

        //StringFormat sf = StringTools.addStr("123456",",");
        //System.out.println(sf.getStr());
        StringTools st = new StringTools();
        StringFormat sf = st
                .addStr("123",",")
                .addStr("456",",")
                .addStr("大家好");
        System.out.println(sf.toString());

        System.out.println(StringTools.positiveToHanStr(10));
    }





}