package com.ejercicio.api.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project extends Base {
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "open")
	private Boolean open;
	
	@OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true)
	@JoinTable(
			name = "project_detail",
			joinColumns = @JoinColumn(name = "project_id"),
			inverseJoinColumns = @JoinColumn(name = "detail_id")
	)
	private List<Detail> details = new ArrayList<Detail>();
	
	@OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true)
	@JoinTable(
			name = "project_codes",
			joinColumns = @JoinColumn(name = "project_id"),
			inverseJoinColumns = @JoinColumn(name = "code_id")
	)
	private List<Code> codes = new ArrayList<Code>();

	public String getDescription() {
		return description;
	}
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<User> users;

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public List<Detail> getDetails() {
		return details;
	}

	public void setDetails(List<Detail> details) {
		this.details = details;
	}

	public List<Code> getCodes() {
		return codes;
	}

	public void setCodes(List<Code> codes) {
		this.codes = codes;
	}
	
}
