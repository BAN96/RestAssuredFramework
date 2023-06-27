package api.endPoints;

import static io.restassured.RestAssured.*;

import api.payloads.BookingDtls;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BookingEndPoints {

	public static Response getAllBookingIDs() {
		Response response=given()
		.when()
		.get(Routes.bookingUrl);
		
		return response;
	}
	
	public static Response getBookingDetailsUsingID(String id) {
		Response response=given()
				.pathParam("id", id)
				.when()
				.get(Routes.bookingDetailsUsingIdUrl)
				;
		return response;
	}
	public static Response getBookingIDsUsingName(String firstname,String lastname) {
		Response response=given()
				.queryParam("firstname", firstname)
				.queryParam("lastname", lastname)
				.when()
				.get(Routes.bookingUrl)
				;
		return response;
	}
	public static Response getBookingIDsUsingDates(String checkinDate,String checkoutDate) {
		Response response=given()
				.queryParam("checkin", checkinDate)
				.queryParam("checkout", checkoutDate)
				.when()
				.get(Routes.bookingUrl)
				;
		return response;
	}
	public static Response createBooking(BookingDtls payload) {
		Response response=given()
				.header("Content-Type", "application/json")
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				.post(Routes.bookingUrl)
				;
		return response;
	}
	
	
}
