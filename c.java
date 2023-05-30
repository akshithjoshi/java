class A
{
	public void display1()
	{
		System.out.println("polytechnic");
	}
}
interface B
{
	public void display2();
}
class C extends A implements B
{
	public void display2()
	{
		System.out.println("hello");
	}
	public static void main(String s[])
	{
		C p=new C();
		p.display1();
		p.display2();
	}
} 