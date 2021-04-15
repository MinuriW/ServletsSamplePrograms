import java.util.Date;
public class Hall {
    int id;
	String hallName;
	Date startDate;
	Date endDate;
	Double price;
	public Hall() {
	}
	public Hall(int id, String hallName, Date startDate, Date endDate, Double price) {
		super();
		this.id = id;
		this.hallName = hallName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHallName() {
		return hallName;
	}
	public void setHallName(String hallName) {
		this.hallName = hallName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}	
}
