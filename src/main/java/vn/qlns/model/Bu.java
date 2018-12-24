package vn.qlns.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "bu", catalog = "quanlynhansu", schema = "")
public class Bu implements Serializable {
	 private static final long serialVersionUID = 1L;
	    @Id
	    @Basic(optional = false)
	    @NotNull
	    @Size(min = 1, max = 10)
	    @Column(name = "bu_ID")
	    private String buID;
	    @Basic(optional = false)
	    @NotNull
	    @Size(min = 1, max = 50)
	    @Column(name = "bu_Name")
	    private String buName;
	    @OneToMany(mappedBy = "buID", fetch = FetchType.LAZY)
	    private List<Project> projectList;
	    @OneToMany(mappedBy = "buID", fetch = FetchType.LAZY)
	    private List<Staff> staffList;

	    public Bu() {
	    }



		public Bu(String buID) {
	        this.buID = buID;
	    }

	    public Bu(String buID, String buName) {
	        this.buID = buID;
	        this.buName = buName;
	    }

	    public String getBuID() {
	        return buID;
	    }

	    public void setBuID(String buID) {
	        this.buID = buID;
	    }

	    public String getBuName() {
	        return buName;
	    }

	    public void setBuName(String buName) {
	        this.buName = buName;
	    }

	    public List<Project> getProjectList() {
	        return projectList;
	    }

	    public void setProjectList(List<Project> projectList) {
	        this.projectList = projectList;
	    }

	    public List<Staff> getStaffList() {
	        return staffList;
	    }

	    public void setStaffList(List<Staff> staffList) {
	        this.staffList = staffList;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (buID != null ? buID.hashCode() : 0);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object object) {
	        // TODO: Warning - this method won't work in the case the id fields are not set
	        if (!(object instanceof Bu)) {
	            return false;
	        }
	        Bu other = (Bu) object;
	        if ((this.buID == null && other.buID != null) || (this.buID != null && !this.buID.equals(other.buID))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "model.Bu[ buID=" + buID + " ]";
	    }
	    
}
