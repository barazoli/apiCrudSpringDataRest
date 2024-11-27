package tech.buildrun.rest.api;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import tech.buildrun.rest.entity.User;

@RepositoryRestResource(
    path = "users",
    collectionResourceRel = "users"
)
public interface UserRestRepository extends 
CrudRepository<User, UUID>,
PagingAndSortingRepository<User, UUID> {


    List<User> findByName(@Param("name") String name);

    @Override
    @RestResource(exported = false)
    default void deleteById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }


}
