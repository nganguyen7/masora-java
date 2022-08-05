package tiki.vn.tnsl.aura.scheduler.algorithm.model.output;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Driver {

	@JsonProperty("dispatches")
	private List<Dispatch> dispatches;

	@JsonProperty("driver_code")
	private String driverCode;

	public void setDispatches(List<Dispatch> dispatches){
		this.dispatches = dispatches;
	}

	public List<Dispatch> getDispatches(){
		return dispatches;
	}

	public void setDriverCode(String driverCode){
		this.driverCode = driverCode;
	}

	public String getDriverCode(){
		return driverCode;
	}

	@Override
 	public String toString(){
		return 
			"DriversItem{" + 
			"dispatches = '" + dispatches + '\'' + 
			",driver_code = '" + driverCode + '\'' + 
			"}";
		}
}