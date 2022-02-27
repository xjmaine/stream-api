package io.streamapi.app.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import io.streamapi.app.model.LiveStream;

@Repository
@Component
public class LiveStreamRepository{
	List<LiveStream> streams = new ArrayList<>();
	
//	using an in-memory
	public LiveStreamRepository() {
		streams.add(new LiveStream(
				UUID.randomUUID().toString(),
				"Rest APIs for stream",
				"Production Ready!",
				null,
				"https://www.youtube.com",
				LocalDateTime.of(2022, 2, 11, 2, 0),
				LocalDateTime.of(2022, 2, 12, 2, 0)
				
				));
		
	}
	
	public List<LiveStream> findAll(){
		return streams;
	}
	
	public LiveStream findById(String id) {
		return streams.stream()
				.filter(stream -> stream
						.getId()
						.equals(id))
						.findFirst()
						.orElseThrow(() -> new IllegalArgumentException("Stream not found"));			
	}
	
	public LiveStream create(LiveStream streamz) {
		streams.add((LiveStream) streams);
		return streamz;
	}
	
	public void update(LiveStream stream, String id) {
		LiveStream existing = streams.stream()
				.filter(s->s.getId()
				.equals(id))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Stream not found"));
		int i = streams.indexOf(existing);
		streams.set(i, stream);
	}
	
	public void delete(String id) {
		streams.removeIf(stream -> stream.getId()
		.equals(id));
		
	}
}
