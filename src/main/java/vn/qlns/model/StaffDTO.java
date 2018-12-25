package vn.qlns.model;

public class StaffDTO {
	private String project_Name;
	private String bu_Name;
	private String staff_Name;
	private String descr;

	public StaffDTO() {
		super();
	}

	public String getProject_Name() {
		return project_Name;
	}

	public void setProject_Name(String project_Name) {
		this.project_Name = project_Name;
	}

	public String getBu_Name() {
		return bu_Name;
	}

	public void setBu_Name(String bu_Name) {
		this.bu_Name = bu_Name;
	}

	public String getStaff_Name() {
		return staff_Name;
	}

	public void setStaff_Name(String staff_Name) {
		this.staff_Name = staff_Name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	

}
