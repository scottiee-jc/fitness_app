package com.example.fitness_App.repository;


import com.example.fitness_App.models.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    @Query(
            value = "SELECT " +
                    "* " +
                    "FROM " +
                    "APPLICATION_USER " +
                    "WHERE " +
                    "firstname = ?1 " +
                    "AND " +
                    "lastname = ?2 ",
            nativeQuery = true
    )
    ApplicationUser getUserByName(String firstname, String lastname);

}
