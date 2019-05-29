package HibernateDemo;

import javax.persistence.*;

@Entity
@Table(name = "MyFamily")
public class FamilyToSQL {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "fullName")
	 private String fullName;
	
	@Column(name = "title")
	 private String title;  

	  // public FamilyMember() {}
	 //  public FamilyMember(String fname, String title) {
	    //  this.firstName = fname;
	    //  this.title = title;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}  
	   
}