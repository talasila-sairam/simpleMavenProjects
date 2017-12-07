package com.fsa.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.fsa.beans.Message;

public class MessageAction extends Action {

	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
	        throws Exception {
             Message message=(Message)form;
			
			System.out.println(message.getUsername());
			System.out.println(message.getPassword());
			 if(getErrors(request) == null ||getErrors(request).size() == 0)
				
				        return mapping.findForward("success");
				 
				     else
				 
				         return mapping.getInputForward();
				 
				 }

		}

	

