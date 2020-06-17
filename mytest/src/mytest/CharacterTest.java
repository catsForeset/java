package mytest;

public class CharacterTest {
	public static void main(String[] args) {
		//Character 类的创建方法
		Character ch = new Character('a');
		System.out.println(ch);
		//自动创建 Character 类
		Character c = 'a';
		System.out.println(c);
		
		
		//Character 类的方法
		System.out.println("c isLetter : " + Character.isLetter('c'));
		System.out.println("c isDigit : " + Character.isDigit('c'));
		System.out.println("5 isDigit : " + Character.isDigit('5'));
		//空白符包含：空格、tab 键、换行符
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
		//toString() 返回一个仅含一个 char 值的string对象。返回结果是长度为 1 的字符串。
		System.out.println("a toString : " + Character.toString('a'));
		System.out.println("A toString : " + Character.toString('A'));
		
	}
}
