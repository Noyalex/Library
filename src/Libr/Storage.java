package Libr;

import java.util.ArrayList;
import java.util.Iterator;

//Хранилище библиотеки
public class Storage 
{
	private static ArrayList<libitem> listOfItems=new ArrayList<libitem>();
	
	//Добавить в хранилище
	public boolean put (libitem a)
	{
		libitem currentitem;
		for (Iterator<libitem> current = listOfItems.iterator(); current.hasNext(); ) 
		{
		    currentitem = current.next();
		    if(currentitem.getname().equals(a.getname())) return false;
		}
		listOfItems.add(a);
		return true;
	}
	
	//Запросить из хранилища
	public libitem getitem(String name)
	{
		libitem currentitem;
		for (Iterator<libitem> current = listOfItems.iterator(); current.hasNext(); ) 
		{
		    currentitem = current.next();
		    if(currentitem.getname().equals(name)) 
		    {
		    	currentitem.ask();
		    	return currentitem;
		    }
		}	
		return null;
	}
	
	//Удалить из хранилища
	public boolean delitem(String name)
	{
		libitem currentitem;
		for (Iterator<libitem> current = listOfItems.iterator(); current.hasNext(); ) 
		{
		    currentitem = current.next();
		    if(currentitem.getname().equals(name)) 
		    {
		    	listOfItems.remove(current.hashCode());
		    	return true;
		    }
		}	
		return false;
	}
	
}









