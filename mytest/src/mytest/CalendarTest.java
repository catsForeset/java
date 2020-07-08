package mytest;

//引入 Calendar 包
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args){
		Calendar c1 = Calendar.getInstance();
		//set(year,month,date,hour,minute,second) 把 Calendar 对象的年月日时分秒设置为指定时间
		c1.set(2020,7,6);
		//get(filed) 获取 Calendar 对象的值
		System.out.println("Calendar 时间：" + c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE) + " " + c1.get(Calendar.HOUR) + ":" + c1.get(Calendar.MINUTE) + ":" + c1.get(Calendar.SECOND));
		//set(filed,value) 如果单独设置某个日期对象的值，可用这种方法
		c1.set(Calendar.DATE,8);
		System.out.println(c1.get(Calendar.DATE));
		c1.set(Calendar.YEAR,2021);
		System.out.println(c1.get(Calendar.YEAR));
		
		
		//GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar();
		//set(year,month,date,hour,minute,second)
		//set(filed,value
		gc.set(Calendar.MINUTE,10);
		System.out.println(gc.get(Calendar.MINUTE));
		//get(filed)
		System.out.println("Calendar 时间：" + gc.get(Calendar.YEAR) + "-" + gc.get(Calendar.MONTH) + "-" + gc.get(Calendar.DATE) + " " + gc.get(Calendar.HOUR) + ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND));
		if(gc.isLeapYear(Calendar.YEAR)){
			System.out.println(gc.get(Calendar.YEAR) + "年是闰年");
		} else {
			System.out.println(gc.get(Calendar.YEAR) + "年不是闰年");
		}
	}
}