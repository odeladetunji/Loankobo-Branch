package com.factory;

import com.models.Branches;
import com.models.BranchesFullAddress;
import com.models.BranchesLoanSetting;

public class EntityFactory extends AbstractFactory {
    @Override
    public Branches getBranches(){
        return new Branches();
    }

    @Override
    public BranchesFullAddress getBranchesFullAddress(){
        return new BranchesFullAddress();
    }

    @Override
    public BranchesLoanSetting getBranchesLoanSettings(){
        return new BranchesLoanSetting();
    }
}
