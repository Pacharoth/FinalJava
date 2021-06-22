package Resort.Resorts;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Resort {
    @Id
    private int id;
    private String phonenumber;
    private int members;
    private Date visiting;
    private Date exitdate;

    public Resort(int id, String phonenumber, int members, Date visiting, Date exitdate) {
        this.id = id;
        this.phonenumber = phonenumber;
        this.members = members;
        this.visiting = visiting;
        this.exitdate = exitdate;
    }
    public Resort(){
        
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getMembers() {
        return this.members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public Date getVisiting() {
        return this.visiting;
    }

    public void setVisiting(Date visiting) {
        this.visiting = visiting;
    }

    public Date getExitdate() {
        return this.exitdate;
    }

    public void setExitdate(Date exitdate) {
        this.exitdate = exitdate;
    }
    
}
