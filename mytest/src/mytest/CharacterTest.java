package mytest;

public class CharacterTest {
	public static void main(String[] args) {
		//Character ��Ĵ�������
		Character ch = new Character('a');
		System.out.println(ch);
		//�Զ����� Character ��
		Character c = 'a';
		System.out.println(c);
		
		
		//Character ��ķ���
		System.out.println("c isLetter : " + Character.isLetter('c'));
		System.out.println("c isDigit : " + Character.isDigit('c'));
		System.out.println("5 isDigit : " + Character.isDigit('5'));
		//�հ׷��������ո�tab �������з�
		System.out.println("c isWhitespace : " + Character.isWhitespace('c'));
		System.out.println("space isWhitespace : " + Character.isWhitespace(' '));
		System.out.println("\\t isWhitespace : " + Character.isWhitespace('\t'));
		System.out.println("\\n isWhitespace : " + Character.isWhitespace('\n'));
		System.out.println("c isUpperCase : " + Character.isUpperCase('c'));
		System.out.println("C isUpperCase : " + Character.isUpperCase('C'));
		System.out.println("c isLowerCase : " + Character.isLowerCase('c'));
		System.out.println("C isLowerCase : " + Character.isLowerCase('C'));
		System.out.println("a toUpperCase : " + Character.toUpperCase('a'));
		System.out.println("A toUpperCase : " + Character.toUpperCase('A'));
		System.out.println("a toLowerCase : " + Character.toLowerCase('a'));
		System.out.println("A toLowerCase : " + Character.toLowerCase('A'));
		//toString() ����һ������һ�� char ֵ��string���󡣷��ؽ���ǳ���Ϊ 1 ���ַ�����
		System.out.println("a toString : " + Character.toString('a'));
		System.out.println("A toString : " + Character.toString('A'));
		
	}
}
