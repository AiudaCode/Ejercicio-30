#ifndef CIFRADO_H
#define CIFRADO_H
#include <iostream>

using namespace std;

class Cifrado
{
    public:
        Cifrado();
        virtual ~Cifrado();
        // se definen el metodo publico cifradoCesar() de tipo void
        void cifradoCesar();

        // se definen los metodos Setters y Getters de los atributos de la clase
        void setClave(int n);
        int getClave();
        void setMensaje(string n);
        string getMensaje();
    protected:

    private:
        // se definen los atributos privados de la clase
        int clave;
        string mensaje;
};

#endif // CIFRADO_H
