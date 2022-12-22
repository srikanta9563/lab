package com.CMS.daoimpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.CMS.Dao.Dao;
import com.CMS.Entity.UserClass;
import com.CMS.Util.UtilNew;

import static com.CMS.Util.UtilNew.*;


public class UserImpl implements Dao{
    public void addStudent() {
        Session session = getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        int id;
        String fname;
        String lname;
        int roll_no;
        String email;
        int age;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student id : ");
        id = s.nextInt();
        System.out.println("Enter Student's first name : ");
        fname = s.next();
        System.out.println("Enter Student's last name : ");
        lname = s.next();
        System.out.println("Enter Student's roll no : ");
        roll_no = s.nextInt();
        System.out.println("Enter Student's email : ");
        email = s.next();
        System.out.println("Enter Student's age : ");
        age=s.nextInt();
        UserClass u = new UserClass();
        u.setId(id);
        u.setFname(fname);
        u.setLname(lname);
        u.setRoll_no(roll_no);
        u.setEmail(email);
        u.setAge(age);
        session.save(u);
        t.commit();
        System.out.println("User record inserted successfully");
        session.close();
    }
    public void readStudent() {
        Session session = getSessionFactory().openSession();
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student id : ");
        i = s.nextInt();
        UserClass w =session.get(UserClass.class,i);
        System.out.println("User id :" + w.getId()+"User FirstName : "+ w.getFname()+"User lastname : "+ w.getLname()+"User email : "+ w.getEmail()+"User age : "+ w.getAge());
        session.close();
    }
    public void updateStudent() {
        Session session = getSessionFactory().openSession();
        Scanner s = new Scanner(System.in);
        Transaction t = session.beginTransaction();
        System.out.println("Enter user id : ");
        int j = s.nextInt();
        UserClass w = session.get(UserClass.class,j);
        System.out.println("Enter your Updated email : ");
        String eml = s.next();
        w.setEmail(eml);
        System.out.println("Enter your updated Age : ");
        int newAge=s.nextInt();
        w.setAge(newAge);
        session.update(w);
        t.commit();
        System.out.println("Updated successfylly");
        session.close();
    }
    public void deleteStudent() {
        Session session = getSessionFactory().openSession();
        Scanner s = new Scanner(System.in);
        Transaction t = session.beginTransaction();
        System.out.println("Enter user id : ");
        int k = s.nextInt();
        UserClass w = session.get(UserClass.class, k);
        session.delete(k);
        t.commit();
        System.out.println("Deleted successfylly");
        session.close();
    }
}