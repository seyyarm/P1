package com.revature.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.User;
import com.revature.util.HibernateUtil;

public class UserDao {
	
	public int insert(User user) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		int pk = (int) ses.save(user); // can insert into the database
		
		try{
			tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return pk;
	}
	
	 public void listUsers(){
		 Session ses = HibernateUtil.getSession();
	     Transaction tx = null;
	      
	      try {
	         tx = ses.beginTransaction();
	         List <User> userList= ses.createQuery("FROM users").list(); 
	         for (Iterator iterator = userList.iterator(); iterator.hasNext();){
	            User user = (User) iterator.next(); 
	            System.out.print("  User Id  : " + user.getId()); 
	            System.out.print("  User Name : " + user.getUserName()); 
	            System.out.print("  Password  : " + user.getPass()); 
	            System.out.println("  User Email : " + user.getEmail()); 
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         ses.close(); 
	      }
	   }
	 
		public List<User> list() {
			Session ses = HibernateUtil.getSession();
			List<User> userList = ses.createQuery("from users").list();
			ses.close();
			return userList;
		}

}
