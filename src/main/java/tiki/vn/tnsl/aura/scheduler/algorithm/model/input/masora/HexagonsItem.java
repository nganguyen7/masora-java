package tiki.vn.tnsl.aura.scheduler.algorithm.model.input.masora;

import java.util.List;
public class HexagonsItem{

	private String hexId;

	private List<Double> vectors;

	private double lng;

	private double lat;

	public void setHexId(String hexId){
		this.hexId = hexId;
	}

	public String getHexId(){
		return hexId;
	}

	public void setVectors(List<Double> vectors){
		this.vectors = vectors;
	}

	public List<Double> getVectors(){
		return vectors;
	}

	public void setLng(double lng){
		this.lng = lng;
	}

	public double getLng(){
		return lng;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"HexagonsItem{" + 
			"hex_id = '" + hexId + '\'' + 
			",vectors = '" + vectors + '\'' + 
			",lng = '" + lng + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}