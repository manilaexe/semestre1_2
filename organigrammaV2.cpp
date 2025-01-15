//MIA VERSIONE

#include <iostream>
#include <vector>
#include <memory>

using namespace std;

class Persona{
	
	private: 
		string nome, cognome, ruolo;
		int mat;
	public :
		Persona(string nome, string cognome, int mat, string ruolo):nome(nome),cognome(cognome),mat(mat),ruolo(ruolo){}
		
		string getNome(){
			return nome;
		}
		
		string getCognome(){
			return cognome;
		}
		
		int getMat(){
			return mat;
		}

		string getRuolo(){
			return ruolo;
		}
};

class Nodo{

	private:
		int data;
		vector<Nodo*> children;
		Persona p;
	public:
		Nodo(Persona p):p(p){}

		vector<Nodo*> getChildren(){
			return children;
		} 

		void insert(Nodo *n){
			children.push_back(n);
		}

		void printTree(int level=0){
			for(int i=0; i<level;i++){
				cout<<"    ";
			}
			cout<<"~"<<p.getNome()<<" "<<p.getCognome()<<" "<<p.getRuolo()<<endl;

			for(Nodo *child:children){
				if(child){
					child->printTree(level+1);
				}
			}
		}

		//find persona;

int main(){

	Persona p("Mao","Zedong",0,"dirigente");
	Persona p1("Benito","Mussolini",1,"direttore");
	Persona p2("Adolf","Hitler",2,"responsabile");
	Persona p3("Kim","Jong-un",3,"junior");
	Persona p4("Vladimir","Putin",4,"direttore");
	Persona p5("Iosif","Stalin",5,"senior");
	Persona p6("Francisco","Franco",6,"senior");
	
	

	Nodo root(p);
	Nodo c1(p1);
	Nodo c2(p2);
	Nodo c3(p3);
	Nodo c4(p4);
	Nodo c5(p5);
	Nodo c6(p6);

	root.insert(&c1);
	root.insert(&c4);
	c1.insert(&c2);
	c1.insert(&c6);
	c4.insert(&c3);
	c4.insert(&c5);

	root.printTree();


	return 0;
}
