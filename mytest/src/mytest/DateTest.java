package mytest;

//引入日期包
// import java.util.Date;
import java.util.*;
import java.text.*;

public class DateTest{
	
	public static void main(String[] args){
		Date date = new Date();
		System.out.println(date.toString());
		//MM 是月份，mm 是分。HH 是 24 小时制，hh 是 12 小时制。
		//年份一般是四个数，所以对应 yyyy，其余大多数是两位数，所以都由两位字母表示。
		SimpleDateFormat simple = new SimpleDateFormat("G yyyy-MM-dd hh:mm:ss");
		System.out.println("SimpleDateFormate: " + simple.format(date));
		//如果减少日期表示的字母数量，展示的日期位数也相对减少，其中日期可以以两位、四位表示，月日时分秒可以以一位或两位表示，一位表示时，前缀 0 会被忽略。
		SimpleDateFormat simple2 = new SimpleDateFormat("G E yy-M-d h:m:s");
		System.out.println("SimpleDateFormate: " + simple2.format(date));
		
		
		//printf 格式化日期
		//%t表示格式化日期时间类型，%T是时间日期的大写形式，在%t之后用特定的字母表示不同的输出格式
		System.out.printf("全部日期和时间信息：%Tc",date);//%n 换行 c
		System.out.printf("%1$tD%n", date);		
		//
		System.out.printf("年-月-日格式：%tF%n",date);  
		// 
		System.out.printf("月/日/年格式：%tD%n",date);  
		//
		System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);  
		// 
		System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);  
		// 
		System.out.printf("HH:MM格式（24时制）：%tR",date);  
	}
}
