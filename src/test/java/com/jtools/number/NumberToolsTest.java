package com.jtools.number;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberToolsTest {
    public static void main(String[] args) {
//       System.out.println(
//               NumberTools.calculator(1.0,0,OperateEnum.DIV)
//       );

        double value =  NumberTools.setScale(1352.125,2).doubleValue();
//        BigDecimal bd = new BigDecimal(134.11);
//        bd.setScale(1);
        System.out.println(value);
    }

}