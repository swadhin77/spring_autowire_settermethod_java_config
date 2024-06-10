package in.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class college_details 
{
	private String name;
	private int rollno;
	@Autowired
	@Qualifier("address2")
	private address add;
	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void display()
	{
		System.out.println("name is :"+name);
		System.out.println("roll no is :"+rollno);
		System.out.println("address is :"+add);
	}
}
