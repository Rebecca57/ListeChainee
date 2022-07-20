package fr.elements;

public class Element<U> {
	private U _valeur;
	private Element<U> elem_prec;
	private Element<U> elem_suiv;
	
	
	//Constructeur
	public Element(U value) {
		this._valeur = value;
	}

	//Getter Setter
	public Element getElem_prec() {
		return elem_prec;
	}

	public void setElem_prec(Element elem_prec) {
		this.elem_prec = elem_prec;
	}

	public Element getElem_suiv() {
		return elem_suiv;
	}

	public void setElem_suiv(Element elem_suiv) {
		this.elem_suiv = elem_suiv;
	}
	
	public void setValue(U val) {
		this._valeur = val;
	}
	public U getValue() {
		return this._valeur;
	}
	
	

}
