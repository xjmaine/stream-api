package io.streamapi.app.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class MutableLiveStream {

	private String id;
	private String title;
	private String description;
	private String art;
	private String url;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	
	
	

}
