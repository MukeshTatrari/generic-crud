package com.generic.api.generic;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generic.api.response.APIResponse;
import com.generic.api.response.ResponseStatus;

public abstract class GenericController<T extends GenericEntity<T>> {

	private final GenericService<T> service;

	public GenericController(GenericRepository<T> repository) {
		this.service = new GenericService<T>(repository) {
		};
	}

	@GetMapping("")
	public ResponseEntity<?> getPage(Pageable pageable) {

		return new ResponseEntity<>(
				new APIResponse(service.getPage((org.springframework.data.domain.Pageable) pageable),
						ResponseStatus.SUCCESS),
				HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getOne(@PathVariable Long id) {
		return new ResponseEntity<>(new APIResponse(service.get(id), ResponseStatus.SUCCESS), HttpStatus.OK);
	}

	@PutMapping("")
	public ResponseEntity<?> update(@RequestBody T updated) {
		return new ResponseEntity<>(new APIResponse(service.update(updated), ResponseStatus.SUCCESS), HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<?> create(@RequestBody T created) {
		return new ResponseEntity<>(new APIResponse(service.create(created), ResponseStatus.SUCCESS), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.ok("Deleted Successfully ");
	}
}
