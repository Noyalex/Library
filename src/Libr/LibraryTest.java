package Libr;

import java.util.Scanner;

public class LibraryTest 
{
	//Точка входа
	public static void main(String[] args)
	{
		//поток ввода
		Scanner in = new Scanner(System.in);
		//Хранилище
		Storage Library = new Storage();
		
		
		String s;
		//Демонстрация интерфейса
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("   Демонстрация интерфейса");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Добавление в хранилище.\nВведите\n1 чтобы добавить книгу");
		System.out.println("2 чтобы добавить журнал\n3 чтобы добавить газету");
		System.out.println("end чтобы закончить");
		String name, text;
		s = in.next();
		while(!s.equals("end"))
		{
			if(s.equals("1"))
			{
				String author;
				System.out.println("Название книги");
				name = in.next();
				System.out.println("Автор книги");
				author = in.next();
				System.out.println("Текст книги");
				text = in.next();
				book newbook = new book(name, text, author);
				if (Library.put(newbook))
				{
					System.out.println("Книга успешно добавлена");
				}
				else
				{
					System.out.println("Экземпляр с таким названием уже существует");
				}
			}
			if(s.equals("2"))
			{
				String year;
				String mounth;
				System.out.println("Название журнала");
				name = in.next();
				System.out.println("Год выпуска");
				year = in.next();
				System.out.println("Месяц");
				mounth = in.next();
				System.out.println("Текст журнала");
				text = in.next();
				magazine newbook = new magazine (name, text, year, mounth);
				if (Library.put(newbook))
				{
					System.out.println("Журнал успешно добавлен");
				}
				else
				{
					System.out.println("Экземпляр с таким названием уже существует");
				}
			}
			if(s.equals("3"))
			{
				String year;
				String mounth;
				String day;
				System.out.println("Название газеты");
				name = in.next();
				System.out.println("Год выпуска");
				year = in.next();
				System.out.println("Месяц");
				mounth = in.next();
				System.out.println("Число");
				day = in.next();
				System.out.println("Текст газеты");
				text = in.next();
				newspaper newbook = new newspaper (name, text, year, mounth, day);
				if (Library.put(newbook))
				{
					System.out.println("Газета успешно добавлена");
				}
				else
				{
					System.out.println("Экземпляр с таким названием уже существует");
				}
			}
			s = in.next();
			
		}
		//Получение экземпляров из хранилища.
		System.out.println("Получение экземпляров из хранилища. Введите название.\nВведите ~end чтобы закончить");
		libitem readitem;
		s=in.next();
		while(!(s.equals("~end")))
		{
			readitem = Library.getitem(s);
			if(readitem==null)
			{
				System.out.println("Нет экземпляра с таким названием");
			}
			else
			{
				readitem.Print();
			}
			in.next();
		}
		//Удаление экземпляров из хранилища
		System.out.println("Удаление экземпляров из хранилища. Введите название.\nВведите ~end чтобы закончить");
		s=in.next();
		while(!(s.equals("~end")))
		{
			if(Library.delitem(s))
			{
				System.out.println("Экземпляр успешно удален");
			}
			else
			{
				System.out.println("Нет экземпляра с таким названием");
			}
			in.next();
		}
		
		in.close();
	}
	
}
