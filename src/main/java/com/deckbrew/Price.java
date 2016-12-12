package com.deckbrew;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Price{

	@JsonProperty("high")
	private int high;

	@JsonProperty("median")
	private int median;

	@JsonProperty("low")
	private int low;

	public void setHigh(int high){
		this.high = high;
	}

	public int getHigh(){
		return high;
	}

	public void setMedian(int median){
		this.median = median;
	}

	public int getMedian(){
		return median;
	}

	public void setLow(int low){
		this.low = low;
	}

	public int getLow(){
		return low;
	}
}