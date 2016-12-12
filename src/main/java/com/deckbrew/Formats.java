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
}