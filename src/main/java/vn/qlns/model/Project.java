package vn.qlns.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "project", catalog = "quanlynhansu", schema = "")
public class Project implements Serializable {
	 private static final long serialVersionUID = 1L;
	    @Id
	    @Basic(optional = false)
	    @NotNull
	    @Size(min = 1, max = 10)
	    @Column(name = "project_ID")
	    private String projectID;
	    @Basic(optional = false)
	    @NotNull
	    @Size(min = 1, max = 50)
	    @Column(name = "project_Name")
	    private String projectName;
	    @JoinColumn(name = "bu_ID", referencedColumnName = "bu_ID")
	    @ManyToOne(fetch = FetchType.LAZY)
	    private Bu buID;

	    public Project() {
	    }

	    public Project(String projectID) {
	        this.projectID = projectID;
	    }

	    public Project(String projectID, String projectName) {
	        this.projectID = projectID;
	        this.projectName = projectName;
	    }

	    public String getProjectID() {
	        return projectID;
	    }

	    public void setProjectID(String projectID) {
	        this.projectID = projectID;
	    }

	    public String getProjectName() {
	        return projectName;
	    }

	    public void setProjectName(String projectName) {
	        this.projectName = projectName;
	    }

	    public Bu getBuID() {
	        return buID;
	    }

	    public void setBuID(Bu buID) {
	        this.buID = buID;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (projectID != null ? projectID.hashCode() : 0);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object object) {
	        // TODO: Warning - this method won't work in the case the id fields are not set
	        if (!(object instanceof Project)) {
	            return false;
	        }
	        Project other = (Project) object;
	        if ((this.projectID == null && other.projectID != null) || (this.projectID != null && !this.projectID.equals(other.projectID))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "model.Project[ projectID=" + projectID + " ]";
	    }
	    

}
