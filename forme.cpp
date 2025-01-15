#include<iostream>
#include<fstream>
#include<memory>
#include<sstream>
#include<vector>
#include<memory>
#include<cmath>

using namespace std;

class Shape{

    virtual double calcolaArea()=0;
    virtual double calcolaPerimetro()=0;
};

class Rettangolo : public Shape{
    private:
        double l1, l2;
    public:
        Rettangolo(double l1, double l2):l1(l1),l2(l2){}
        double calcolaArea(){
            double a;
            a=l1*l2;
            return a;
        }
        double calcolaPerimetro(){
            double p;
            p=(l1*2)+(l2*2);
            return p;
        }
};

class Cerchio : public Shape{
    private: 
        double r;
    public: 
        Cerchio(double r):r(r){}
        double calcolaArea(){
            double a;
            a=r*r*M_PI;
            return a;
        }
        double calcolaPerimetro(){
            double p;
            p=r*2*M_PI;
            return p;
        }
};

class Triangolo : public Shape{
    private:
        double l1, l2, l3;
    public:
        Triangolo(double l1, double l2, double l3):l1(l1),l2(l2),l3(l3){}
        double calcolaPerimetro(){
            double p;
            p=l1+l2+l3;
            return p;
        }
        double calcolaArea(){
            double a;
            double sp; //semiperimetro
            sp=calcolaPerimetro();
            sp=sp/2;
            a=sqrt((sp*(sp-l1))*(sp*(sp-l2))*(sp*(sp-l3)));
            return a;            
        }

};

int readFile(string nome){
    string line, forma, op;
    double p1=0,p2=0,p3=0;

    ifstream in(nome);
    if(!in){
        cerr <<"Errore nell'apertura del file"<<endl;
		return -1;
    }

    while(getline(in,line)){
        stringstream ss(line);//flusso di stringa per elabora i csv
        getline(ss,forma,',');

        if(forma=="R"){
            ss>>p1;//legge i numeri
            ss.ignore();//ignora la virgola
            ss>>p2;
            ss.ignore();
            getline(ss,op,',');
            Rettangolo r(p1,p2);
            cout<<"+ Rettangolo ~Area: "<<r.calcolaArea()<<" ~Perimetro: "<<r.calcolaPerimetro()<<endl;
        }else if(forma=="C"){
            ss>>p1;
            ss.ignore();
            getline(ss,op,',');
            Cerchio c(p1);
            cout<<"+ Cerchio ~Area: "<<c.calcolaArea()<<" ~Perimetro: "<<c.calcolaPerimetro()<<endl;
        }else if(forma=="T"){
            ss>>p1;
            ss.ignore();
            ss>>p2;
            ss.ignore();
            ss>>p3;
            ss.ignore();
            getline(ss,op,',');
            Triangolo t(p1,p2,p3);
            cout<<"+ Triangolo ~Area: "<<t.calcolaArea()<<" ~Perimetro: "<<t.calcolaPerimetro()<<endl;
        }
    }
}



int main(){

    Rettangolo r1 = Rettangolo(10,20);
    Cerchio c1 = Cerchio(2);
    Triangolo t1 = Triangolo(4,7,9);

    cout<<"+ Rettangolo ~Area: "<<r1.calcolaArea()<<" ~Perimetro: "<<r1.calcolaPerimetro()<<endl;
    cout<<"+ Cerchio ~Area: "<<c1.calcolaArea()<<" ~Perimetro: "<<c1.calcolaPerimetro()<<endl;
    cout<<"+ Triangolo ~Area: "<<t1.calcolaArea()<<" ~Perimetro: "<<t1.calcolaPerimetro()<<endl;


    cout<<endl <<"++++++Aree da file++++++"<<endl;
    readFile("figura3.txt");

    return 0;
}
