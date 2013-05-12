package Libr;

public class newspaper implements libitem, Comparable<Object>
{
	private String name;
	private String text;
	private int asked;
	private String year;
	private String mounth;
	private String day;

	newspaper (String name, String text, String year, String mounth, String day)
	{
		this.name = name;
		this.text = text;
		this.year = year;
		this.mounth = mounth;
		this.day = day;
		this.asked = 0;
	}
	
	@Override
	public int compareTo(Object arg0) 
	{
		if (!(arg0 instanceof newspaper))
		{
			return -1;
		}
		if (this.getname().equals(( (newspaper) arg0).getname()))
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
	
	public String day()
	{
		return day;
	}
	
	@Override
	public void Print() 
	{
		System.out.println("Журнал");
		System.out.println("Название: " + this.getname());
		System.out.println("Год: " + this.getyear());
		System.out.println("Месяц: " + this.mounth());
		System.out.println("День: " + this.day());
		System.out.println("Текст газеты: " + this.gettext());
	}
	
	@Override
	public void ask() 
	{	
		asked = asked +1;
	}
}
