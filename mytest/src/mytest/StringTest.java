package mytest;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Srting ��Ĵ�������
		String newstr = new String("This is a string");
		System.out.println(newstr);
		//�Զ����� String ��
		String str = "This is a string";
		System.out.println(str);
		//�ַ�����תΪ String�ַ���
		char [] ch = {'w','o','r','d'};
		String chtostr = new String(ch);
		System.out.println(chtostr);
		//string ���󱻴���֮�����޷��ı��
		System.out.println(chtostr.length());
		//contact �����ַ���
		System.out.println("�����ַ���".concat(chtostr));
		
		
		//�����ʽ���ַ���
		String fs;
		fs = String.format("������:%f,"+"����:%d,"+"�ַ���:%s", 2.21,2,"This is a string");
		System.out.println(fs);
		System.out.printf("������:%f,"+"����:%d,"+"�ַ���:%s", 2.21,2,"This is a string");
		System.out.print('\n');
		
		
		//charAt() ����ָ�����������ַ�����Χ�� 0 �� length()-1
		String s = "String";
		System.out.println(s.charAt(2));
		
		
		//compareTo() �����ַ������ַ��Ƚ�ASCII��Աȣ��Աȵ��в�����ַ�����������֮��Ĳ�ֵ
		String str1 = "strings";
        String str2 = "Strings";
        String str3 = "Strings123";
        int result = str1.compareTo( str2 );
        System.out.println(str1 + " compareTo " + str2 + " : " + result);
        result = str2.compareTo( str3 );
        System.out.println(str2 + " compareTo " + str3 + " : " + result);
        result = str3.compareTo( str1 );
        System.out.println(str3 + " compareTo " + str1 + " : " + result);
		result = str1.compareToIgnoreCase( str2 );
        System.out.println(str1 + " compareToIgnoreCase " + str2 + " : " + result);
        result = str2.compareTo( str3 );
        System.out.println(str2 + " compareToIgnoreCase " + str3 + " : " + result);
        result = str3.compareTo( str1 );
        System.out.println(str3 + " compareToIgnoreCase " + str1 + " : " + result);
		
		
		//endsWith() �ж��ַ��������Ƿ���ָ����׺��β
		System.out.println("Is " + str3 + " endsWith 123 ? \t" + str3.endsWith("123"));
		
		
		//indexOf() �����ַ����ַ�����һ�γ��ֵ�λ��
		System.out.println("The indexOf the a in " + str1 + " is: " +str1.indexOf('a'));
		System.out.println("The indexOf the s in " + str1 + " is: " +str1.indexOf('s'));
		System.out.println("The indexOf the s begin in index 1 in " + str1 + " is: " +str1.indexOf('s',1));
		//lastIndexOf() �����ַ����ַ������һ�γ��ֵ�λ��
		System.out.println("The lastIndexOf the a in " + str1 + " is: " +str1.lastIndexOf('a'));
		System.out.println("The lastIndexOf the s in " + str1 + " is: " +str1.lastIndexOf('s'));
		System.out.println("The lastIndexOf the s begin in index 5 in " + str1 + " is: " +str1.lastIndexOf('s',5));//�����ѯ
		
		
		//matches() �����ַ��������������������ʽ�Ƿ�ƥ��
		
		
		//replace() ���ɵ��ַ�����ָ�������ַ�,�����µ��ַ�������
		System.out.println( str1 + "replace s to a : " + str1.replace('s','a'));
		
	};

}
