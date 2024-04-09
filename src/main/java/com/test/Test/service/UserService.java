package com.test.Test.service;

import com.test.Test.entity.User;
import com.test.Test.entity.UserResponse;
import com.test.Test.repository.IUserRepository;
import com.test.Test.repository.IUserResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IUserResponseRepository userResponseRepository;


    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findByEmail(String email) {return userRepository.findByEmail(email); }

    //funcion para guardar el response correspondiente a un nuevo usuario creado
    public void guardarUserConResponse(User user, UserResponse userResponse){
        //guarda response correspondiente del usuario
        this.userResponseRepository.save(userResponse);

        //se establece fecha de modificacion del user
        userResponse.setModified(new Date());

        //se establece fecha de ultima conexion del user
        userResponse.setLastLogin(new Date());

        user.setUserResponse(userResponse);
        userResponse.setUser(user);
        this.userRepository.save(user);
    }


}
