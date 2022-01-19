package br.com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.user.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
