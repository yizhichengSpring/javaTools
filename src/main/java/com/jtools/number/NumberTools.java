package com.jtools.number;

import com.jtools.number.asmd.OperationAdd;
import com.jtools.number.asmd.OperationDiv;
import com.jtools.number.asmd.OperationMul;
import com.jtools.number.asmd.OperationSub;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
    public static BigDecimal setScale(double num,int scale) {

        return setScale(num,scale,RoundingMode.UNNECESSARY);


    }

    /**
     *
     * @param num   数字
     * @param scale 保留几位
     * @param rmode 进位类型
     * @return
     */
    public static BigDecimal setScale(double num,int scale,RoundingMode rmode) {
        BigDecimal bd = new BigDecimal(num);
        BigDecimal result = null;

        switch (rmode){
            case UP:
                result = bd.setScale(scale, RoundingMode.UP);
                 break;
            case DOWN:
                result = bd.setScale(scale,RoundingMode.DOWN);
                break;
            case FLOOR:
                result = bd.setScale(scale,RoundingMode.FLOOR);
                 break;
            case CEILING:
                result = bd.setScale(scale,RoundingMode.CEILING);
                 break;
            case HALF_UP:
                result = bd.setScale(scale,RoundingMode.HALF_UP);
                break;
            case HALF_DOWN:
                result = bd.setScale(scale,RoundingMode.HALF_DOWN);
                break;
            case HALF_EVEN:
                result = bd.setScale(scale,RoundingMode.HALF_EVEN);
                break;
            case UNNECESSARY:
                result = bd.setScale(scale,RoundingMode.UNNECESSARY);
                break;
               default:
                   return null;

        }

        return result;

    }









}
