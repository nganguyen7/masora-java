package tiki.vn.tnsl.aura.scheduler.algorithm.model.input.masora;

public class VehicleCapacity{

	private double maxWeight;

	private double maxVolume;

	public void setMaxWeight(double maxWeight){
		this.maxWeight = maxWeight;
	}

	public double getMaxWeight(){
		return maxWeight;
	}

	public void setMaxVolume(double maxVolume){
		this.maxVolume = maxVolume;
	}

	public double getMaxVolume(){
		return maxVolume;
	}

	@Override
 	public String toString(){
		return 
			"VehicleCapacity{" + 
			"max_weight = '" + maxWeight + '\'' + 
			",max_volume = '" + maxVolume + '\'' + 
			"}";
		}
}