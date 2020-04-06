/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Treetacle
 */
@WebServlet(name = "StudentListServlet", urlPatterns = {"/studentList"})
public class StudentListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        HttpSession session = request.getSession();
        List<Student> st1;
        if (session.getAttribute("SesSutdentList") == null) {
           st1 = new ArrayList<>();
        } else {
            st1 = (List<Student>) session.getAttribute("SesSutdentList");
        }
                    
        session.setAttribute("SesSutdentList", st1);
        request.getRequestDispatcher("studentList.jsp").forward(request, response);
    }
    
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            

        HttpSession session = request.getSession();
        List<Student> st1;
        if (session.getAttribute("SesSutdentList") == null) {
           st1 = new ArrayList<>();
        } else {
            st1 = (List<Student>) session.getAttribute("SesSutdentList");
        }
        
        
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String email = request.getParameter("email");

        Student s1 = new Student(imie, nazwisko, email);
        if(imie.length()!=0 && nazwisko.length()!=0 && email.length()!=0){
            st1.add(s1);
        }
        session.setAttribute("SesSutdentList", st1);
            
        request.getRequestDispatcher("studentList.jsp").forward(request, response);
    }
            
    }

}