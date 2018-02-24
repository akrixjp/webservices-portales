package pe.edu.sise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.sise.entities.Usuario;
import pe.edu.sise.service.UsuarioService;

@RestController
public class LoginController {

	@Autowired 
	private UsuarioService usuarioService;
	
	@GetMapping("/saludo")
	public String Login(){
		return "ola ke aaze";
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> finAll(){
		return usuarioService.findAll();
	}
		
	
}
