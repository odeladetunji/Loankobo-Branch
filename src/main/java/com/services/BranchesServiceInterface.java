package com.services;

import com.models.BranchID;
import com.models.Branches;

import java.util.List;

public interface BranchesServiceInterface {
    String addABranch();
    List<Branches> getABranch(BranchID payload);
    List<Branches> getAllBranchs();
    String deleteAbranch(BranchID payload);
    String editABranch();
}
