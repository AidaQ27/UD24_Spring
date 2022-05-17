package UD24.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD24.dao.ITreballadorDAO;
import UD24.dto.Treballador;


@Service
public class TreballadorServiceImpl implements ITreballadorService {

	@Autowired
	ITreballadorDAO iTreballadorDAO;
	
	@Override
	public List<Treballador> llistarTreballador() {
		
		return iTreballadorDAO.findAll();
	}

	@Override
	public Treballador guardarTreballador(Treballador treballador) {
		
		return iTreballadorDAO.save(treballador);
	}

	@Override
	public Treballador treballadorID(Long id) {
		
		return iTreballadorDAO.findById(id).get();
	}

	@Override
	public List<Treballador> llistarTreballadorNom(String nombre) {
		
		return iTreballadorDAO.findByNombre(nombre);
	}



	@Override
	public void eliminarTreballador(Long id) {
		
		iTreballadorDAO.deleteById(id);
		
	}

	
	
	



}
