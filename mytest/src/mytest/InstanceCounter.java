package mytest;

//CTRL + F11,运行快捷键
public class InstanceCounter {
	//final变量的声明方法
	final int value = 10;
	public static final int BOXWIDTH = 6; //通常 static 和 final 合用来创建类常量
	static final String TITLE = "Manager";
	//static变量的声明及使用方法
	private static int numInstances = 0;
	   protected static int getCount() {
	      return numInstances;
	   }
	 
	   private static void addInstance() {
	      numInstances++;
	   }
	 
	   InstanceCounter() {
	      InstanceCounter.addInstance();
	   }
	 
	   public static void main(String[] arguments) {
	      System.out.println("Starting with " +
	      InstanceCounter.getCount() + " instances");
	      System.out.println(numInstances);
	      for (int i = 0; i < 500; ++i){
	         new InstanceCounter();
	      }
	      System.out.println("Created " +
	      InstanceCounter.getCount() + " instances");
	      System.out.println(numInstances);
	      numInstances = 99;
	      System.out.println(numInstances);
	      //final
	      System.out.println(BOXWIDTH);
//	      BOXWIDTH = 14; value = 10;//此行报错，因为final修饰符的变量不能被重新赋值
	   }
}
