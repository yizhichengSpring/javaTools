package com.jtools.number;

import com.jtools.number.asmd.OperationAdd;
import com.jtools.number.asmd.OperationDiv;
import com.jtools.number.asmd.OperationMul;
import com.jtools.number.asmd.OperationSub;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.ROUND_UNNECESSARY;

/**
 * @author yi
 * @ClassName NumberTools
 * @Description 关于数字的工具类
 * @Date
 **/
public class NumberTools {


    /**
     * 计算器
     * @param num1
     * @param num2
     * @param operateEnum 为了防止脏数据传入 所以定义枚举 只能从+、-、*、/ 四个选项中选择
     * @return
     */
    public static double calculator(double num1,double num2,OperateEnum operateEnum) {
        NumberPlan op = null;
        switch (operateEnum) {
            case ADD:
                op = new OperationAdd();
                break;
            case SUB:
                op = new OperationSub();
                break;
            case MUL:
                op = new OperationMul();
                break;
            case DIV:
                op = new OperationDiv();
                break;
                default:
                    return 0;
        }
        return op.operation(num1,num2);
    }


    /**
     * 除法中 除数不能为0 判断
     * @param num
     * @return
     */
    public static boolean isZero(double num) {
        return num == 0;
    }


    /**
     * 保留几位小数
     * 可以不写小数，保留方式
     * 默认给 UNNECESSARY
     * jdk也是这样做的，如果不指定进位方式，会抛异常
     * 真不知道jdk设计这个只有一个参数，不指定进位方式的方法是干嘛的。
     * 请见:BigDecimal 2512行 jdk version:1.8.0_121
     *
     */
    public static Object setScale(double num,int scale) {

        return setScale(num,scale,RoundingMode.UNNECESSARY);


    }


    /**
     * 保留几位小数
     */
    public static Object setScale(double num,int scale,RoundingMode rmode) {
        BigDecimal bd = new BigDecimal(num);
        switch (rmode){
            case UP:
                return bd.setScale(scale, RoundingMode.UP);
            case DOWN:
                return bd.setScale(scale,RoundingMode.DOWN);
            case FLOOR:
                return bd.setScale(scale,RoundingMode.FLOOR);
            case CEILING:
                return bd.setScale(scale,RoundingMode.CEILING);
            case HALF_UP:
               return bd.setScale(scale,RoundingMode.HALF_UP).doubleValue();
            case HALF_DOWN:
               return bd.setScale(scale,RoundingMode.HALF_DOWN);
            case HALF_EVEN:
               return bd.setScale(scale,RoundingMode.HALF_EVEN);
            case UNNECESSARY:
               return bd.setScale(scale,RoundingMode.UNNECESSARY);
               default:
                   return 0;

        }


    }


}
