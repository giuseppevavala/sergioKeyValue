package com.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.DAO.KeyValueDAO;
import com.domain.POJO.KeyValuePOJO;

@Service("keyValueSvc")
public class KeyValueService {
      
    @Autowired
    private KeyValueDAO keyValueDAO;

	public void addKeyValue(KeyValuePOJO elem) {
		keyValueDAO.addObject(elem);		
	}

	public List<KeyValuePOJO> getAllelements() {
		return keyValueDAO.getAll();
	}
    
    
}
