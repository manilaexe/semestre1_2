#include<iostream>
#include<memory>
#include<vector>

using namespace std;

/*
classe Persona
classe NodoOrganigramma
enum ruolo

*/
enum RUOLO {dirigente, direttore, responsabile, senior, junior};

class Persona{
	private:
		string nome; 
		string cognome; 
		int mat;
	public:
		Persona(string nome, string cognome, int mat): //costruttroe
			nome(nome), cognome(cognome), mat(mat){};
		string getNome(){
			return nome;
		}
		string getCognome(){
			return cognome;
		}
		int getMat(){
			return mat;
		}
};

class NodoOrganigramma{
	private:
		shared_ptr<Persona> persona; //puntatore ad un oggetto di classe persona
		RUOLO ruolo; //identifica il ruolo della persona
		vector<shared_ptr<NodoOrganigramma>> children; //lista di puntatore ad oggetti NodoOrganigramma che rappresentano i figli del nono corrente
	public: 
		NodoOrganigramma(RUOLO ruolo, shared_ptr<Persona> persona): //costruttore
			ruolo(ruolo), persona(persona){};
		shared_ptr<Persona> getPersona(){
			return persona;
		}
		RUOLO getRuolo(){
			return ruolo;
		}
		void addNodo(shared_ptr<NodoOrganigramma> nodo){ //aggiunge figli
			children.push_back(nodo); //Inserisce il nodo passato come argomento nella lista dei figli.
		}
		void printTree(int livello){
			string tab;
			for(int i=0; i<livello; i++){
				tab+="    ";
			}
			cout<<tab<<" + "<<getPersona()->getNome()<<" "<<getPersona()->getCognome()<<endl;
			for(shared_ptr<NodoOrganigramma> nodo:children){ //itera sui figli del nodo corrente
				nodo->printTree(livello+1);//Richiama il metodo printOrganigramma per ogni figlio, incrementando il livello.
			}
		}
		shared_ptr<Persona> getPersonaByMat(int m){
			if(persona->getMat()==m){
				return persona;
			}else{
				for(shared_ptr<NodoOrganigramma> nodo:children){
					shared_ptr<Persona> finded=nodo->getPersonaByMat(m);
					if(finded!=nullptr){
						return finded;
					}
				}
			}
			return nullptr;
		}
};


int main(){

	shared_ptr<Persona> p1 = make_shared<Persona>("Simone", "Giuliani", 1000);
	shared_ptr<Persona> p2 = make_shared<Persona>("Carlo", "Contino", 2000);
	shared_ptr<Persona> p3 = make_shared<Persona>("Alessandro", "Lazzarini", 3000);
	shared_ptr<Persona> p4 = make_shared<Persona>("Alice", "Ramenghi", 4000);
	shared_ptr<Persona> p5 = make_shared<Persona>("Federico", "Margutti", 5000);

	shared_ptr<NodoOrganigramma> root = make_shared<NodoOrganigramma>(direttore, p1);
	shared_ptr<NodoOrganigramma> n2 = make_shared<NodoOrganigramma>(dirigente, p2);
	shared_ptr<NodoOrganigramma> n3 = make_shared<NodoOrganigramma>(dirigente, p3);
	shared_ptr<NodoOrganigramma> n4 = make_shared<NodoOrganigramma>(responsabile, p4);
	shared_ptr<NodoOrganigramma> n5 = make_shared<NodoOrganigramma>(responsabile, p5);

	root->addNodo(n2);
	root->addNodo(n3);
	n2->addNodo(n4);
	n2->addNodo(n5);

	root->printTree(0);

	shared_ptr<Persona> find = n3->getPersonaByMat(5000);
	if(find == nullptr) {
		cout << "Persona non in organigramma" << std::endl;
	} else {
		cout << find->getCognome() << std::endl;
	}

	return 0;
}