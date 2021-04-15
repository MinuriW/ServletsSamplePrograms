
public class Event {
    int id;
	String eventName,eventDetail,eventType,eventOrganizerName;
	public Event() {
	}
	public Event(int id,String eventName, String eventDetail, String eventType,
			String eventOrganizerName) {
		super();
		this.eventName = eventName;
		this.eventDetail = eventDetail;
		this.eventType = eventType;
		this.eventOrganizerName = eventOrganizerName;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDetail() {
		return eventDetail;
	}
	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventOrganizerName() {
		return eventOrganizerName;
	}
	public void setEventOrganizerName(String eventOrganizerName) {
		this.eventOrganizerName = eventOrganizerName;
	}
}
