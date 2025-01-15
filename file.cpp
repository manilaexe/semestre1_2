#include <iostream>
#include <fstream>
using namespace std;

int openFile(){
	ofstream f("esempio.txt"); //crea o sovrascrive se già esistente
	if(!f){
		cerr<<"Errore nell'apertura del file"<<endl;
		return 1;
	}
	f << "ma veramente?";
	cout <<"Contenuto scritto nel file con successo" <<endl;
}

int readFile(){
	string line;
	
	ifstream input("esempio.txt");
	if(!input){
		cerr <<"Errore nell'apertura del file"<<endl;
		return 1;
	}
	
	while(getline(input,line)){
		cout<<line<<endl;
	}
}

int main(){

	openFile();
	cout << "Contenuto del file: "<<endl;
	readFile();

	return 0;
}
