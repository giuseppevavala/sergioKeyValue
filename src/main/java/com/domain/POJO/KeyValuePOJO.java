package com.domain.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="keyValuePOJO")
public class KeyValuePOJO {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="myid")
	@JsonIgnore
	private int id;
	@Column(name="mykey")
	private String key = "";
	@Column(name="myvalue")
	private String value = "";
	
	@JsonIgnore
	public int getId() {
		return id;
	}
	@JsonIgnore
	public void setId(int id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "ConfigPOJO [id=" + id + ", key=" + key + ", value=" + value
				+ "]";
	}
		
	
	
}