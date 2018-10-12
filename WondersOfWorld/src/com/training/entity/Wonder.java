package com.training.entity;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class Wonder {

	@NotNull
	private String wonderName;

	@NotNull
	private String imageLoc;

	private String description;

	@NotNull
	private String continent;

	@NotNull
	private String category;

	public Wonder() {

		super();
	}

	public Wonder(String wonderName, String imageLoc, String description, String continent, String category) {

		super();
		this.wonderName = wonderName;
		this.imageLoc = imageLoc;
		this.description = description;
		this.continent = continent;
		this.category = category;
	}

	public String getWonderName() {

		return wonderName;
	}

	public void setWonderName(String wonderName) {

		this.wonderName = wonderName;
	}

	public String getImageLoc() {

		return imageLoc;
	}

	public void setImageLoc(String imageLoc) {

		this.imageLoc = imageLoc;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	public String getContinent() {

		return continent;
	}

	public void setContinent(String continent) {

		this.continent = continent;
	}

	public String getCategory() {

		return category;
	}

	public void setCategory(String category) {

		this.category = category;
	}

	@Override
	public String toString() {

		return "Wonder [wonderName=" + wonderName + ", imageLoc=" + imageLoc + ", description=" + description
				+ ", continent=" + continent + ", category=" + category + "]";
	}

}
