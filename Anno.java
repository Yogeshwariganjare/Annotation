package Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface test{
	
}



public class Anno {

	public static void main(String[] args) {
		
		Anno y = new Anno();
		y.MyMethod();
	}
	
	@test
	public void MyMethod() {
		System.out.println("non static method");
	}

}


	


