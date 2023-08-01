package in.ashokit.bindings;

import java.time.LocalDate;

public class Kid {

	private String kidName;

	private LocalDate kidDob;

	private Long kidSsn;

	public String getKidName() {
		return kidName;
	}

	public void setKidName(String kidName) {
		this.kidName = kidName;
	}

	public LocalDate getKidDob() {
		return kidDob;
	}

	public void setKidDob(LocalDate kidDob) {
		this.kidDob = kidDob;
	}

	public Long getKidSsn() {
		return kidSsn;
	}

	public void setKidSsn(Long kidSsn) {
		this.kidSsn = kidSsn;
	}

}
