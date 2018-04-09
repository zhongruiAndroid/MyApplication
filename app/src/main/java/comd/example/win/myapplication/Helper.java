package comd.example.win.myapplication;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/4/9.
 */

public class Helper {
    protected  double chuFa(double d1,double d2) {
        return chuFa(d1,d2,2);
    }
    private  double chuFa(double d1,double d2,int scale) {
        //  当然在此之前，你要判断分母是否为0，
        //  为0你可以根据实际需求做相应的处理
        try {
            if(d2==0){
                throw new Exception("分母不能为0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.divide
                (bd2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    protected double chengFa(double d1,double d2){
        BigDecimal bd1 = new BigDecimal(d1);
        BigDecimal bd2 = new BigDecimal(d2);
        return round(bd1.multiply(bd2).doubleValue());
    }
    protected double round(double value) {
        return round(value,2, BigDecimal.ROUND_HALF_UP);
    }
    protected double round(double value, int scale,int roundingMode) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(scale, roundingMode);
        double d = bd.doubleValue();
        bd = null;
        return d;
    }
}
