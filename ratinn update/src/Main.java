import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		RatingDAO dao = new RatingDAO();
		
		ArrayList<Rating> ratingList = dao.list();
		
		System.out.println("Before the Update");
		System.out.format ("%-15s %-15s %-15s %-15s %s\n","Id","Name","Description","Value");
		
		for(Rating r: ratingList) {
			System.out.format ("%-15s %-15s %-15s %-15s %s\n",r.getId(),r.getName(),r.getDescription(),r.getValue());
			
		}
		System.out.println("Enter the Name");
		String name= sc.nextLine();
		
		System.out.println("Enter the Value");
		int value = sc.nextInt();
	
		dao.update(name,value);
		System.out.println("After the Update");
		
		ratingList = dao.list();
		System.out.format ("%-5s %-10s %-15s %-20s %-20s %s\n","Id","Event name","Detail","Start date","End date","Organizer");
		
		for(Rating ra: ratingList) {
			System.out.format ("%-15s %-15s %-15s %-15s %s\n",ra.getId(),ra.getName(),ra.getDescription(),ra.getValue());
			
		
		}
		
	}
}