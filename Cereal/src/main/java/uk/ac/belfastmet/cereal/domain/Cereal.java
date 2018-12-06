package uk.ac.belfastmet.cereal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Cereal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer cerealId;	
private String manufacturer;
private String cereal;
private Double energyKj;
private Double energyKcal;
private Double protein;
private Double carbohydrate;
private Double sugar;
private Double fat;
private Double saturates;
private Double fibre;
private Double sodium;
private Double salt;
private Double iron;

public Cereal(Integer cerealId, String manufacturer, String cereal, Double energyKj, Double energyKcal, Double protein,
		Double carbohydrate, Double sugar, Double fat, Double saturates, Double fibre, Double sodium, Double salt,
		Double iron) {
	super();
	this.cerealId = cerealId;
	this.manufacturer = manufacturer;
	this.cereal = cereal;
	this.energyKj = energyKj;
	this.energyKcal = energyKcal;
	this.protein = protein;
	this.carbohydrate = carbohydrate;
	this.sugar = sugar;
	this.fat = fat;
	this.saturates = saturates;
	this.fibre = fibre;
	this.sodium = sodium;
	this.salt = salt;
	this.iron = iron;
}

public Integer getCerealId() {
	return cerealId;
}

public void setCerealId(Integer cerealId) {
	this.cerealId = cerealId;
}

public String getManufacturer() {
	return manufacturer;
}

public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}

public String getCereal() {
	return cereal;
}

public void setCereal(String cereal) {
	this.cereal = cereal;
}

public Double getEnergyKj() {
	return energyKj;
}

public void setEnergyKj(Double energyKj) {
	this.energyKj = energyKj;
}

public Double getEnergyKcal() {
	return energyKcal;
}

public void setEnergyKcal(Double engeryKcal) {
	this.energyKcal = engeryKcal;
}

public Double getProtein() {
	return protein;
}

public void setProtein(Double protein) {
	this.protein = protein;
}

public Double getCarbohydrate() {
	return carbohydrate;
}

public void setCarbohydrate(Double carbohydrate) {
	this.carbohydrate = carbohydrate;
}

public Double getSugar() {
	return sugar;
}

public void setSugar(Double sugar) {
	this.sugar = sugar;
}

public Double getFat() {
	return fat;
}

public void setFat(Double fat) {
	this.fat = fat;
}

public Double getSaturates() {
	return saturates;
}

public void setSaturates(Double saturates) {
	this.saturates = saturates;
}

public Double getFibre() {
	return fibre;
}

public void setFibre(Double fibre) {
	this.fibre = fibre;
}

public Double getSodium() {
	return sodium;
}

public void setSodium(Double sodium) {
	this.sodium = sodium;
}

public Double getSalt() {
	return salt;
}

public void setSalt(Double salt) {
	this.salt = salt;
}

public Double getIron() {
	return iron;
}

public void setIron(Double iron) {
	this.iron = iron;
}


}
