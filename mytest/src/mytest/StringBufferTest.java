package mytest;

public class StringBufferTest {
	
	public static void main(String[] args) {
		//同 String 类相比，StringBuffer 类可以修改对象。因此 StringBuffer 类有很多修改方法是 String 类没有的
		StringBuffer sBuffer = new StringBuffer("sBuffers");
		System.out.println(sBuffer);
		
		//append(),delete(),insert(),replace(),reverse(),都会改变 StringBuffer 对象的值
		//append(string) 将指定字符串追加到此字符串序列
		sBuffer.append(" append");
		System.out.println(sBuffer);
		
		//delete(start,end) 移除字符串中指定的字符串
		sBuffer.delete(12,14);
		System.out.println(sBuffer);
		
		//insert(offset,string) 将指定字符串插入到当前字符串的某个位置中
		sBuffer.insert(3," insert ");
		System.out.println(sBuffer);
		
		//replace(start,end,string) 将指定字符串替换当前字符串的某个子字符串
		sBuffer.replace(1,2,"AC");
		System.out.println(sBuffer);
		
		//reverse() 将字符串反转
		sBuffer.reverse();
		System.out.println(sBuffer);
		
	}
	
}