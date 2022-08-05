package tiki.vn.tnsl.aura.scheduler.algorithm.model.output;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RoutingPlan{

	@JsonProperty("drivers")
	private List<Driver> drivers;

	@JsonProperty("unplaned_boxes")
	private List<UnplanedBox> unplanedBoxes;

	public void setDrivers(List<Driver> drivers){
		this.drivers = drivers;
	}

	public List<Driver> getDrivers(){
		return drivers;
	}

	public void setUnplanedBoxes(List<UnplanedBox> unplanedBoxes){
		this.unplanedBoxes = unplanedBoxes;
	}

	public List<UnplanedBox> getUnplanedBoxes(){
		return unplanedBoxes;
	}

	@Override
 	public String toString(){
		return 
			"RoutingPlan{" + 
			"drivers = '" + drivers + '\'' + 
			",unplaned_boxes = '" + unplanedBoxes + '\'' + 
			"}";
		}
}