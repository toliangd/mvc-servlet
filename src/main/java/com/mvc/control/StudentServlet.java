package com.mvc.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.model.StudentService;

@WebServlet(
		  name = "StudentServlet", 
		  urlPatterns = "/student-record")
		public class StudentServlet extends HttpServlet {

		    private StudentService studentService = new StudentService();

			//Этот метод обрабатывает HTTP-запросы GET и POST
		    private void processRequest(
		      HttpServletRequest request, HttpServletResponse response) 
		      throws ServletException, IOException {

		        String studentID = request.getParameter("id");
		        if (studentID != null) {
		            int id = Integer.parseInt(studentID);
		            studentService.getStudent(id)
		              .ifPresent(s -> request.setAttribute("studentRecord", s));
		        }

		        RequestDispatcher dispatcher = request.getRequestDispatcher(
		          "/WEB-INF/jsp/student-record.jsp");
		        dispatcher.forward(request, response);
		    }

		    @Override
		    protected void doGet(
		      HttpServletRequest request, HttpServletResponse response) 
		      throws ServletException, IOException {

		        processRequest(request, response);
		    }

		    @Override
		    protected void doPost(
		      HttpServletRequest request, HttpServletResponse response) 
		      throws ServletException, IOException {

		        processRequest(request, response);
		    }
		}
