package pe.edu.sise.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.edu.sise.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario,Integer>{
	//Listado de todos los Usuarios
	List<Usuario> findAll();
 }
