package com.controllers;

import com.models.BranchID;
import com.models.Branches;
import com.services.BranchesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BranchesController {

    @Autowired
    BranchesServiceInterface branchesServiceInterface;


    @ResponseBody
    @GetMapping(path = "/")
    public String ping(){
        return "ping successfull";
    }

    @ResponseBody
    @GetMapping(path = "/getAllBranchs")
    public List<Branches> getAllBranchs(){

    }

    @ResponseBody
    @GetMapping(path = "getABranch")
    public List<Branches> getABranch(BranchID payload){

    }

    @ResponseBody
    @PostMapping(path = "addABranch")
    public String addABranch(){

    }

    @ResponseBody
    @DeleteMapping(path = "/deleteAbranch")
    public String deleteAbranch(BranchID payload){

    }

    @ResponseBody
    @PostMapping(path = "/editABranch")
    public String editABranch(){

    }

}
