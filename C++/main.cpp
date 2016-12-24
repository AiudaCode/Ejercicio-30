#include <iostream>
#include "Cifrado.h"

using namespace std;

int main(void)
{
    // se crea un objeto de la clase Cifrado (Instanciaciación)
    Cifrado *obj = new Cifrado();
    // se define la variable "cla" de tipo entero y "msg" de tipo string
    int cla;
    string msg;
    cout << "=============== CIFRADO CESAR ===============" << endl;
    // pedimos el mensaje para guardarlo en la variable "msg"
    cout << "Digite mensaje: \t";
    getline(cin, msg); //el metodo getline permite leer cadenas con espacios
    obj->setMensaje(msg);

    // pedimos la clave para guardarla en la variable "cla"
    cout << "Digite clave: ";
    cin >> cla;
    obj->setClave(cla);

    obj->cifradoCesar(); // se llama al metodo para cifrar el mensaje
    cout << "Mensaje cifrado: \t" << obj->getMensaje() << endl;
}
