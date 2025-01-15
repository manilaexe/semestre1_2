//crea anche alberi NON binari

#include <iostream>
#include <vector>
using namespace std;

class Node{

	private:
		int data;
		vector<Node*> children; //ogni nodo puo` avere 0,1,o piu` figli
	public: 
		Node(int d): data(d){}//costruttore
		
		int getData(){
			return data;
		}

		vector<Node*> getChildren(){ //restituisce il vettore di puntatori ai figli del nodo
			return children;
		}

		void insert(Node *n){ //aggiunge un figlio al nodo corrente
			children.push_back(n);
		}

		void printTree(int level=0){
			
			for(int i=0; i<level;i++){
				cout<<"    ";
			}

			cout<<"Node: "<<getData()<<endl; 

			for(Node *child:children){
				if(child){
					child->printTree(level+1);
				}
			}
		}

};

int main(){

	Node root(10);
	Node c1(43);
	Node c2(64);
	Node c3(54);
	Node c4(89);
	
	root.insert(&c1);
	root.insert(&c2);
	c1.insert(&c3);
	c2.insert(&c4);
	
	cout<<"Ecco il tuo meraviglioso albero a cazzo di cane:"<<endl;
	root.printTree();

	return 0;
}