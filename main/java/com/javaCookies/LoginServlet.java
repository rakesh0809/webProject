package com.javaCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   
		        response.setContentType("text/html");  
		        PrintWriter out=response.getWriter();  
		          
		        request.getRequestDispatcher("link.html").include(request, response);  
		          
		        String name=request.getParameter("name");  
		        String password=request.getParameter("password");  
		          
		        if(password.equals("admin123")){  
		            out.print("You are successfully logged in!");  
		            out.print("<br>Welcome, "+name);  
		              
		            Cookie ck=new Cookie("name",name);  
		            response.addCookie(ck);  
		        }else{  
		            out.print("sorry, username or password error!");  
		            request.getRequestDispatcher("login.html").include(request, response);  
		        }  
		          
		        out.close();  
		    }  
		  
		}  


