package vn.qlns.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "staff", catalog = "quanlynhansu", schema = "")
public class Staff implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "staff_ID")
    private String staffID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "staff_Name")
    private String staffName;
    @Column(name = "staff_Age")
    private Integer staffAge;
    @Size(max = 200)
    @Column(name = "descr")
    private String descr;
    @JoinColumn(name = "bu_ID", referencedColumnName = "bu_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Bu buID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staff", fetch = FetchType.LAZY)
    private List<Experience> experienceSet;

    public Staff() {
    }

    public Staff(String staffID) {
        this.staffID = staffID;
    }

    public Staff(String staffID, String staffName) {
        this.staffID = staffID;
        this.staffName = staffName;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Bu getBuID() {
        return buID;
    }

    public void setBuID(Bu buID) {
        this.buID = buID;
    }

    public List<Experience> getExperienceSet() {
        return experienceSet;
    }

    public void setExperienceSet(List<Experience> experienceSet) {
        this.experienceSet = experienceSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffID != null ? staffID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.staffID == null && other.staffID != null) || (this.staffID != null && !this.staffID.equals(other.staffID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Staff[ staffID=" + staffID + " ]";
    }
}
