package in.ashokit.service;

import java.util.Map;

import in.ashokit.bindings.DcSummary;
import in.ashokit.bindings.Education;
import in.ashokit.bindings.Income;
import in.ashokit.bindings.Kids;
import in.ashokit.bindings.PlanSelection;

public interface DcService {

	public Map<Integer, String> getPlans();
	
	public boolean savePlanSelection(PlanSelection planSel);

	public boolean saveIncome(Income income);

	public boolean saveEducation(Education education);

	public boolean saveKids(Kids kids);

	public DcSummary fetchSummaryInfo(Long caseNum);

}
