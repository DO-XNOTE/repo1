package cn.itcast.api;

import org.springframework.core.convert.converter.Converter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SpringToDateConverter implements Converter<String, Date> {

    /**
     * String s 传入进来的字符串
     * @param s
     * @return
     */
    @Override
    public Date convert(String s) {
        // 判断
        if (s == null){
            throw new RuntimeException("请传入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        // 字符串转日期
        try {
            return  df.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
