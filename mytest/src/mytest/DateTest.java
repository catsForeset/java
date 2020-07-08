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
		System.out.printf("全部日期和时间信息：%Tc%n",date);//c ,全部日期格式
		System.out.printf("年-月-日格式：%tF%n",date);//F,年-月-日格式
		System.out.printf("月/日/年格式：%1$tD%n",date);//D,月/日/年格式,%1$t 是在 %t 中插入变量编号，1$ 表示变量 1，以 $ 符号结尾（此例只有一个变量）
		System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);//r,HH:MM:SS PM格式（12时制）
		System.out.printf("HH:MM格式（24时制）：%tR%n",date);//R,HH:MM格式（24时制）
		System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);//T,
		
		//%1$s 表示将第一个变量以字符串形式输出。%2$tc 表示将第二个变量以日期形式输出，并且以日期格式化 c 的形式输出。
		System.out.printf("%1$s %2$tc %n","String Part:",date);
		//其实 printf 有一套完整的用来输出日期格式的转换符，和 SimpleDateFormat 完全不一样
		System.out.printf("%1$s %2$ty-%2$tm-%2$td %2$tH:%2$tM:%2$tS %2$tL %n","printf 输出 年-月-日 时:分:秒 毫秒 : ",date);
		
		//< 标志，< 标志表示先前被格式化的参数要被再次使用
		System.out.printf("%1$s %2$ty-%<tm-%<td %<tH:%<tM:%<tS %<tL %n","printf 输出 年-月-日 时:分:秒 毫秒 : ",date);//此处的 < 之前出现的是 2$,表示第二位变量，因此 < 也表示第二位变量
		
		
		//String 类的日期转换符。实际上 printf 的转换符也是 string 类。
		System.out.print("\n");
		String str = String.format("%tc",date);
		System.out.println("String 类输出全部日期信息：" + str);
		//Y 年份全称，y年份简称
		System.out.printf("年份全称：%tY%n",date);
		System.out.printf("年份简称（后两位）：%ty%n",date);
		System.out.printf("年份检查（前两位）：%tC%n",date);
		System.out.printf(Locale.US,"英文年份全称：%tY%n",date);
		System.out.printf(Locale.US,"英文年份简称：%ty%n",date);
		//B 月份全称,b 月份简称
		System.out.printf("月份全称：%tB%n",date);
		System.out.printf("月份简称：%tb%n",date);
		System.out.printf(Locale.US,"英文月份全称：%tB%n",date);
		System.out.printf(Locale.US,"英文月份简称：%tb%n",date);
		//D 月/日/年格式，d 日期全称(不足两位补0)，e日期简称
		System.out.printf("日期全称：%td%n",date);
		System.out.printf("日期简称：%te%n",date);
		//H 24小时制(不足两位补0)，I 12小时制
		System.out.printf("24小时制：%tH%n",date);
		System.out.printf("12小时制：%tI%n",date);
		//M 分钟(不足两位补0)，m 月份全称(数字，不足两位补0)
		System.out.printf("分钟全称：%tM%n",date);
		System.out.printf("m月份全称：%tm%n",date);
		//A 星期全称，a 星期简称
		System.out.printf("星期全称：%tA%n",date);
		System.out.printf("星期简称：%ta%n",date);
		System.out.printf(Locale.US,"英文星期全称：%tA%n",date);
		System.out.printf(Locale.US,"英文星期简称：%ta%n",date);
		
		
		//解析字符串为时间,SimpleDateFormat 的 parse 方法，可将指定的日期字符串转换为日期格式。
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		// SimpleDateFormat ft = new SimpleDateFormat ("yyyy/MM/dd");
	    String input = "2020-07-03";//如果是非 年-月-日格式，会报错。比如是 年/月/日 格式，那么 ft 必须是 yyyy-MM-dd 格式。
	    // String input = "2020/07/03";// 年/月/日 格式, ft 必须是 yyyy-MM-dd 格式
		System.out.print(input + " Parses as : ");
	    Date t; 
	    try { 
		  t = ft.parse(input);//将字符串转为日期 Date 格式
		  System.out.println(t); 
	    } catch (ParseException e) { 
		  System.out.println("Unparseable using " + ft); 
	    }
		
		
		//sleep() 使当前线程进入指定的休眠时间，单位是毫秒。必须对其进行捕获或声明以便抛出错误。
		try{
			long start = System.currentTimeMillis();//当前毫秒数,类似于 php 的 microtime()
			System.out.println(new Date());
			Thread.sleep(1000*3);
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("程序的执行间隔时间（毫秒）是：" + diff);
		} catch(Exception e) {
			System.out.println("抛出错误" + e);
		}
		
	}
}
