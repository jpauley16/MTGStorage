package com.deckbrew;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class EditionsItem{

	@JsonProperty("set")
	private String set;

	@JsonProperty("multiverse_id")
	private int multiverseId;

	@JsonProperty("artist")
	private String artist;

	@JsonProperty("image_url")
	private String imageUrl;

	@JsonProperty("set_url")
	private String setUrl;

	@JsonProperty("url")
	private String url;

	@JsonProperty("store_url")
	private String storeUrl;

	@JsonProperty("flavor")
	private String flavor;

	@JsonProperty("layout")
	private String layout;

	@JsonProperty("number")
	private String number;

	@JsonProperty("price")
	private Price price;

	@JsonProperty("html_url")
	private String htmlUrl;

	@JsonProperty("set_id")
	private String setId;

	@JsonProperty("rarity")
	private String rarity;

	public void setSet(String set){
		this.set = set;
	}

	public String getSet(){
		return set;
	}

	public void setMultiverseId(int multiverseId){
		this.multiverseId = multiverseId;
	}

	public int getMultiverseId(){
		return multiverseId;
	}

	public void setArtist(String artist){
		this.artist = artist;
	}

	public String getArtist(){
		return artist;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setSetUrl(String setUrl){
		this.setUrl = setUrl;
	}

	public String getSetUrl(){
		return setUrl;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setStoreUrl(String storeUrl){
		this.storeUrl = storeUrl;
	}

	public String getStoreUrl(){
		return storeUrl;
	}

	public void setFlavor(String flavor){
		this.flavor = flavor;
	}

	public String getFlavor(){
		return flavor;
	}

	public void setLayout(String layout){
		this.layout = layout;
	}

	public String getLayout(){
		return layout;
	}

	public void setNumber(String number){
		this.number = number;
	}

	public String getNumber(){
		return number;
	}

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	public void setHtmlUrl(String htmlUrl){
		this.htmlUrl = htmlUrl;
	}

	public String getHtmlUrl(){
		return htmlUrl;
	}

	public void setSetId(String setId){
		this.setId = setId;
	}

	public String getSetId(){
		return setId;
	}

	public void setRarity(String rarity){
		this.rarity = rarity;
	}

	public String getRarity(){
		return rarity;
	}
}