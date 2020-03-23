/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;



public class Lab2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Bill", "Gates", "1");
        Person p2 = new Person("Gal", "Anonim", "2");

        System.out.println(p1);
        System.out.println(p2);
        
        University zut = new University("Zachodniopomorski Uniwersystet Technologiczny w Szczecinie", "zut@zut.edu.pl");
        University wsks = new University("Wyższa Szkoła Kosmetologii Stosowanej w Koluszkach", "wsks@wsks.edu.pl");

        Person s1 = new Student("Jan", "Kowalski", "jkowalski@wi.zut.edu.pl", "32A");
        Person s2 = new Student("Hermenegilda", "Nowak", "henowak@wi.zut.edu.pl", "32A");
        Person t1 = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C++");
  
        EmailRecipient[] spamList = new EmailRecipient[5];
        spamList[0] = zut;
        spamList[1] = wsks;
        spamList[2] = s1;
        spamList[3] = s2;
        spamList[4] = t1;
        
        for(EmailRecipient recipient : spamList) {
            String email = recipient.getEmailAddress();
            System.out.println(email);
        }
        
        ((Student)s1).addGrade(2);
        ((Student)s1).addGrade(5);
        ((Student)s1).addGrade(1);
        ((Student)s1).addGrade(3);
        
        ((Student)s1).getGradesAverage();

    }
    
}
