/**
 * 
 */
package hotelreservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author I325765
 *
 */
public class HotelReservation {
	
	static int hotelSize = 0;

	public static void main(String[] args) {

		final int DAYS = 365;
		boolean input = true, decline;
		String date;
		int startDate, endDate;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input the number of rooms in hotel");
		hotelSize = scanner.nextInt();

		int[][] bookHotel = new int[hotelSize][DAYS];

		while(input) {
			decline = true;
			System.out.println("Enter the booking dates as startDate,endDate. Enter Exit to terminate.");
			date = scanner.next();
			if(date.equalsIgnoreCase("exit")) {
				input = false;
				break;
			}

			List<Integer> dateValues = new ArrayList<Integer>();
			Matcher m = Pattern.compile("-?\\d+").matcher(date);
			while(m.find()) {
				dateValues.add((Integer.parseInt(m.group())));
			}

			startDate = dateValues.get(0);
			endDate = dateValues.get(1);
			if(!validateInput(startDate, endDate)) {
				System.out.println("Decline");
				continue;
			}

			if(checkAvailability(startDate,endDate, bookHotel)) {
				decline = false;
				System.out.println("Accept");
				continue;
			}

			if(decline) 
				System.out.println("Decline");

		}

	}
	
	/**
	 * Check the Room Availability 
	 * @param startDate
	 * @param endDate
	 * @param bookHotel
	 * @return
	 */
	public static boolean checkAvailability(int startDate, int endDate, int[][] bookHotel) {
		for(int i=0; i<hotelSize; i++) {
			boolean roomAvailable = true;
			for(int j=startDate; j<=endDate; j++) {
				if(bookHotel[i][j] !=0) {
					roomAvailable = false;
					break;
				}
			}
			if(roomAvailable) {
				reserveRoom(i, startDate, endDate, bookHotel);
				return true;
			}

		}
		return false;
	}
	
	/**
	 * Update the room reservation 
	 * @param roomNumber
	 * @param startDate
	 * @param endDate
	 * @param bookHotel
	 */
	public static void reserveRoom(int roomNumber, int startDate, int endDate, int[][] bookHotel) {
		for(int i=startDate; i<=endDate; i++) 
			bookHotel[roomNumber][i] = 1;
		
	}
	
	/**
	 * Validate the user input
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static boolean validateInput(int startDate, int endDate) {
		if(startDate<0 || startDate>364 || endDate<0 || endDate>364)
			return false;
		return true;
	}

}
