package com.fsa.beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class Message extends ActionForm {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		 ActionErrors errors = new ActionErrors();
		          if(username==null||username.equals("")){
		        	  errors.add("username",new ActionMessage("errors.required","username"));
		        	 
		          }
		          
		          if(password==null||password.equals("")){
		        	  errors.add("password",new ActionMessage("errors.required","password"));
		        	 
		          }
		
		         return errors;

	}
	

}
