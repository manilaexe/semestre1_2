//funziona in modo anomalo nel caso si reinserisse la partita IVA o il codice fiscale

#include<iostream>
#include<vector>
#include<string>
using namespace std;


class Contatto{
	public:
		virtual void stampaContatto()=0;
		virtual string getTipo()=0;
		virtual string getNome()=0;
};

class Persona : public Contatto{
	private:
		string nome, cognome, numero, cf;
	public:
		Persona(string nome, string cognome, string numero, string cf):nome(nome),cognome(cognome),numero(numero),cf(cf){}
		
	string getNome(){
		return nome;
	}
	
	string getCognome(){
		return cognome;
	}

	string getNumero(){
		return numero;
	}

	string getCf(){
		return cf;
	}

	void stampaContatto(){
		cout<<"Nome: "<<getNome()<<" Cognome: "<<getCognome()<<" Numero: "<<getNumero()<<" Codice fiscale: "<<cf<<endl;
	}

	string getTipo(){
		return "Persona";
	}
};

class Azienda : public Contatto{
	private:
		string nome, piva, numero;
	public: 
		Azienda(string nome, string piva, string numero):nome(nome),piva(piva),numero(numero){}
		string getNome(){
			return nome;
		}

		string getIva(){
			return piva;
		}

		string getNumero(){
			return numero;
		}

		void stampaContatto(){
			cout<<"Nome: "<<getNome()<<" Partita Iva: "<<getIva()<<" Numero: "<<getNumero()<<endl;
		}

		string getTipo(){
			return "Azienda";
		}
};


class Rubrica{
	private:
		vector<Contatto*> r;
	public: 
		void addContatto(Contatto* c){
			r.push_back(c);
		}

		   void removeContatto(int index) {
			if (index >= 0 && index < r.size()) {
				delete r[index]; // Libera la memoria
				r.erase(r.begin() + index);
				cout << "Contatto rimosso." << endl;
			} else {
				cout << "Indice non valido." << endl;
			}
		}

		void stampaRub(){
			for(int i=0; i<r.size();i++){
				cout<<i<<". ";
				r[i]->stampaContatto();
			}
		}

};

string myUpper(string a){

	for(int i=0; i<a.length();i++){
		a[i]=toupper(a[i]);
	}

	return a;
}


int main(){

	string nome, cognome, numero, iva, cf;
	int ris, rem;
	Rubrica rub;

	cout<<"-0 per uscire"<<endl;
	cout<<"-1 per inserire una persona "<<endl;
	cout<<"-2 per inserire un'azienda "<<endl;
	cout<<"-3 per visualizzare la rubrica "<<endl;
	cout<<"-4 per eliminare un contatto "<<endl;
	
	cin>>ris;

	while(ris!=0){

		switch(ris){
			case 1:
				cout<<"Nome: ";
				cin>>nome;
				nome=myUpper(nome);
				cout<<"Cognome: ";
				cin>>cognome;
				cognome=myUpper(cognome);
				cout<<"Numero: ";
				cin>>numero;
				cout<<"Codice Fiscale: ";
				cin>>cf;
				cf=myUpper(cf);
				if(cf.size()!=16){
					cout<<"Errore nel codice fiscale..."<<endl<<"Inserirlo nuovamente: ";
					cin>>cf;
					cf=myUpper(cf);
				}
				
				rub.addContatto(new Persona(nome,cognome,numero,cf));
				break;
			case 2:
				cout<<"Nome: ";
				cin>>nome;
				nome=myUpper(nome);
				cout<<"Partita iva: ";
				cin>>iva;
				nome=myUpper(iva);
				if(iva.size()!=12){
					cout<<"Errore nella partita IVA..."<<endl<<"Inserirla nuovamente: ";
					cin>>iva;	
					nome=myUpper(iva);				
				}
				cout<<"Numero: ";
				cin>>numero;
				rub.addContatto(new Azienda(nome,iva,numero));	
				break;
			case 3:		
				rub.stampaRub();
				break;
			case 4:
				cout<<"Inserire l'indice di un contatto da eliminare: ";
				cin>>rem;
				rub.removeContatto(rem);


		}

		cout<<"-0 per uscire"<<endl;
		cout<<"-1 per inserire una persona "<<endl;
		cout<<"-2 per inserire un'azienda "<<endl;
		cout<<"-3 per visualizzare la rubrica "<<endl;
		cout<<"-4 per eliminare un contatto "<<endl;		
		cin>>ris;
	}
	
	return 0;
}
