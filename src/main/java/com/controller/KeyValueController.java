package com.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.POJO.KeyValuePOJO;
import com.domain.service.KeyValueService;

@Controller
public class KeyValueController{
   // private static final int BUFSIZE = 4096;
	private Logger logger  = LoggerFactory.getLogger(this.getClass());;
	
	@Autowired
	KeyValueService keyValueService;
	
	@PostConstruct
	public void init() {
		logger.debug("-------------- >>>>>>>>>>>>>>>>>>>>>> KeyValue Controller <<<<<<<<<<<<<<<<<<<< ----------------");
	}

   @RequestMapping(value="/keyvalues", method=RequestMethod.POST)
   public @ResponseBody String addKeyValue(
		   @RequestBody List<KeyValuePOJO> array ) 
   {
	   for (KeyValuePOJO elem : array) 
		   keyValueService.addKeyValue (elem);
		
	   logger.info("ADD: " + array);
	   return "Elementi aggiunti con successo";
   }
   
   @RequestMapping(value="/keyvalue", method=RequestMethod.POST)
   public @ResponseBody String addKeyValue(
		   @RequestBody KeyValuePOJO elem ) 
   {
	   keyValueService.addKeyValue (elem);
	   
	   logger.info("ADD: " + elem);
	   return "Elemento aggiunto con successo";
   }
   
   @RequestMapping(value="/keyvalues", method=RequestMethod.GET)
   public @ResponseBody List<KeyValuePOJO> getUser() {
	   logger.info("get request");
	   return keyValueService.getAllelements();
   }
      
  
}
