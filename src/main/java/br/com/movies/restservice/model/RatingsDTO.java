package br.com.movies.restservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RatingsDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("Source")
	private String source;
	
	@JsonProperty("Value")
	private String value;


}
