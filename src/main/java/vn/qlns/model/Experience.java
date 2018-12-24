package vn.qlns.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "experience", catalog = "quanlynhansu", schema = "")
public class Experience implements Serializable {
	private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExperiencePK experiencePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "exp")
    private int exp;
    @JoinColumn(name = "skill_ID", referencedColumnName = "skill_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Skill skill;
    @JoinColumn(name = "staff_ID", referencedColumnName = "staff_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Staff staff;

    public Experience() {
    }

    public Experience(ExperiencePK experiencePK) {
        this.experiencePK = experiencePK;
    }

    public Experience(ExperiencePK experiencePK, int exp) {
        this.experiencePK = experiencePK;
        this.exp = exp;
    }

    public Experience(String staffID, String skillID) {
        this.experiencePK = new ExperiencePK(staffID, skillID);
    }

    public ExperiencePK getExperiencePK() {
        return experiencePK;
    }

    public void setExperiencePK(ExperiencePK experiencePK) {
        this.experiencePK = experiencePK;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (experiencePK != null ? experiencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Experience)) {
            return false;
        }
        Experience other = (Experience) object;
        if ((this.experiencePK == null && other.experiencePK != null) || (this.experiencePK != null && !this.experiencePK.equals(other.experiencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Experience[ experiencePK=" + experiencePK + " ]";
    }

}
