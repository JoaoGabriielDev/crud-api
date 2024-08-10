package main.java;

import main.java.dao.UserDao;
import main.java.model.User;

public class Main {

    public static void main(String[] args){

        UserDao userDao = new UserDao();

        User newUser = new User(0, "João da Silva", "joao@example.com");

        userDao.addUser(newUser);

        System.out.println("Usuario adicionado com sucesso!");

    }
}
