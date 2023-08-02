package in.ashokit.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.DcSummary;
import in.ashokit.bindings.Education;
import in.ashokit.bindings.Income;
import in.ashokit.bindings.Kids;
import in.ashokit.bindings.PlanSelection;
import in.ashokit.service.DcService;

@RestController
public class DcRestController {

	@Autowired
	private DcService dcService;

	@GetMapping("/plan-names")
	public Map<Integer, String> getPlans() {
		return dcService.getPlans();
	}

	@PostMapping("/plan-selection")
	public ResponseEntity<String> savePlanSelection(@RequestBody PlanSelection planSelInfo) {
		boolean status = dcService.savePlanSelection(planSelInfo);
		if (status) {
			return new ResponseEntity<>("Plan Selection Saved", HttpStatus.OK);
		}
		return new ResponseEntity<>("Problem Occured", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@PostMapping("/income")
	public ResponseEntity<String> saveIncome(@RequestBody Income income) {
		boolean status = dcService.saveIncome(income);
		if (status) {
			return new ResponseEntity<>("Income Saved", HttpStatus.OK);
		}
		return new ResponseEntity<>("Problem Occured", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@PostMapping("/education")
	public ResponseEntity<String> saveEducation(@RequestBody Education education) {
		boolean status = dcService.saveEducation(education);
		if (status) {
			return new ResponseEntity<>("Education Saved", HttpStatus.OK);
		}
		return new ResponseEntity<>("Problem Occured", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@PostMapping("/kids")
	public ResponseEntity<String> saveKids(@RequestBody Kids kids) {
		boolean status = dcService.saveKids(kids);
		if (status) {
			return new ResponseEntity<>("Kids Saved", HttpStatus.OK);
		}
		return new ResponseEntity<>("Problem Occured", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@GetMapping("/dc-summary/{caseNum}")
	public ResponseEntity<DcSummary> getDcSummary(@PathVariable Long caseNum) {
		DcSummary summaryInfo = dcService.fetchSummaryInfo(caseNum);
		return new ResponseEntity<>(summaryInfo, HttpStatus.OK);
	}

}
