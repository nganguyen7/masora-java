package tiki.vn.tnsl.aura.scheduler.algorithm.model.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Box {

	@JsonProperty("box_code")
	private String boxCode;

	@JsonProperty("hexagon_id")
	private String hexagonId;

	public void setBoxCode(String boxCode){
		this.boxCode = boxCode;
	}

	public String getBoxCode(){
		return boxCode;
	}

	public void setHexagonId(String hexagonId){
		this.hexagonId = hexagonId;
	}

	public String getHexagonId(){
		return hexagonId;
	}

	@Override
 	public String toString(){
		return 
			"BoxesItem{" + 
			"box_code = '" + boxCode + '\'' + 
			",hexagon_id = '" + hexagonId + '\'' + 
			"}";
		}
}