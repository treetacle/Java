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
public class Faculty implements EmailRecipient {
    private List<String> teachers = new ArrayList<>();
    private String emailAddress;
    
    public Faculty(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public void addGrade(String teacher) {
    teachers.add(teacher);
    }
    
    @Override
    public String getEmailAddress() {
        return emailAddress;
    }
}
