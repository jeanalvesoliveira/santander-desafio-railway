package br.com.jean.app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jean.app.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByAccountNumber(String accountNumber);
	
}
