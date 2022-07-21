package Sait.sait.main.java.com.store_phone_smart.smartphone.service.impl;

import com.store_phone_smart.smartphone.entity.Registraciya;
import com.store_phone_smart.smartphone.entity.User;
import com.store_phone_smart.smartphone.repository.UserRepository;
import com.store_phone_smart.smartphone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository=userRepository;
    }
    public List<User> findAll(){
        return  userRepository.findAll();
    }

    public void addUser(Registraciya registraciya) {
        userRepository.addUser(registraciya.getPasswordUser(), registraciya.getNameUser());
    }
}
