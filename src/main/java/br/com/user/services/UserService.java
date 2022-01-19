package br.com.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.user.entity.User;
import br.com.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> listAll() {
		return repo.findAll();
	}

	public void save(User u) {
		repo.save(u);
	}

	public void delete(Integer idUser) {
		repo.deleteById(idUser);
	}

	
	public User get(Integer idUser) {
		return repo.findById(idUser).get();
	}
}
