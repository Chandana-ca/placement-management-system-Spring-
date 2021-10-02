package fireflies.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
    private int id;
    private String sname;  
    private String cname;
    private String location;
    public College()
    {
    }
    
	public College(int id, String sname, String cname, String location) {
		super();
		this.id = id;
		this.sname = sname;
		this.cname = cname;
		this.location = location;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", sname=" + sname + ", cname=" + cname + ", location=" +location + "]";
	}
    
}

