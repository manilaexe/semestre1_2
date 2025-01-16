#include<iostream>
#include<vector>
#include<memory>
using namespace std;

enum RUOLO {dirigente, vicepreside, professore, bidello, studente};
class Persona{
	private:
		string nome, cognome, id;
		RUOLO r;
	public:
		Persona(string nome, string cognome, string id, RUOLO r):nome(nome),cognome(cognome),id(id),r(r){}

		string getNome(){
			return nome;
		}

		string getCognome(){
			return cognome;
		}

		string getId(){
			return id;
		}

		RUOLO getRuolo(){
			return r;
		}
};

class Node{
	private:
		vector<Node*> children;
		Persona p;
	public: 
		Node(Persona p):p(p){}
		Persona getData(){
			return p;
		}

		vector<Node*> getChildren(){
			return children;
		}

		void insert(Node* n){
			children.push_back(n);
		}

		int printTree(int l=0){
			for(int i=0; i<l;i++){
				cout<<"    ";
			}
			cout<<p.getNome()<<" "<<p.getCognome()<<" "<<p.getRuolo()<<" "<<endl;
			for(Node* child:children){
				if(child){
					child->printTree(l+1);
				}
			}		
		}
};

int main(){

	Persona p1("Paolo","Botti","001",vicepreside);
	Persona p2("Salvatore","Grillo","002",dirigente);
	Persona p3("Roberto","Baffetti","003",vicepreside);
	Persona p4("Carmelina","Digiu","004",bidello);
	Persona p5("Patrizia","Martemucci","004",professore);
	Persona p6("Mario","Rossi","005",studente);
	Persona p7("Claudia","Bianchi","006",studente);
	

	Node root(p2);
	Node c2(p1);
	Node c3(p3);
	Node c4(p4);
	Node c5(p5);
	Node c6(p6);
	Node c7(p7);

	root.insert(&c2);
	root.insert(&c3);
	c3.insert(&c4);
	c3.insert(&c5);
	c5.insert(&c6);
	c5.insert(&c7);

	root.printTree();

	return 0;
}
