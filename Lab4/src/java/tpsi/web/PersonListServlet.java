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

/**
 *
 * @author Treetacle
 */
@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Person> p2 = new ArrayList<>();
        
        p2.add(new Person("Jan", "Kowalski", "41224@zut.edu.pl"));
        p2.add(new Person("Patrycja", "Nowak", "33232@zut.edu.pl"));
        p2.add(new Person("Janusz", "Norek", "22312@zut.edu.pl"));
        p2.add(new Person("Adam", "Wysocki", "63424@zut.edu.pl"));
        
        request.setAttribute("p2", p2);
        
        request.getRequestDispatcher("personList.jsp").forward(request, response);
    }

}
