package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface info {

	String name();
	String supervisor()default "ONKAR";
	int version();
	int AuthorID();
	String Author() default "yogeshwari";
	String Date();
	String Time();
	String desp() default "hello its annotation program";
	
}
[11/11, 8:53 pm] Arun: import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute
{
	int sequence();
}
class Myclass
{
	@Execute(sequence=2)
	public void mymethod1()
	{
		System.out.print("order2");
	}
	@Execute(sequence=1)
	public void mymethod2()
	{
		System.out.print("order1");
	
	}
	@Execute(sequence=3)
	public void mymethod3()
	{
		System.out.print("order3");
	
	}
}