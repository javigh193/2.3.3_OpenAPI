package com.ejercicio.api.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "blog")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blog extends Base {

	@Column(name = "title")
	private String title;
	
	@Column(name = "date")
	private String date;
	
	@OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true)
	@JoinTable(
			name = "blog_article",
			joinColumns = @JoinColumn(name = "blog_id"),
			inverseJoinColumns = @JoinColumn(name = "article_id")
	)
	private List<Article> articles = new ArrayList<Article>();

	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<User> users;
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	} 
	
}
