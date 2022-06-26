package application.data.model;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GreetingModel extends RepresentationModel<GreetingModel>{
	
	private final String content;
	
	@JsonCreator
	public GreetingModel(@JsonProperty("content") String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
}
