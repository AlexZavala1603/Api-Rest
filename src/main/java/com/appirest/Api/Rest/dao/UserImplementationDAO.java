package com.appirest.Api.Rest.dao;

import com.appirest.Api.Rest.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository // Va de la mano con la conexión a la base de datos.
@Transactional // Le da la funcionalidad a la clase de armar las consultas SQL.
public class UserImplementationDAO implements UserDAO {

    @PersistenceContext
// Al utilizar esta anotación, el contenedor inyecta de forma automática una referencia válida del EntityManager creado a partir de la Persistence Unit JPA_PU
    private EntityManager entityManager; // Nos sirve para conectar con la BD.

    @Override
    public List<User> getUsers() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();
    }

}