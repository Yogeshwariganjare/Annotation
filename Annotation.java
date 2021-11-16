 package annotations;


import java.lang.annotation.*;

public class Annotation {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Information i=new Information("extra info");
		Class c = i.getClass();
		java.lang.annotation.Annotation an=c.getAnnotation(info.class);
		info in=(info)an;
		System.out.println(in.Date());
		System.out.println(in.AuthorID());
		System.out.println(in.Time());
		System.out.println(in.version());
		
	}

}



@info(name="yogeshwar",version=3,AuthorID=1234,Author="yogi",Date="22.3.1998",Time="12:00")
class Information{
	String extrainfo;

	public Information(String extrainfo) {
		super();
		this.extrainfo = extrainfo;
	}
	
	
}
 