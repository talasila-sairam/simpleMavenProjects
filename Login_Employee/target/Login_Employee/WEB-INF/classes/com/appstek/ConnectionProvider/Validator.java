package com.appstek.ConnectionProvider;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.appstek.Dao.Employee;

public class Validator 
{
   public String getValidation(String uname,String upwd)
   {
	   String message=null;
	   Utility utl=new Utility();
	   Session session=utl.getSession();
	   Query query=session.createQuery("from Employee where ename=? and epwd=?");
	   System.out.println(query);
	   query.setParameter(0,uname);
	   query.setParameter(1,upwd);
	   List list=query.list();
	   System.out.println(list);
	   if(list.isEmpty())
	   {
	   message=uname+"Login Failure";
	   }
	   else
	   {
		  Employee emp=(Employee)list.get(0);
		   if(emp!=null)
		   {
			   message=uname+"   Login Sucsessful";
		   }
	   }
	   return message;
   }
}
