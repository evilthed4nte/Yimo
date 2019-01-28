package com.yimo.Controller;

import com.yimo.Model.Pet;
import com.yimo.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {

    @Autowired
    PetService petService1;

    @Transactional
    @RequestMapping("/Pet")
    public int add(Pet pet){
        return petService1.buyPet(pet);
    }




}
