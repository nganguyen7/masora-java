package tiki.vn.tnsl.aura.scheduler.algorithm.model.output;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Dispatch {

	@JsonProperty("boxes")
	private List<Box> boxes;

	@JsonProperty("index")
	private int index;

	@JsonProperty("dispatch_code")
	private String dispatchCode;

	public void setBoxes(List<Box> boxes){
		this.boxes = boxes;
	}

	public List<Box> getBoxes(){
		return boxes;
	}

	public void setIndex(int index){
		this.index = index;
	}

	public int getIndex(){
		return index;
	}

	public void setDispatchCode(String dispatchCode){
		this.dispatchCode = dispatchCode;
	}

	public String getDispatchCode(){
		return dispatchCode;
	}

	@Override
 	public String toString(){
		return 
			"DispatchesItem{" + 
			"boxes = '" + boxes + '\'' + 
			",index = '" + index + '\'' + 
			",dispatch_code = '" + dispatchCode + '\'' + 
			"}";
		}
}