/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.Cliente;
import pe.edu.upeu.syscenterlife.repositorio.ClienteRepository;

/**
 *
 * @author Datos
 */
@Service
public class ClienteService {
    @Autowired
    ClienteRepository repository;
    //c
public Cliente guardarEntidad(Cliente cliente){
    return repository.save(cliente);
}

    //r
public List<Cliente>listarEntidad(){
    return repository.findAll();
}
//u
public Cliente actualizarEntidad(Cliente cliente){
    return repository.save(cliente);
}
//d
    public void eliminarEntidad(String dniruc){
        repository.delete(repository.findById(dniruc).get());
    }
    public Cliente buscarEntidad(String dniruc){
        return repository.findById(dniruc).get();
    }
}
