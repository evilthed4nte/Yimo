package com.yimo.Service.Impl;

import com.yimo.Dao.PetDao;
import com.yimo.Model.Pet;
import com.yimo.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "petService1")
public class PetServceImpl implements PetService {

    @Autowired
    PetDao petDao;

    @Override
    public int buyPet(Pet pet) {
        return petDao.addPet(pet);
    }
}
