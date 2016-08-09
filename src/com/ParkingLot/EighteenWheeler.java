package com.ParkingLot;

//"extends" parent class to a child class
public class EighteenWheeler extends Vehicle {


	 private boolean trailer = true;
	private String horn = "Honk honk";
	
	



	






	public void withoutATrailer () {
		if (!(trailer)) {
			wheels = 10;
		}
		
	}

		public EighteenWheeler(boolean running, String color, String condition, boolean fueledUp, int numberOfSeats,
				int wheels, boolean trailer, String horn) {
			super(running, color, condition, fueledUp, numberOfSeats, wheels);

			this.trailer = trailer;
			this.horn = horn;
		}

	}

	


