import java.io.*;

interface Std
{
	void stdName();
	void stdRoll();
	void stdCity();
}
class Std1 implements Std
{
	void stdName()
	{
		System.out.println("MMD");
	}
	void stdRoll()
	{
		System.out.println("60");
	}
	void stdCity()
	{
		System.out.println("Haidarpura");
	}
}
class Std2 implements Std
{
	void stdName()
	{
		System.out.println("ZHR");
	}
	void stdRoll()
	{
		System.out.println("98");
	}
	void stdCity()
	{
		System.out.println("Haidarpura");
	}
}
class Example
{
	public static void main (String[] args)
	{
		Std1 mine = new Std1();
		mine.stdRoll();
		mine.stdName();
		mine.stdCity();

		Std2 other = new Std2();
		other.stdRoll();
		other.stdName();
		other.stdCity();
	}
}