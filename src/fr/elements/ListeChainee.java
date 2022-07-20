package fr.elements;

public class ListeChainee<U> {
	
	//attributs
	private Element<U> _currentElement;
	private int _length;
	private StringBuilder _sb;
	
	public ListeChainee(){
		this.setLength(0);
		this.setSB(new StringBuilder());
	}
	
	//Getter Setter
	public Element<U> getCurrentElement() {
		return _currentElement;
	}
	public void setCurrentElement(Element<U> _targetElement) {
		this._currentElement = _targetElement;
	}
	public int getLength() {
		return this._length;
	}
	public void setLength(int l) {
		this._length = l;
	}
	public StringBuilder getSB() {
		return this._sb;
	}
	public void setSB(StringBuilder sb) {
		this._sb = sb;
	}
	
	//Methode add
	public void add(U val) {
		//Si la liste est vide on crée un nouvel élément et on l'affecte à l'attribut _currentElement
		if (this.getLength() == 0) {
			this.setCurrentElement(new Element<U>(val));
		}
		//Sinon
		else {
			//On crée un nouvel élément 
			Element<U> newElement = new Element<U>(val);
			//On lui affecte comme attribut element_precedent = l'élément courant
			newElement.setElem_prec(this.getCurrentElement());
			//On affecte à l'élément courant comme attribut element_suivant: newElement
			this.getCurrentElement().setElem_suiv(newElement);
			//On échange l'élément courant pour newElement
			this.setCurrentElement(newElement);
			
		}
		//On incrémente la taille du tableau
		this.setLength(this.getLength()+1);
	}
	
	
	//Affichage
	public void print() {
		
		//Si la liste est nulle
		if (this.getLength() == 0){System.out.println("empty list");}
		//Sinon
		else {
			//Element courant (dernier element de la liste)
			Element target = this.getCurrentElement();
			//On vide l'attribut StringBuilder
			this.getSB().delete(0, this.getSB().length());
			//On commance par l'affichage de fin
			this.getSB().insert(0,")");
			//On boucle tant que l'élément curant possède un élément précédent
			while(target.getElem_prec() != null){
				//On ajoute la valeur au début de l'affichage
				this.getSB().insert(0,","+target.getValue());
				target = target.getElem_prec();
			}
			//On ajoute la valeur du premier élément
			this.getSB().insert(0,"("+target.getValue());
			System.out.println(this.getSB());		
		}
	}
	
	
	//Remove
	public void remove(int index) throws Exception {
		//Si l'index n'est pas compris entre 0 et len-1 --> Exception
		try {
			if (index>this.getLength()-1|| index <0) {
				throw new Exception("Error index not available! Index doit être compris entre: 0 et "+(this._length-1));
			}
			//On récupère le nombre de pas(itérations) pour atteindre l'élément cible
			int steps = this.getLength()-index-1;
			Element<U> target = this.getCurrentElement();
			//On boucle steps - 1 fois pour atteindre l'élément cible
			for (int i =0; i<steps; i++) {
				target = target.getElem_prec();
			}

			//Si index ==0
			if (index == 0) {
				//On détache element0 de l'élément 1 (ref_precedent de Element1 = null)
				target.getElem_suiv().setElem_prec(null);
			}
			//Si index == length
			else if (index == this.getLength()-1) {
				//On détache le dernier element (ref_suivant de Element n-1 = null)
				//On définit l'élément n-1 comme l'élément courant
				target.getElem_prec().setElem_suiv(null);
				this.setCurrentElement(target.getElem_prec());
			}
			//Sinon
			else{
				//On connecte les éléments i-1 et i+1 ensemble pour courcircuiter i
				target.getElem_suiv().setElem_prec(target.getElem_prec());
				target.getElem_prec().setElem_suiv(target.getElem_suiv());
			}
			//On met à jour la taille du tableau
			this.setLength(this.getLength()-1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	//Get(index)
	public U get(int index) throws Exception {
		
		try {
			//Si l'index n'est pas compris entre 0 et len-1 --> Exception
			if (index>this.getLength()-1|| index <0) {
				throw new Exception("Error index not available! Index doit être compris entre: 0 et "+(this._length-1));
			}
			//On récupère le nombre de pas(itérations) pour atteindre l'élément cible
			int steps = this.getLength()-index-1;
			Element<U> target = this.getCurrentElement();
			//On itère jusqu'à l'élément cible
			for (int i =0; i<steps; i++) {
				target = target.getElem_prec();
			}
			//On renvoie la valeur
			return target.getValue();
			
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}


}