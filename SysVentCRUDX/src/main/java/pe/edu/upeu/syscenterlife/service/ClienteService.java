/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.dao.ClienteDao;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

/**
 *
 * @author Datos
 */
@Service
public class ClienteService {
    
    ClienteDao clienteDao=new ClienteDao();

    List<Cliente> listaCli = new ArrayList<>();

    public boolean saveEntidad(Cliente Cliente) {//crear
        return clienteDao.guardarCliente(Cliente)==1?true:false;
    }

    public List<Cliente> listarEntidad() {//reportar
        return clienteDao.ListarCliente();
    }

    public Cliente buscarCliente(String dnirucx) {
        return listaCli.stream()
                .filter(cliente -> cliente.getDniruc().equals(dnirucx))
                .findFirst()
                .orElse(null); // Devuelve null si no se encuentra ningún cliente
    }

    public Cliente updateEntidad(Cliente clientex) {
        listaCli.stream()
                .filter(cliente
                        -> cliente.getDniruc().equals(clientex.getDniruc())) // Filtrar por DNI
                .findFirst() // Obtener el primer cliente que cumpla con el filtro
                .ifPresent(cliente
                        -> cliente.setNombres(clientex.getNombres()));
//return this.listaCli.set(index, cliente);
        return buscarCliente(clientex.getDniruc());
    }

    public void deleteRegistEntdad(String dato) {//delete
        this.listaCli.remove(listaCli.stream()
                .filter(cliente -> cliente.getDniruc().equals(dato))
                .findFirst().orElse(null));
    }
}
