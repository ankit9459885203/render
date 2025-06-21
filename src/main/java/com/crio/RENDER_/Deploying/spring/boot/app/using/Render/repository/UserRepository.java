package com.crio.RENDER_.Deploying.spring.boot.app.using.Render.repository;

import com.crio.RENDER_.Deploying.spring.boot.app.using.Render.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data REST will automatically expose CRUD endpoints for the User entity.
}


/*The @RepositoryRestResource annotation automatically exposes your UserRepository as RESTful endpoints with:

path = "users" Defines the URL path for the REST endpoints.   Example:  GET /users → Returns all users    ,POST /users → Creates a new user
collectionResourceRel = "users"   Defines the JSON wrapper key for the response.


Hence No need to write controllers—Spring Data REST handles it automatically.
*/