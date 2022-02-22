package com.generic.api.generic;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
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
import com.generic.api.response.ResponseStatus;

@RestController
@RequestMapping("/api/")
public class IBaseController {

	@Resource()
	private Map<String, IBaseService> services;
	
	@GetMapping("{entity}/{entityId}")
	public <T> ResponseEntity<?> getEntityById(@PathVariable String entity, @PathVariable T entityId) {
		IBaseService service = services.get(entity);
		IEntity response = (IEntity) service.findById(entityId);
		return new ResponseEntity<>(new APIResponse(response, ResponseStatus.SUCCESS), HttpStatus.OK);
	}

	@PostMapping("{entity}/save")
	public <T> ResponseEntity<?> save(@PathVariable String entity, @RequestBody IEntity<T> object) {
		IBaseService service = services.get(entity);
		IEntity reponse = (IEntity) service.save(object);
		return new ResponseEntity<>(new APIResponse(reponse, ResponseStatus.SUCCESS), HttpStatus.CREATED);
	}

	@PutMapping("{entity}/update")
	public <T> ResponseEntity<?> update(@PathVariable String entity, @RequestBody IEntity<T> object) {
		IBaseService service = services.get(entity);
		IEntity reponse = (IEntity) service.update(entity);
		return new ResponseEntity<>(new APIResponse(reponse, ResponseStatus.SUCCESS), HttpStatus.OK);
	}

	@DeleteMapping("{entity}/delete/id")
	public <T> ResponseEntity<?> delete(@PathVariable String entity, @PathVariable T id) {
		IBaseService service = services.get(entity);
		service.deleteById((String) id);
		return new ResponseEntity<>(new APIResponse("Deleted Successfully", ResponseStatus.SUCCESS), HttpStatus.OK);
	}

}
