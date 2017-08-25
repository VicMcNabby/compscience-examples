public class AbstractDemo
{
	public static void main(String args[])
  {
        Demo test = new Example();
        test.run();
    }
}
abstract  class Demo {
    public abstract void run();
}
class Example extends Demo{
	public void run(){
		System.out.println("Abstraction...");
	}
}
