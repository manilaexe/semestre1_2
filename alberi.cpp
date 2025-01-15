//crea SOLO alberi binari

#include <iostream>

using namespace std;

class Nodo{
	private: 
		int data;
		Nodo *left;
		Nodo *right;
	public: 
		Nodo(int d):data(d),left(nullptr),right(nullptr){} //costruttore
	
		int getData(){
			return data;
		}

		void inLeft(int d){
			left=new Nodo(d);
		}

		void inRight(int d){
			right=new Nodo(d);
		}

		Nodo *find(int d){ //devo trovare d nell'albero
			if(data==d){ //se data e` nel nodo corrente lo restituisce
				return this;
			}
			if(left){//se il nodo corrente ha un figlio va a guardare il nodo sinistro (left!=nullptr)
				Nodo *l=left->find(d); //cerca il valore d
				if(l){
					return l;
				}
			}
			if(right){ //se il nodo corrente ha un figlio va a guardare il nodo destro (left!=nullptr)
				Nodo *r=right->find(d); //cerca il valore d
				if(r){//se trovo d nel sottoalbero dx restituisco immediatamente quel nodo
					return r;
				}
			}
			return nullptr;//se non trovo d in nessun nodo restituisco nullptr
		}

		void print(){
			cout<<getData()<<" ";
			if(left){
				left->print();
			}
			if(right){
				right->print();
			}
		}
};
int main(){

  
    Nodo root(10);
    root.inLeft(5); 
    root.inRight(15);

    cout << "Ecco il tuo meraviglioso albero:" <<endl;
    root.print();
    cout << endl;

    Nodo* trovato = root.find(5);
    if (trovato) {
        cout << "Nodo trovato: " << trovato->getData() << endl;
    } else {
        cout << "Nodo non trovato" << endl;
    }
	return 0;
}
