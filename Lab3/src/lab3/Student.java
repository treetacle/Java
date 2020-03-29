/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Treetacle
 */
public class Student extends Person {
    private String groupId;
    private List<Double> grades = new ArrayList<>();
    
    public Student(String firstName, String lastName, String emailAddress, String groupId) {
        super(firstName, lastName, emailAddress);
        this.groupId = groupId;
    }
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }
    
    public void getGradesAverage() {
        double srednia = 0.0;

        for (Double d : grades)
            srednia += d; 
        srednia /= grades.size();
        System.out.println(srednia);
    }
}
