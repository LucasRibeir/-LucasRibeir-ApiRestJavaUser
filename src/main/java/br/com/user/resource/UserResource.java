package br.com.user.resource;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.user.entity.User;
import br.com.user.services.UserService;

@RestController
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping("/Users")
	public List<User> list() {
		return service.listAll();

	}

	@GetMapping("/Users/{idUser}")
	public ResponseEntity<User> get(@PathVariable Integer idUser) {
		try {
			User user = service.get(idUser);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/User/save")
	public void add(@RequestBody User user) {
		service.save(user);
	}

	@DeleteMapping("/User/delete/{idUser}")
	public void delete(@PathVariable Integer idUser) {
		service.delete(idUser);
	}


   @PutMapping("/User/update/{idUser}")
   public ResponseEntity<?> update (@RequestBody User user, @PathVariable Integer idUser){
	   try {
		
		   
		   service.save(user);
		   
		   return new ResponseEntity<>(HttpStatus.OK);
	   }catch (NoSuchElementException e) {
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	   }
}
}