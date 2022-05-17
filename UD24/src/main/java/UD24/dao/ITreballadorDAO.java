package UD24.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import UD24.dto.Treballador;



public interface ITreballadorDAO extends JpaRepository<Treballador, Long>	 {
	
	public List<Treballador> findByNombre(String nombre);
	
}
