package mytest;

//����������ʽ��
import java.util.regex.*;

public class RegexTest {
	public static void main(String[] args)
	{
		//������ʽ
		//. ���ƥ�������ַ�,* �Ǻ���λ���ƥ��ǰ����ַ����ӱ��ʽ��
		String str = "test string";
		//.*test.* ��ʾ������ test ǰ��ǰһ��.*���󣨺�һ��.*����ʲô�ַ���ֻҪ���� test�����ʾ����ƥ��ɹ���
		String pattern = ".*test.*";
		boolean isMatch = Pattern.matches(pattern,str);
		System.out.println("�ַ����Ƿ������ַ���'test'��" + isMatch);
		String pat = "test";//���ַ����� "test"����û�пհ׺������ַ�ʱ���������ƥ��ɹ���
		boolean m = Pattern.matches(pat,str);
		System.out.println("�ַ����Ƿ�Ϊ'test'��" + m);
		
		//{n} n �ǷǸ���������ʾ{n} ֮ǰ���ַ�����ƥ�� n �Ρ�
		String f = "food";
		String g = "group";
		String p1 = ".*o{2}.*";//�ַ� o �������� 
		boolean mf = Pattern.matches(p1,f);
		System.out.println("�ַ���'" + f + "'�Ƿ�������'o'��" + mf);
		System.out.println("�ַ���'" + g + "'�Ƿ�������'o'��" + Pattern.matches(p1,g));
		//{n,} n �ǷǸ���������ʾ{n,} ֮ǰ���ַ�����ƥ�� n �Ρ�
		String s = "start";
		String p2 = ".*o{1}.*";
		System.out.println("�ַ���'" + f + "'�Ƿ����ٺ���һ��'o'��" + Pattern.matches(p2,f));
		System.out.println("�ַ���'" + g + "'�Ƿ����ٺ���һ��'o'��" + Pattern.matches(p2,g));
		System.out.println("�ַ���'" + s + "'�Ƿ����ٺ���һ��'o'��" + Pattern.matches(p2,s));
		//{n,m} n �� m �ǷǸ�����,n <= m,ƥ��֮ǰ���ַ����� n �Σ����� m ��
		String p3 = ".*o{2,4}.*";
		System.out.println("�ַ���'" + f + "'�Ƿ����������ĸ�'o'��" + Pattern.matches(p3,f));
		System.out.println("�ַ���'" + g + "'�Ƿ����������ĸ�'o'��" + Pattern.matches(p3,g));
		System.out.println("�ַ���'" + s + "'�Ƿ����������ĸ�'o'��" + Pattern.matches(p3,s));
		String p4 = ".*o{0,1}.*";
		System.out.println("�ַ���'" + f + "'�Ƿ񲻺��л���ֻ����һ��'o'��" + Pattern.matches(p4,f));//ƥ���˵�һ��o
		System.out.println("�ַ���'" + g + "'�Ƿ񲻺��л���ֻ����һ��'o'��" + Pattern.matches(p4,g));
		System.out.println("�ַ���'" + s + "'�Ƿ񲻺��л���ֻ����һ��'o'��" + Pattern.matches(p4,s));
	}
}