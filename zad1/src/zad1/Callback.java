package zad1;

import java.util.Scanner;

public class Callback {

	private boolean flag;
	private boolean changePath;
	
	public boolean getFlag()
	{
		return this.flag;
	}
	
	public void setFlag(boolean flag)
	{
		Scanner input = new Scanner(System.in);
		this.flag = flag;
		
		if(flag == false)
		{
			System.out.println("Czy chcesz podac nowa sciezke zapisu pliku y/n");
			String thatIsAQuestion = input.next();
			
			if(thatIsAQuestion.toLowerCase().equals("y"))
			{
				this.changePath = true;
			}
			else
			{
				this.changePath = false;
			}
		}
	}
	
	public boolean getPath()
	{
		return this.changePath;
	}
	
	public void setPath(boolean path)
	{
		this.changePath = path;
	}
	
}
