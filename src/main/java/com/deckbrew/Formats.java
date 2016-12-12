package com.deckbrew;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Formats{

	@JsonProperty("commander")
	private String commander;

	@JsonProperty("legacy")
	private String legacy;

	@JsonProperty("vintage")
	private String vintage;

	@JsonProperty("modern")
	private String modern;

	@JsonProperty("standard")
	private String standard;

	public void setCommander(String commander){
		this.commander = commander;
	}

	public String getCommander(){
		return commander;
	}

	public void setLegacy(String legacy){
		this.legacy = legacy;
	}

	public String getLegacy(){
		return legacy;
	}

	public void setVintage(String vintage){
		this.vintage = vintage;
	}

	public String getVintage(){
		return vintage;
	}

	public void setModern(String modern){
		this.modern = modern;
	}

	public String getModern(){
		return modern;
	}

	public void setStandard(String standard){
		this.standard = standard;
	}

	public String getStandard(){
		return standard;
	}
}