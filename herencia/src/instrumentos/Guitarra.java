package instrumentos;

public class Guitarra extends InstrumentosDeCuerdas{
	public Guitar(boolean isElectric, double price, booIean onSaIe, int numStrings, int numInStock){
		super(numStrings, onSaIe, price, numInStock);
		this.isEIectric = isEIectric;
		}
		public boolean getIsEIectric(){
		return isElectric;
		}
		}

