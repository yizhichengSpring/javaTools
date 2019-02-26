package com.jtools.number.asmd;

import com.jtools.number.NumberPlan;

/**
 * @author yi
 * @ClassName OperationAdd
 * @Description 加法类
 * @Date
 **/
public class OperationAdd implements NumberPlan {


    @Override
    public double operation(double n1, double n2) {
        return n1+n2;
    }
}
