package pe.edu.sise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/saludo")
	public String Login(){
		return "ola ke aaze";
	}
}
