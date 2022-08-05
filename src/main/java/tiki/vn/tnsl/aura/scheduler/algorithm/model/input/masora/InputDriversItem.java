package tiki.vn.tnsl.aura.scheduler.algorithm.model.input.masora;

import java.util.List;

public class InputDriversItem {

	private List<Double> vectors;

	private String driverCode;

	private VehicleCapacity vehicleCapacity;

	private double availableWorkingHour;

	public void setVectors(List<Double> vectors){
		this.vectors = vectors;
	}

	public List<Double> getVectors(){
		return vectors;
	}

	public void setDriverCode(String driverCode){
		this.driverCode = driverCode;
	}

	public String getDriverCode(){
		return driverCode;
	}

	public void setVehicleCapacity(VehicleCapacity vehicleCapacity){
		this.vehicleCapacity = vehicleCapacity;
	}

	public VehicleCapacity getVehicleCapacity(){
		return vehicleCapacity;
	}

	public void setAvailableWorkingHour(double availableWorkingHour){
		this.availableWorkingHour = availableWorkingHour;
	}

	public double getAvailableWorkingHour(){
		return availableWorkingHour;
	}

	@Override
 	public String toString(){
		return 
			"DriversItem{" + 
			"vectors = '" + vectors + '\'' + 
			",driver_code = '" + driverCode + '\'' + 
			",vehicle_capacity = '" + vehicleCapacity + '\'' + 
			",available_working_hour = '" + availableWorkingHour + '\'' + 
			"}";
		}
}