package io.streamapi.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.streamapi.app.model.LiveStream;
import io.streamapi.app.repository.LiveStreamRepository;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {
	
	//AutoWired
	private final LiveStreamRepository liveRepo;
	
	public LiveStreamController(LiveStreamRepository liveRepo) {
		
		this.liveRepo = liveRepo;
	}


	//access localhost streams
	@GetMapping
	public List<LiveStream> findAll(){
		return liveRepo.findAll();	
	}
	
	@GetMapping("/{id}")
	public LiveStream findById(@PathVariable String id) {
		return liveRepo.findById(id);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/streams")
	public LiveStream crate (@RequestBody LiveStream stream) {
		return liveRepo.create(stream);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PutMapping("/{id}")
	public void update(@PathVariable String id) {
		 liveRepo.delete(id);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@RequestBody LiveStream stream, @PathVariable String id) {
		 liveRepo.update(stream, id);
	}

}
