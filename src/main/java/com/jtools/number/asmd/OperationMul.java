package com.jtools.number.asmd;

import com.jtools.number.NumberPlan;

/**
 * @author yi
 * @ClassName OperationMul
 * @Description TODO
 * @Date
 **/
public class OperationMul implements NumberPlan {

    @Override
    public double operation(double n1, double n2) {
        return n1*n2;
    }
}
