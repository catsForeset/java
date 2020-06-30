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
		System.out.print("oo\n")
		String str = String.format("%tc",date);
		System.out.println("String 类输出全部日期信息：" + str);
		//b 月份简称，B 月份全称
		System.out.printf("月份")
		
	}
}
