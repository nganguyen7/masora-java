package tiki.vn.tnsl.aura.scheduler.algorithm.model.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnplanedBox {

	@JsonProperty("box_code")
	private String boxCode;

	@JsonProperty("error_code")
	private int errorCode;

	public void setBoxCode(String boxCode){
		this.boxCode = boxCode;
	}

	public String getBoxCode(){
		return boxCode;
	}

	public void setErrorCode(int errorCode){
		this.errorCode = errorCode;
	}

	public int getErrorCode(){
		return errorCode;
	}

	@Override
 	public String toString(){
		return 
			"UnplanedBoxesItem{" + 
			"box_code = '" + boxCode + '\'' + 
			",error_code = '" + errorCode + '\'' + 
			"}";
		}
}