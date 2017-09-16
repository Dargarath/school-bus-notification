/**
 * 
 */
package com.dargarath.school_bus_notification.model;

/**
 * @author Ozan ZIPLAR 16 Eyl 2017
 *
 */
public final class SchoolBus {

	private String PlateNumber;

	private Driver Driver;

	/**
	 * 
	 */
	public SchoolBus() {

	}

	public String getPlateNumber() {
		return PlateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		PlateNumber = plateNumber;
	}

	public Driver getDriver() {
		return Driver;
	}

	public void setDriver(Driver driver) {
		Driver = driver;
	}

	@Override
	public String toString() {
		return "SchoolBus [PlateNumber=" + PlateNumber + ", Driver=" + Driver + "]";
	}
}
