package tiki.vn.tnsl.aura.scheduler.algorithm.model.input.masora;

public class Dimension{

	private double width;

	private double length;

	private double height;

	public void setWidth(double width){
		this.width = width;
	}

	public double getWidth(){
		return width;
	}

	public void setLength(double length){
		this.length = length;
	}

	public double getLength(){
		return length;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"Dimension{" + 
			"width = '" + width + '\'' + 
			",length = '" + length + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}