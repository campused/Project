package org.camp.used;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
    @RequestMapping(path = "about", method = RequestMethod.GET)
    public void about() {
        logger.info("about");
    }
    
    @RequestMapping(path = "shop", method = RequestMethod.GET)
    public void shop() {
        logger.info("shop");
    }
    
    @RequestMapping(path = "cart", method = RequestMethod.GET)
    public void cart() {
        logger.info("cart");
    }
    
    @RequestMapping(path = "order", method = RequestMethod.GET)
    public void order() {
    }
    
    @RequestMapping(path = "address", method = RequestMethod.GET)
    public void address() {
    }
    
    @RequestMapping(path = "alerts", method = RequestMethod.GET)
    public void alerts() {
    }
    
    @RequestMapping(path = "buttons", method = RequestMethod.GET)
    public void buttons() {
    }
    
    @RequestMapping(path = "checkout", method = RequestMethod.GET)
    public void checkout() {
    }
    
    @RequestMapping(path = "comfirmation", method = RequestMethod.GET)
    public void comfirmation() {
    }
    
    @RequestMapping(path = "contact", method = RequestMethod.GET)
    public void contact() {
    }
    
    @RequestMapping(path = "dashboard", method = RequestMethod.GET)
    public void dashboard() {
    }
    
    @RequestMapping(path = "faq", method = RequestMethod.GET)
    public void faq() {
    }
    
    @RequestMapping(path = "login", method = RequestMethod.GET)
    public void login() {
    }
    
    @RequestMapping(path = "pricing", method = RequestMethod.GET)
    public void pricing() {
    }
    
    @RequestMapping(path = "product-single", method = RequestMethod.GET)
    public String productsingle() {
    	return "product-single";
    }
    
    @RequestMapping(path = "signin", method = RequestMethod.GET)
    public void signin() {
    }
    
    @RequestMapping(path = "typography", method = RequestMethod.GET)
    public void typography() {
    }
    
    @RequestMapping(path = "404", method = RequestMethod.GET)
    public String errorPage() {
    	return "404";
    }
//    
//    @RequestMapping(path = "address", method = RequestMethod.GET)
//    public void address() {
//    }
//    
//    @RequestMapping(path = "address", method = RequestMethod.GET)
//    public void address() {
//    }
//    
//    @RequestMapping(path = "address", method = RequestMethod.GET)
//    public void address() {
//    }
//    
//    @RequestMapping(path = "address", method = RequestMethod.GET)
//    public void address() {
//    }
    
	
}
