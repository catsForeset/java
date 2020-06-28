package mytest;

//引入日期包
// import java.util.Date;
import java.util.*;
import java.text.*;

public class DateTest{
	
	public static void main(String[] args){
		Date date= new Date();
		System.out.println(date.toString());
		//MM 是月份，mm 是分。HH 是 24 小时制，hh 是 12 小时制。
		//年份一般是四个数，所以对应 yyyy，其余大多数是两位数，所以都由两位字母表示。
		SimpleDateFormat simple = new SimpleDateFormat(" G yyyy-MM-dd hh:mm:ss");
		System.out.println("SimpleDateFormate: " + simple.format(date));
		//如果减少日期表示的字母数量，展示的日期位数也相对减少，其中日期可以以两位、四位表示，月日时分秒可以以一位或两位表示，一位表示时，前缀 0 会被忽略。
		SimpleDateFormat simple2 = new SimpleDateFormat(" G yy-M-d h:m:s");
		System.out.println("SimpleDateFormate: " + simple2.format(date));
	}
}
