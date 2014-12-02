package com.domain.DAO;
import org.springframework.stereotype.Component;

import com.domain.POJO.KeyValuePOJO;


@Component ("keyValueDAO")
public class KeyValueDAO extends BaseDAO<KeyValuePOJO> {
	
	public KeyValueDAO() {
		this.PropertyImplementationBinder (KeyValuePOJO.class);
	}
}
