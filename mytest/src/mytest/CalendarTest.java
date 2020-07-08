package mytest;

//引入 Calendar 包
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args){
		Calendar c1 = Calendar.getInstance();
		//set(year,month,date) 把 Calendar 对象的年月日设置为指定时间
		c1.set(2020,7,6);
		//get(filed) 获取 Calendar 对象的值
		System.out.println("Calendar 时间：" + c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE) + " " + c1.get(Calendar.HOUR) + ":" + c1.get(Calendar.MINUTE) + ":" + c1.get(Calendar.SECOND));
		//set(filed,value) 如果单独设置某个日期对象的值，可用这种方法
		c1.set(Calendar.DATE,8);
		System.out.println(c1.get(Calendar.DATE));
		c1.set(Calendar.YEAR,2021);
		System.out.println(c1.get(Calendar.YEAR));
	}
}