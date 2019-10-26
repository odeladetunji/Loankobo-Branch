package com.factory;

import com.models.Branches;
import com.models.BranchesFullAddress;
import com.models.BranchesLoanSetting;

public abstract class AbstractFactory {
    public abstract Branches getBranches();
    public abstract BranchesFullAddress getBranchesFullAddress();
    public abstract BranchesLoanSetting getBranchesLoanSettings();
}



























