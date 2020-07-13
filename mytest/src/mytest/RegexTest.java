package mytest;

//�����������ʽ��
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args)
	{
		//�������ʽ
		//. ���ƥ�������ַ�,* �Ǻ���λ���ƥ��ǰ����ַ����ӱ���ʽ��
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
		
		//x|y ƥ�� x��y
		System.out.println("�ַ���'" + f + "'�Ƿ����ַ�'z'���ַ�'food'��" + Pattern.matches("z|food",f));
		
		//[xyz] �ַ�����ƥ���������һ�ַ�
		String px = ".*[abcd].*";
		System.out.println("�ַ���'" + s + "'�Ƿ���[abcd]���е��ַ���" + Pattern.matches(px,s));
		System.out.println("�ַ���'" + f + "'�Ƿ���[abcd]���е��ַ���" + Pattern.matches(px,f));
		System.out.println("�ַ���'" + g + "'�Ƿ���[abcd]���е��ַ���" + Pattern.matches(px,g));
		
		//[^xyz] �����ַ�����ƥ��δ�������κ��ַ�
		String unpx = ".*[^abcd].*";
		String a = "abc";
		String i = "91247";
		System.out.println("�ַ���'" + s + "'�Ƿ��в���[abcd]���е��ַ���" + Pattern.matches(unpx,s));
		System.out.println("�ַ���'" + i + "'�Ƿ��в���[abcd]���е��ַ���" + Pattern.matches(unpx,i));
		System.out.println("�ַ���'" + a + "'�Ƿ��в���[abcd]���е��ַ���" + Pattern.matches(unpx,a));
		
		//[a-z] �ַ���Χ��ƥ����ָ����Χ�ڵ��κ��ַ���
		String str_a = "x";
		String str_b = "1";
		System.out.println("�ַ���'" + str_a + "'�Ƿ�����[a-d]���е��ַ���" + Pattern.matches("[a-d]",str_a));
		System.out.println("�ַ���'" + str_b + "'�Ƿ�����[0-9]���е��ַ���" + Pattern.matches("[0-9]",str_b));
		
		//[^a-z] �����ַ���Χ��ƥ�䲻��ָ����Χ�ڵ��κ��ַ���
		System.out.println("�ַ���'" + str_a + "'�Ƿ��в���[a-d]���е��ַ���" + Pattern.matches("[^a-d]",str_a));
		System.out.println("�ַ���'" + str_b + "'�Ƿ��в���[0-9]���е��ַ���" + Pattern.matches("[^0-9]",str_b));
		
		
		//* ��λ���ƥ��ǰ����ַ����ӱ���ʽ
		System.out.println("a* : " + Pattern.matches("a*","a"));//a*,��ƥ��:���ַ���,a,aaa...a
		System.out.println("ab* ��" + Pattern.matches("ab*","ab"));//ab*,��ƥ��:a,b,ab,abbbb...b
		System.out.println("ab* ��" + Pattern.matches("a*b","ab"));
		//+ һ�λ���ƥ��ǰ����ַ����ӱ���ʽ
		System.out.println("a+ ��" + Pattern.matches("a+","aaa"));//a+,��ƥ�� a,aaa...a
		System.out.println("ab+ ��" + Pattern.matches("ab+","abbbbb"));//ab+,��ƥ�� ab,abbbb...b
		//? ��λ�һ��ƥ��ǰ����ַ����ӱ���ʽ
		System.out.println("a? ��" + Pattern.matches("a?","a"));//a*,��ƥ��:���ַ���,a
		System.out.println("ab? ��" + Pattern.matches("ab?","a"));//ab?,��ƥ�� a,ab
		System.out.println("abc? ��" + Pattern.matches("abc?","a"));//ab?,��ƥ�� ab,abc
		
		
		//������ �����ң���һ��С�����ڵ����ݾ��ǵ�һ�飬���η���
		String line = "This order was placed for QT3000! OK?";
		String pattern2 = "(\\D*)(\\d+)(.*)";//�� java ��ʹ��������б��//�����������Ե�һ����б��/��//D�ȼ���D,ƥ��������ַ���
		Pattern r = Pattern.compile(pattern2);
		Matcher m2 = r.matcher(line);
		if(m2.find()) {
			System.out.println("Found value: " + m2.group(0) );//Ĭ����
			System.out.println("Found value: " + m2.group(1) );//��һ��(\\D*)��ƥ�������
			System.out.println("Found value: " + m2.group(2) );//�ڶ���(\\d+)��ƥ������
			System.out.println("Found value: " + m2.group(3) );//������(.*)��ƥ���κ��ַ�
		} else {
			System.out.println("NO MATCH");
		}
		
		
		
	}
}