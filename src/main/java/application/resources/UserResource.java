package application.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.entities.User;
import application.services.UserService;

@RestController
@RequestMapping(value = "/users") // cria a rota
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") // add o id a rota princial
	public ResponseEntity<User> findById(@PathVariable Long id) { // transforma o id em string
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
