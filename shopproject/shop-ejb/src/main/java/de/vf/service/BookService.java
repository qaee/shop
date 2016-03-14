package de.vf.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Provider;

import de.vf.model.Book;

/**
 * Session Bean implementation class BookService
 */
@Stateless
public class BookService implements BookServiceLocal {

    
	@Inject
	Instance<Book> books;
    public BookService() {
        // TODO Auto-generated constructor stub
    }

    
    @Inject HistoryBook h;
    
 /*  // @Produces
   // @Inject
    public Provider<Book>getBooks( Provider<Book> books) {
    	return books;
    }*/
    
   
    @Override
    public void readBook() {
    /*	System.out.println(""+j.getClass());
    	System.out.println(j instanceof JavaBook);*/
    //	Book book = books.select(qualifiers);
     //	book.setTitle("Pakistan economy");
    //	System.out.println("Books "+book.getTitle());
    }
}
