//package com.joel.adopet;
//
//import com.joel.adopet.model.User;
//import com.joel.adopet.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class StartApplication implements CommandLineRunner {
//
//    private final UserRepository repository;
//
//    public StartApplication(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setName("Louise");
//        user.setEmail("louisemafra@hotmail.com");
//        user.setPassword("lou123");
//        repository.save(user);
//
//        for(User u: repository.findAll()){
//            System.out.println(u);
//        }
//    }
//}
