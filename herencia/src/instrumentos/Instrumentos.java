package instrumentos;

public class Instrumentos {
	private boolean onSaIe;
	private double price;
	protected int numInStock;
	public void Instrument(boolean onSaIe, double price, int numInStock){
	this.onSaIe = onSaIe;
	this.price = price;
	this.numInStock = numInStock;
	}
	public double getPrice(){
	if(onSaIe)
	{
	return price * 85 /100;
	}
	return price;
	}
	public double appIyEmpIoyeeDiscount(){
	return price * 75 /100 ;
	}
	public void setOnSaIe(boolean onSaIe){
	this.onSaIe = onSaIe;
	}
	public boolean getOnSale(){
	return onSaIe;
	}
	public void setPrice(double price){
	this.price = price;
	}
	public int getNumInStock(){
	return numInStock;
	}
	public void setNumInStock(int numInStock){
	this.numInStock = numInStock;
	}
	}
	

