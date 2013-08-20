package me.tspace.common.utils;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelUtils {
	public static String dateTime2String(Date date)throws Exception{
		if(date==null)
			return "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		return sdf.format(date);
	}
	public static String date2String(Date date)throws Exception{
		if(date==null)
			return "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	public static String getCurrentFlatDate()throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
		return sdf.format(new Date());
	}
	public static String returnString(String str){
		if(str==null)
			return "";
		return str;
	}
	
	public static String get4DigitalNumber(long id){
		 //得到一个NumberFormat的实例
        NumberFormat nf = NumberFormat.getInstance();
        //设置是否使用分组
        nf.setGroupingUsed(false);
        //设置最大整数位数
        nf.setMaximumIntegerDigits(4);
        //设置最小整数位数   
        nf.setMinimumIntegerDigits(4);
        //输出测试语句
       return  nf.format(id);
	}
}
