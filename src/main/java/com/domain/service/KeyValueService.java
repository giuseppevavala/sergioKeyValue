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


	public List<KeyValuePOJO> getAllelements() {
		return keyValueDAO.getAll();
	}
	
	public KeyValuePOJO getFromKey(String key) {
		return keyValueDAO.getObjWithLikeCondition("key", key);
	}

	public void update(KeyValuePOJO elem) {
		keyValueDAO.update(elem);		
	}
	
	public void addKeyValue(KeyValuePOJO elem) {
		keyValueDAO.addObject(elem);		
	}
	
	public void saveOrUpdate (KeyValuePOJO elem)
	{
		KeyValuePOJO existingElem = null;
		
		existingElem = getFromKey(elem.getKey());
		if (existingElem == null)
			addKeyValue (elem);
		else{
			existingElem.setValue(elem.getValue());
			update(existingElem);
		}
	}
    
    
}
