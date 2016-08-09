package com.Day6;

public class ClassCar {

		
		
	
		private int windows = 8;
		 private int doors = 5;
		 boolean runs = true;
		 private String make = "honda";
		 private String model = "CRV";
		 private String color = "red";
		 private boolean currentlyRunning = false;
		
		 public ClassCar(int windows, int doors, boolean runs, String make, String model, String color,
					boolean currentlyRunning) {
				super();
				this.windows = windows;
				this.doors = doors;
				this.runs = runs;
				this.make = make;
				this.model = model;
				this.color = color;
				this.currentlyRunning = currentlyRunning;
		
				

	}
 //below is a constructor the same name as a class
		public ClassCar() {
			super();
		
			
			
			
		}
		public int getWindows() {
			return windows;
		}
		public void setWindows(int windows) {
			this.windows = windows;
		}
		public int getDoors() {
			return doors;
		}
		public void setDoors(int doors) {
			this.doors = doors;
		}
		public boolean isRuns() {
			return runs;
		}
		public void setRuns(boolean runs) {
			this.runs = runs;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isCurrentlyRunning() {
			return currentlyRunning;
		}
		public void setCurrentlyRunning(boolean currentlyRunning) {
			this.currentlyRunning = currentlyRunning;
		}}




