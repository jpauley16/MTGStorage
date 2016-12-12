package com.deckbrew;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@JsonProperty("types")
	private List<String> types;

	@JsonProperty("cost")
	private String cost;

	@JsonProperty("formats")
	private Formats formats;

	@JsonProperty("supertypes")
	private List<String> supertypes;

	@JsonProperty("url")
	private String url;

	@JsonProperty("colors")
	private List<String> colors;

	@JsonProperty("store_url")
	private String storeUrl;

	@JsonProperty("subtypes")
	private List<String> subtypes;

	@JsonProperty("editions")
	private List<EditionsItem> editions;

	@JsonProperty("name")
	private String name;

	@JsonProperty("cmc")
	private int cmc;

	@JsonProperty("id")
	private String id;

	@JsonProperty("text")
	private String text;

	@JsonProperty("power")
	private String power;

	@JsonProperty("toughness")
	private String toughness;

	@JsonProperty("loyalty")
	private int loyalty;

	public void setTypes(List<String> types){
		this.types = types;
	}

	public List<String> getTypes(){
		return types;
	}

	public void setCost(String cost){
		this.cost = cost;
	}

	public String getCost(){
		return cost;
	}

	public void setFormats(Formats formats){
		this.formats = formats;
	}

	public Formats getFormats(){
		return formats;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setColors(List<String> colors){
		this.colors = colors;
	}

	public List<String> getColors(){
		return colors;
	}

	public void setStoreUrl(String storeUrl){
		this.storeUrl = storeUrl;
	}

	public String getStoreUrl(){
		return storeUrl;
	}

	public void setSupertypes(List<String> supertypes){
		this.supertypes = supertypes;
	}

	public List<String> getSupertypes(){
		return supertypes;
	}

	public void setSubtypes(List<String> subtypes){
		this.subtypes = subtypes;
	}

	public List<String> getSubtypes(){
		return subtypes;
	}

	public void setEditions(List<EditionsItem> editions){
		this.editions = editions;
	}

	public List<EditionsItem> getEditions(){
		return editions;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCmc(int cmc){
		this.cmc = cmc;
	}

	public int getCmc(){
		return cmc;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setPower(String power){
		this.power = power;
	}

	public String getPower(){
		return power;
	}

	public void setToughness(String toughness){
		this.toughness = toughness;
	}

	public String getToughness(){
		return toughness;
	}

	public int getLoyalty() { return loyalty; }

	public void setLoyalty(int loyalty) { this.loyalty = loyalty; }
}