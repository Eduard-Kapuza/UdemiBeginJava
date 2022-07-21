package Sait.sait.main.java.com.store_phone_smart.smartphone.repository;

import com.store_phone_smart.smartphone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
@Modifying
    @Query(value = "INSERT INTO sign_in (password, login) VALUES (:password, :login)",
    nativeQuery = true)
@Transactional
    void addUser(@Param("password") String password, @Param("login") String login);

}
