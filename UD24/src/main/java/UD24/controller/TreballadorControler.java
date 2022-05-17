package UD24.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import UD24.dto.Treballador;
import UD24.service.TreballadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TreballadorControler {
	
	@Autowired
	TreballadorServiceImpl treballadorServiceImpl;
	
	@GetMapping("/treballadors")
	public List<Treballador> llistarTreballadors() {
		return treballadorServiceImpl.llistarTreballador();
	}
	
	
	@GetMapping("/treballadors/nombre/{nombre}")
	public List<Treballador> llistarTreballadorsNom(@PathVariable(name= "nombre") String nombre) {
		
		return treballadorServiceImpl.llistarTreballadorNom(nombre);
	}
	

	@GetMapping("/treballadors/{id}")
	public Treballador treballadorID(@PathVariable(name="id")Long id) {
		
		Treballador treballador = new Treballador();
		treballador = treballadorServiceImpl.treballadorID(id); 
		
		System.out.println("Treballador ID: "+ treballador);
		
		return treballador;
	}
	
	@PostMapping("/treballadors")
	public Treballador guardarTreballador(@RequestBody Treballador treballador) {
		
		switch (treballador.getTipo_feina().toString()) {
		case "Developer":
			treballador.setSou(1100.0);
			break;
		case "Informatico":
			treballador.setSou(1200.0);
			break;
		case "Celador":
			treballador.setSou(1000.0);
			break;
		case "Team Leader":
			treballador.setSou(1200.0);
			break;
		default:
			break;
		}
		return treballadorServiceImpl.guardarTreballador(treballador);
		
	}
	
		
	
	@PutMapping("/treballadors/{id}")
	public void eliminarTreballador(@PathVariable(name="id")Long id) {
		treballadorServiceImpl.eliminarTreballador(id);
	}
}


