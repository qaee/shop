package de.vf.service;

import java.util.Collection;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RunAs;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.ScheduleExpression;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import javax.inject.Inject;

import de.vf.dao.BookDao;
import de.vf.model.Book;

/**
 * Session Bean implementation class FeatureProduct
 */
@Singleton
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class FeatureBook implements FeatureBookLocal,javax.ejb.TimedObject {

	@Inject
	BookDao dao;
	
	@Resource
	SessionContext sc;
	
	Book featuredBook;
	
    @PostConstruct
	private void init() {
    	featuredBook = dao.getFeaturedProduct();
    	ScheduleExpression arg0 = new ScheduleExpression();
    	arg0.hour("*");
    	arg0.minute("*");
    	arg0.second("*/20");
    	TimerService ts = sc.getTimerService();
    	
    	ts.createCalendarTimer(arg0);
		//timer.createCalendarTimer(arg0);
    	
    }
    
   // @Timeout
    private void refreshFeaturedBook() {
    	System.out.println("book read +++++++++++++++++++++ "+new Date(System.currentTimeMillis()));
    	featuredBook = dao.getFeaturedProduct();
    }

    public  Book  getFeaturedBook() {
    	return featuredBook;
    }

	@Override
	public void ejbTimeout(Timer arg0) {
		System.out.println("*********************************************   here ..........."+new Date(System.currentTimeMillis()));
		Collection<Timer> timers = sc.getTimerService().getTimers();
		System.out.println("################################### .........");
	}
}
