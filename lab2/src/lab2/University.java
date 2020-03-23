/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Treetacle
 */
public class University implements EmailRecipient {
    
    private String emailAddress;
    private String name;
    private List<Faculty> faculties = new ArrayList<>();
    
    public University(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getFaculties() {
         System.out.println(faculties);
    }

    public void addFaculty(Faculty ff) {
        faculties.add(ff);
    }
    
    @Override
    public String getEmailAddress() {
        return emailAddress;
    }
}