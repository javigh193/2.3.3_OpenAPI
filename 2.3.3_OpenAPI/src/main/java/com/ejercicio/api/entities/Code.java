package com.ejercicio.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "code")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Code extends Base {
	
	//package was reserved for some reason i don't know
	@Column(name = "packag")
	private String packag;
	
	@Column(name = "file")
	private String file;

	public String getPackag() {
		return packag;
	}

	public void setPackag(String packag) {
		this.packag = packag;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	
}
