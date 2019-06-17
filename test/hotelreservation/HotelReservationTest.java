/**
 * 
 */
package hotelreservation;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author I325765
 *
 */
public class HotelReservationTest {

	@Test
	public void testCheckAvailabilityTestOne() {
		HotelReservation.hotelSize = 1;
		int[][] bookHotel = new int[HotelReservation.hotelSize][365];

		if(HotelReservation.validateInput(-4,2))
			assertFalse(HotelReservation.checkAvailability(-4, 2, bookHotel));

		if(HotelReservation.validateInput(200,400))
			assertFalse(HotelReservation.checkAvailability(200, 400, bookHotel));
	}

	@Test
	public void testCheckAvailabilityTestTwo() {
		HotelReservation.hotelSize = 3;
		int[][] bookHotel = new int[HotelReservation.hotelSize][365];
		
		if(HotelReservation.validateInput(0,5))
			assertTrue(HotelReservation.checkAvailability(0, 5, bookHotel));
		
		if(HotelReservation.validateInput(7,13))
			assertTrue(HotelReservation.checkAvailability(7, 13, bookHotel));
		
		if(HotelReservation.validateInput(3,9))
			assertTrue(HotelReservation.checkAvailability(3, 9, bookHotel));
		
		if(HotelReservation.validateInput(5,7))
			assertTrue(HotelReservation.checkAvailability(5, 7, bookHotel));
		
		if(HotelReservation.validateInput(6,6))
			assertTrue(HotelReservation.checkAvailability(6, 6, bookHotel));
		
		if(HotelReservation.validateInput(0,4))
			assertTrue(HotelReservation.checkAvailability(0, 4, bookHotel));

	}
	
	@Test
	public void testCheckAvailabilityTestThree() {
		HotelReservation.hotelSize = 3;
		int[][] bookHotel = new int[HotelReservation.hotelSize][365];
		
		if(HotelReservation.validateInput(1,3))
			assertTrue(HotelReservation.checkAvailability(1, 3, bookHotel));
		
		if(HotelReservation.validateInput(2,5))
			assertTrue(HotelReservation.checkAvailability(2, 5, bookHotel));
		
		if(HotelReservation.validateInput(1,9))
			assertTrue(HotelReservation.checkAvailability(1, 9, bookHotel));
		
		if(HotelReservation.validateInput(0,15))
			assertFalse(HotelReservation.checkAvailability(0, 15, bookHotel));
	}
	
	@Test
	public void testCheckAvailabilityTestFour() {
		HotelReservation.hotelSize = 3;
		int[][] bookHotel = new int[HotelReservation.hotelSize][365];
		
		if(HotelReservation.validateInput(1,3))
			assertTrue(HotelReservation.checkAvailability(1, 3, bookHotel));
		
		if(HotelReservation.validateInput(0,15))
			assertTrue(HotelReservation.checkAvailability(0, 15, bookHotel));
		
		if(HotelReservation.validateInput(1,9))
			assertTrue(HotelReservation.checkAvailability(1, 9, bookHotel));
		
		if(HotelReservation.validateInput(2,5))
			assertFalse(HotelReservation.checkAvailability(2, 5, bookHotel));
		
		if(HotelReservation.validateInput(4,9))
			assertTrue(HotelReservation.checkAvailability(4, 9, bookHotel));
	}
	
	@Test
	public void testCheckAvailabilityTestFive() {
		HotelReservation.hotelSize = 2;
		int[][] bookHotel = new int[HotelReservation.hotelSize][365];
		
		if(HotelReservation.validateInput(1,3))
			assertTrue(HotelReservation.checkAvailability(1, 3, bookHotel));
		
		if(HotelReservation.validateInput(0,4))
			assertTrue(HotelReservation.checkAvailability(0, 4, bookHotel));
		
		if(HotelReservation.validateInput(2,3))
			assertFalse(HotelReservation.checkAvailability(2, 3, bookHotel));
		
		if(HotelReservation.validateInput(5,5))
			assertTrue(HotelReservation.checkAvailability(5, 5, bookHotel));
		
		if(HotelReservation.validateInput(4,10))
			assertFalse(HotelReservation.checkAvailability(4, 10, bookHotel));
		
		if(HotelReservation.validateInput(10,10))
			assertTrue(HotelReservation.checkAvailability(10, 10, bookHotel));
		
		if(HotelReservation.validateInput(6,7))
			assertTrue(HotelReservation.checkAvailability(6, 7, bookHotel));
		
		if(HotelReservation.validateInput(8,10))
			assertTrue(HotelReservation.checkAvailability(8, 10, bookHotel));
		
		if(HotelReservation.validateInput(8,9))
			assertTrue(HotelReservation.checkAvailability(8, 9, bookHotel));
	}
}


