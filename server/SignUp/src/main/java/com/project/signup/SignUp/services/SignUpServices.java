package com.project.signup.SignUp.services;

import com.project.signup.SignUp.model.Details;
import com.project.signup.SignUp.repository.SignUpRepository;
import org.aspectj.lang.reflect.DeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class SignUpServices {
    @Autowired
    private SignUpRepository signUpRepository;
    List<Details> peoples = new ArrayList<>(
            Arrays.asList(
                    new Details("Rahul","kumar","rahulkumar001","12345","rahulkumar001@gmail.com","123456"),
                    new Details("Nikhil","kumar","nikhilkumar002","12346","nikhilkumar002@gmail.com","123678")
            )
    );
    public List<Details> getAllUsers(){
        List<Details> peoples = new ArrayList<>();
        signUpRepository.findAll().forEach(Details->peoples.add(Details));
        return peoples;
    }
    public  Details getUsersInfo(String username){
        return peoples.stream().filter(s ->s.getUsername().equals(username)).findFirst().get();
    }
    public void addUser(Details Details){signUpRepository.save(Details);}
//    public void editUser(String Username,Details updatedDetails){
//        for (int i=0;i<peoples.size();i++){
//            Details s = Details.get(i);
//            if(s.getUsername().equals(Username)){
//                Details.set(i,updatedDetails);
//            }
//        }
//    }
}
