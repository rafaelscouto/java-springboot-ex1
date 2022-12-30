package application.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.entities.Category;
import application.services.CategoryService;

@RestController
@RequestMapping(value = "/categories") // cria a rota
public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") // add o id a rota princial
	public ResponseEntity<Category> findById(@PathVariable Long id) { // transforma o id em string
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
