package api.endPoints;

public class Routes {

	public static String baseURL="https://restful-booker.herokuapp.com";
	// Auth module
	public static String auth_URL=baseURL+"/auth";
	
	//booking Module
	public static String bookingUrl=baseURL+"/booking";
	public static String bookingDetailsUsingIdUrl=baseURL+"/booking/{id}";
	
}
