package mytest;

//���� Calendar ��
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args){
		Calendar c1 = Calendar.getInstance();
		//set(year,month,date) �� Calendar ���������������Ϊָ��ʱ��
		c1.set(2020,7,6);
		//get(filed) ��ȡ Calendar �����ֵ
		System.out.println("Calendar ʱ�䣺" + c1.get(Calendar.YEAR) + " " + c1.get(Calendar.MONTH) + " " + c1.get(Calendar.DATE));
		//set(filed,value) �����������ĳ�����ڶ��������գ���ֵ���������ַ���
		
	}
}