package com.generic.api.generic;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generic.api.response.APIResponse;

@RestController
@RequestMapping("/{entity}")
public interface IBaseController {

	@GetMapping("/{entityId}")
	public <T>ResponseEntity<?> getEntity(@PathVariable T entityId);
	
	@PostMapping("/save")
	public <T> ResponseEntity<?> save(@RequestBody IEntity<T> entity);
	
	@PutMapping("/update")
	public <T> ResponseEntity<?> update(@RequestBody IEntity<T> entity);
	
	@DeleteMapping("/delete/id")
	public <T> ResponseEntity<?> delete(@PathVariable T id);

}
