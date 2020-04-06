/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "CountServlet", urlPatterns = {"/count"})
public class CountServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int i = 1; 
        HttpSession session = request.getSession();
        
        if (session.getAttribute("SesCount") == null) {
            i = 1;
        } else {
            i = (Integer) session.getAttribute("SesCount");
            i++;
        }
        session.setAttribute("SesCount", i);
        
        request.getRequestDispatcher("count.jsp").forward(request, response);
        
        
    }

 
}
