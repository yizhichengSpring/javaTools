package com.jtools.number.asmd;

import com.jtools.number.NumberPlan;
import com.jtools.number.NumberTools;

/**
 * @author yi
 * @ClassName OperationDiv
 * @Description 除法公共类
 * @Date
 **/
public class OperationDiv implements NumberPlan {

    /**
     * 需要判断除数不能为0 否则抛出异常
     * @param n1
     * @param n2
     * @return
     */
    @Override
    public double operation(double n1, double n2) {
        if (NumberTools.isZero(n2)) {
            throw new ArithmeticException("By Zero");
        }

        return n1/n2;
    }
}
