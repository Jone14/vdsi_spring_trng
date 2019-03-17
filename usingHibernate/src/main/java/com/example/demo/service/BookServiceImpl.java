package com.example.demo.service;
import java.util.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;

interface BookService{
	
	public List<Book> getBooks();
	public Long addBook(Book bk);
}


@Repository
public  class BookServiceImpl implements BookService {

	@Autowired
	private EntityManagerFactory factory;
	
	
	@Override
	public List<Book> getBooks() {
		
		Session session =  factory.unwrap(SessionFactory.class).openSession();
                
		     CriteriaBuilder builder = session.getCriteriaBuilder();
		     
		       CriteriaQuery<Book> qry=    builder.createQuery(Book.class);
		                        
		          Root<Book> root =  qry.from(Book.class);
		       
		            	
		        return session.createQuery(qry).getResultList();
	}


	@Override
	public Long addBook(Book bk) {
		
		Session session =  factory.unwrap(SessionFactory.class).openSession();
		
		        Long key =(Long)session.save(bk);
		        
		        session.beginTransaction().commit();
		        
		        return key;
	}

	
	
}
