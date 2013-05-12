package Libr;

public class magazine implements libitem, Comparable<Object>
{
	private String name;
	private String text;
	private int asked;
	private String year;
	private String mounth;
	
	magazine (String name, String text, String year, String mounth)
	{
		this.name = name;
		this.text = text;
		this.year = year;
		this.mounth = mounth;
		this.asked = 0;
	}

	@Override
	public int compareTo(Object arg0) 
	{
		if (!(arg0 instanceof magazine))
		{
			return -1;
		}
		if (this.getname().equals (( (magazine) arg0).getname()))
		{
			return 1;
		}
		return 0;
	}

	@Override
	public String getname() 
	{
		return name;
	}

	@Override
	public String gettext() 
	{
		return text;
	}

	@Override
	public int numasked() 
	{
		return asked;
	}
	
	public String getyear() 
	{
		return year;
	}
	
	public String mounth()
	{
		return mounth;
	}
	
	@Override
	public void Print() 
	{
		System.out.println("Журнал");
		System.out.println("Название: " + this.getname());
		System.out.println("Год: " + this.getyear());
		System.out.println("Месяц: " + this.mounth());
		System.out.println("Текст журнала: " + this.gettext());
	}
	@Override
	public void ask() 
	{	
		asked = asked +1;
	}
}
