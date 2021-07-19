
import java.util.Scanner;

public class management 
{
	Scanner sc = new Scanner(System.in);
	
	ListQueue a = new ListQueue();
	
	
	
	
	public String RegisterPatient(String n , String ag, String b)throws QueueOverflowException
	{
		
		if(a.isFull()) 
		{
			throw new QueueOverflowException();
		}
		else 
		{
			patient p = new patient();
			p.name = n;
			p.age = ag;
			p.blood = b;
			
			
			   
			try 
			{
				a.enqueue(p);
				return "Success";
			}
			catch(Exception e ) 
			{
				return "Not Succes";
			}
		}
	}
	public String ServePatient()
	{
		try
		{
			patient p = (patient) a.dequeue();
			return (p.name);
		}
		catch(Exception e )
		{
			System.out.println(e+" ");
		}
		return "";
	}	
	public String CancelAll()
	{
		while(a.isEmpty() == false) 
		{
			try {a.dequeue();}
			catch(Exception e){System.out.println(e);}
		}
		if(a.size == 0) 
		{
			return "Canceled all, Now doctor can go to lunch";
		}
		return "";
	}
	public String CanDoctorGoHome()
	{
		if(a.isEmpty()) 
		{
			return "Yes, Doctor can go home. No patient is waiting";
		}
		else 
		{
			return "No, Doctor can not go home. Patient is waiting";
		}
	}
	public String ShowAllPatient()
	{
	    return (a.toString());
	}
	
	
}
