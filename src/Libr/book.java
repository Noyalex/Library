package Libr;

public class book implements libitem, Comparable<Object>
{
	private String name;
	private String text;
	private int asked;
	private String author;

	book (String name, String text, String author)
	{
		this.name = name;
		this.text = text;
		this.author = author;
		this.asked = 0;
	}
	
	@Override
	public int compareTo(Object arg0) 
	{
		if (!(arg0 instanceof book))
		{
			return -1;
		}
		if (this.getname().equals(((book) arg0).getname()))
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
	public int numasked() {
		return asked;
	}
	
	private String getauthor() 
	{
		return author;
	}

	@Override
	public void Print() 
	{
		System.out.println("Книга");
		System.out.println("Название: " + this.getname());
		System.out.println("Автор: " + this.getauthor());
		System.out.println("Текст книги: " + this.gettext());
		
		
	}

	@Override
	public void ask() 
	{	
		asked = asked +1;
	}
}
