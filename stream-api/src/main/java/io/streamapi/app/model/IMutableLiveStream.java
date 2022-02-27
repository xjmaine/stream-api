package io.streamapi.app.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IMutableLiveStream {
	private final String id;
	private final String title;
	private final String description;
	private final String art;
	private final String url;
	private final LocalDateTime startDate;
	private final LocalDateTime endDate;

}
