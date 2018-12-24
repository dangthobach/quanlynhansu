package vn.qlns.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class ExperiencePK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "staff_ID")
    private String staffID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "skill_ID")
    private String skillID;

    public ExperiencePK() {
    }

    public ExperiencePK(String staffID, String skillID) {
        this.staffID = staffID;
        this.skillID = skillID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getSkillID() {
        return skillID;
    }

    public void setSkillID(String skillID) {
        this.skillID = skillID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffID != null ? staffID.hashCode() : 0);
        hash += (skillID != null ? skillID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExperiencePK)) {
            return false;
        }
        ExperiencePK other = (ExperiencePK) object;
        if ((this.staffID == null && other.staffID != null) || (this.staffID != null && !this.staffID.equals(other.staffID))) {
            return false;
        }
        if ((this.skillID == null && other.skillID != null) || (this.skillID != null && !this.skillID.equals(other.skillID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ExperiencePK[ staffID=" + staffID + ", skillID=" + skillID + " ]";
    }
    
	

}
