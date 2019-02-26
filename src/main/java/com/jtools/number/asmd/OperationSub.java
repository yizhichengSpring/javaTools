package com.jtools.number.asmd;

import com.jtools.number.NumberPlan;

/**
 * @author yi
 * @ClassName OperationSub
 * @Description 减法类
 * @Date
 **/
public class OperationSub implements NumberPlan {

    @Override
    public double operation(double n1, double n2) {
        return n1 - n2;
    }
}
