package vn.qlns.model;

public class StaffDTO {
	private String proj_name;
	private String bu_name;
	private String staff_name;
	private String desc;
	
	
	public StaffDTO(String proj_name, String bu_name, String staff_name, String desc) {
		super();
		this.proj_name = proj_name;
		this.bu_name = bu_name;
		this.staff_name = staff_name;
		this.desc = desc;
	}


	public String getProj_name() {
		return proj_name;
	}


	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}


	public String getBu_name() {
		return bu_name;
	}


	public void setBu_name(String bu_name) {
		this.bu_name = bu_name;
	}


	public String getStaff_name() {
		return staff_name;
	}


	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	
}
