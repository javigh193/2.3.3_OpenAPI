package com.ejercicio.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Detail extends Base {
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "budget")
	private Integer budget ;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	
}
