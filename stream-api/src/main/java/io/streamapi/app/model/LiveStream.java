package io.streamapi.app.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class LiveStream {

	private String id;
	private String title;
	private String description;
	private String art;
	private String url;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	public LiveStream(String id, String title, String description, String art, String url, LocalDateTime startDate,
			LocalDateTime endDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.art = art;
		this.url = url;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	

}
