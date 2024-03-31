package com.ejercicio.api.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "article")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Article extends Base {

	@Column(name = "title")
	private String title;
	
	//abstract was reserved for reasons unknown to me
	@Column(name = "abstrct")
	private String abstrct;
	
	@Column(name = "content")
	private String content;
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<Tag> tags;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstrct() {
		return abstrct;
	}

	public void setAbstrct(String abstrct) {
		this.abstrct = abstrct;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
}
