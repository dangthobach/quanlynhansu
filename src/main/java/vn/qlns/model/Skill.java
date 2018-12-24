package vn.qlns.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "skill", catalog = "quanlynhansu", schema = "")
public class Skill implements Serializable {
	 private static final long serialVersionUID = 1L;
	    @Id
	    @Basic(optional = false)
	    @NotNull
	    @Size(min = 1, max = 10)
	    @Column(name = "skill_ID")
	    private String skillID;
	    @Basic(optional = false)
	    @NotNull
	    @Size(min = 1, max = 50)
	    @Column(name = "skill_Name")
	    private String skillName;
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skill", fetch = FetchType.LAZY)
	    private Set<Experience> experienceSet;

	    public Skill() {
	    }

	    public Skill(String skillID) {
	        this.skillID = skillID;
	    }

	    public Skill(String skillID, String skillName) {
	        this.skillID = skillID;
	        this.skillName = skillName;
	    }

	    public String getSkillID() {
	        return skillID;
	    }

	    public void setSkillID(String skillID) {
	        this.skillID = skillID;
	    }

	    public String getSkillName() {
	        return skillName;
	    }

	    public void setSkillName(String skillName) {
	        this.skillName = skillName;
	    }

	    public Set<Experience> getExperienceSet() {
	        return experienceSet;
	    }

	    public void setExperienceSet(Set<Experience> experienceSet) {
	        this.experienceSet = experienceSet;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (skillID != null ? skillID.hashCode() : 0);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object object) {
	        // TODO: Warning - this method won't work in the case the id fields are not set
	        if (!(object instanceof Skill)) {
	            return false;
	        }
	        Skill other = (Skill) object;
	        if ((this.skillID == null && other.skillID != null) || (this.skillID != null && !this.skillID.equals(other.skillID))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "model.Skill[ skillID=" + skillID + " ]";
	    }
	    

}
