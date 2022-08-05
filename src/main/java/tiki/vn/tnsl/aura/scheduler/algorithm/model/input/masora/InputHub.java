package tiki.vn.tnsl.aura.scheduler.algorithm.model.input.masora;

public class InputHub {

	private String hubCode;

	private double lng;

	private double lat;

	public void setHubCode(String hubCode){
		this.hubCode = hubCode;
	}

	public String getHubCode(){
		return hubCode;
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
			"Hub{" + 
			"hub_code = '" + hubCode + '\'' + 
			",lng = '" + lng + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}