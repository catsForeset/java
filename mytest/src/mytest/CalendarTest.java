package mytest;

//���� Calendar ��
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args){
		Calendar c1 = Calendar.getInstance();
		//set(year,month,date,hour,minute,second) �� Calendar �����������ʱ��������Ϊָ��ʱ��
		c1.set(2020,7,6);
		//get(filed) ��ȡ Calendar �����ֵ
		System.out.println("Calendar ʱ�䣺" + c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE) + " " + c1.get(Calendar.HOUR) + ":" + c1.get(Calendar.MINUTE) + ":" + c1.get(Calendar.SECOND));
		//set(filed,value) �����������ĳ�����ڶ����ֵ���������ַ���
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
		System.out.println("Calendar ʱ�䣺" + gc.get(Calendar.YEAR) + "-" + gc.get(Calendar.MONTH) + "-" + gc.get(Calendar.DATE) + " " + gc.get(Calendar.HOUR) + ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND));
		if(gc.isLeapYear(Calendar.YEAR)){
			System.out.println(gc.get(Calendar.YEAR) + "��������");
		} else {
			System.out.println(gc.get(Calendar.YEAR) + "�겻������");
		}
	}
}