package mytest;

public class StringBufferTest {
	
	public static void main(String[] args) {
		//ͬ String ����ȣ�StringBuffer ������޸Ķ������ StringBuffer ���кܶ��޸ķ����� String ��û�е�
		StringBuffer sBuffer = new StringBuffer("sBuffers");
		System.out.println(sBuffer);
		
		//append(),delete(),insert(),replace(),reverse(),����ı� StringBuffer �����ֵ
		//append(string) ��ָ���ַ���׷�ӵ����ַ�������
		sBuffer.append(" append");
		System.out.println(sBuffer);
		
		//delete(start,end) �Ƴ��ַ�����ָ�����ַ���
		sBuffer.delete(12,14);
		System.out.println(sBuffer);
		
		//insert(offset,string) ��ָ���ַ������뵽��ǰ�ַ�����ĳ��λ����
		sBuffer.insert(3," insert ");
		System.out.println(sBuffer);
		
		//replace(start,end,string) ��ָ���ַ����滻��ǰ�ַ�����ĳ�����ַ���
		sBuffer.replace(1,2,"AC");
		System.out.println(sBuffer);
		
		//reverse() ���ַ�����ת
		sBuffer.reverse();
		System.out.println(sBuffer);
		
	}
	
}