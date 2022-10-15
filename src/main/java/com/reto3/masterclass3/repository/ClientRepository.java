package com.reto3.masterclass3.repository;

import com.reto3.masterclass3.entities.Client;
import com.reto3.masterclass3.entities.Product;
import com.reto3.masterclass3.repository.crudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    public Optional<Client> getClient(int id){
return clientCrudRepository.findById(id);
    }
    public Client save(Client p){

        return clientCrudRepository.save(p);
    }

    public void delete(Client p){

        clientCrudRepository.delete(p);
    }
}
