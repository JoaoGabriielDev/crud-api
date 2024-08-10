package main.java.service;

import main.java.dao.UserDao;
import main.java.model.User;

import java.util.List;

public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao = userDao;
    }

    public void AddUser(User user){
        if(user.getNome() == null || user.getNome().isEmpty()){
            throw new IllegalArgumentException("O nome do usuario não pode ser vazio.");
        }
        if (user.getEmail() == null || user.getEmail().isEmpty()){
            throw new IllegalArgumentException("O email do usuario não pode ser vazio.");
        }

        userDao.addUser(user);
    }


}
