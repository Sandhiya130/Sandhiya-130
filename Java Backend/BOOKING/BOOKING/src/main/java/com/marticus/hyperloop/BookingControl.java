package com.marticus.hyperloop;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marticus.hyperloopbook.Booking;


@Controller
public class BookingControl {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}
	
	@RequestMapping(value = "/passengername", method = RequestMethod.POST)
	public String user1(@Validated Booking booking, Model model) {
		
		Session session=com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(booking);
		session.getTransaction().commit();
		session.close();
		model.addAttribute("name", booking.getName());
		model.addAttribute("age", booking.getAge());
		model.addAttribute("gen", booking.getGender());
		model.addAttribute("sta", booking.getState());
		return "booking";
	}
	@RequestMapping(value = "/booking", method = RequestMethod.GET)
	public String user(@Validated Booking booking, Model model) {
		model.addAttribute("from", booking.getFrom());
		model.addAttribute("to", booking.getTo());
		model.addAttribute("couch", booking.getPreferenceCouch());
		model.addAttribute("name", booking.getTrainNo());
		Session session=com.marticus.utility.HibernateUtil.
				getSessionFactory().openSession();
		session.beginTransaction();
		session.update(booking);
		session.getTransaction().commit();
		session.close();
		return "confirmbooking";
	}
	@RequestMapping(value ="/viewticket/${id}", method= RequestMethod.GET)
	public String user2(@Validated  Booking view, Model model) {
		
		model.addAttribute("from", view.getFrom());
		model.addAttribute("to", view.getTo());
		model.addAttribute("couch", view.getPreferenceCouch());
		model.addAttribute("trainno", view.getTrainNo());
		model.addAttribute("name", view.getName());
		model.addAttribute("age", view.getAge());
		model.addAttribute("gen", view.getGender());
		model.addAttribute("sta", view.getState());
		model.addAttribute("idp", view.getProof());
		return "ticket";
		
	}
	
	
}
