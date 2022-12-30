package application.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.entities.Order;
import application.services.OrderService;

@RestController
@RequestMapping(value = "/orders") // cria a rota
public class OrderResource {

	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") // add o id a rota princial
	public ResponseEntity<Order> findById(@PathVariable Long id) { // transforma o id em string
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
