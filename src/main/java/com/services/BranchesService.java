package com.services;

import com.dao.BranchesFullAddressRepository;
import com.dao.BranchesLoanSettingRepository;
import com.dao.BranchesRepository;
import com.factory.AbstractFactory;
import com.factory.ProducerFactory;
import com.models.BranchID;
import com.models.Branches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BranchesService implements BranchesServiceInterface{

    @Autowired
    BranchesFullAddressRepository branchesFullAddressRepository;

    @Autowired
    BranchesLoanSettingRepository branchesLoanSettingRepository;

    @Autowired
    BranchesRepository branchesRepository;

    //here we are using abstract factory parttern!
    public AbstractFactory anEntity(){
        AbstractFactory newEntity = ProducerFactory.newEntity();
        return newEntity; // the Objects should be gotten here!
    }

    @Override
    public String addABranch(){

    }

    @Override
    public List<Branches> getABranch(BranchID payload){

    }

    @Override
    public List<Branches> getAllBranchs(){

    }

    @Override
    public String deleteAbranch(BranchID payload){

    }

    @Override
    public String editABranch(){

    }

}







