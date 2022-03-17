package carte;

import java.util.Objects;

public class Carte {
      
	private int nrPagini;

	public Carte(int nrPagini) {
		super();
		this.nrPagini = nrPagini;
	}
	
	

	@Override
	public String toString() {
		return "Carte [nrPagini=" + nrPagini + "]";
	}




	//equals nu merge , merge doar varianta lor de equals si imi spune ca 
		//trebuie sa fie un supertype
	/*@Override
	public boolean equals(Carte c) {
		 if((this.nrPagini.equals(c.nrPagini)))
			 return true;
     return false;
	}
*/
	
	


	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carte other = (Carte) obj;
		return nrPagini == other.nrPagini;
	}

public int getNrPagini() {
		return nrPagini;
	} 


	public void setNrPagini(int nrPagini) {
		this.nrPagini = nrPagini;
	}
	
	
	
	
}
