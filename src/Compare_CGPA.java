import java.lang.*;
import java.util.*;
public class Compare_CGPA implements Comparator {
	
	public int compare(Object o1,Object o2) {
		
		Student_info s1=(Student_info)o1;
	    Student_info s2=(Student_info)o2;
		
		if(s1.getCGPA()==s2.getCGPA())
		{
			if(s1.getName().compareTo(s2.getName())==0)
			{
				
				
			}
		}
		else
		
		if(s1.CGPA>s2.CGPA)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		return 0;
	}
	

}
