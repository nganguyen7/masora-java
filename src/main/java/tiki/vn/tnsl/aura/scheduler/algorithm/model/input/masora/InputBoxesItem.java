package tiki.vn.tnsl.aura.scheduler.algorithm.model.input.masora;

public class InputBoxesItem {

	private String hexId;

	private String boxCode;

	private double lng;

	private double weight;

	private Dimension dimension;

	private double lat;

	public void setHexId(String hexId){
		this.hexId = hexId;
	}

	public String getHexId(){
		return hexId;
	}

	public void setBoxCode(String boxCode){
		this.boxCode = boxCode;
	}

	public String getBoxCode(){
		return boxCode;
	}

	public void setLng(double lng){
		this.lng = lng;
	}

	public double getLng(){
		return lng;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}

	public double getWeight(){
		return weight;
	}

	public void setDimension(Dimension dimension){
		this.dimension = dimension;
	}

	public Dimension getDimension(){
		return dimension;
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
			"BoxesItem{" + 
			"hex_id = '" + hexId + '\'' + 
			",box_code = '" + boxCode + '\'' + 
			",lng = '" + lng + '\'' + 
			",weight = '" + weight + '\'' + 
			",dimension = '" + dimension + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}