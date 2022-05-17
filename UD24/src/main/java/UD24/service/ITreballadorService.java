package UD24.service;

import UD24.dto.Treballador;


import java.util.List;


public interface ITreballadorService {
	
	//Metodos del CRUD
	public List<Treballador> llistarTreballador();
	
	public Treballador guardarTreballador(Treballador treballador);
	
	public Treballador treballadorID(Long id);
	
	public List<Treballador> llistarTreballadorNom(String nombre);
	
	//public Treballador actulitzarTreballador(Treballador treballador);
	
	public void eliminarTreballador(Long id);

	
	
}
