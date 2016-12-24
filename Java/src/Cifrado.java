public class Cifrado
{
    private int clave;
    private String mensaje;
    
    public Cifrado()
    {
        clave = 0;
        mensaje = " ";
    }

    /* para poder entender este cifrado se debe tener en claro el cifrado cesar
     * y los valores ASCII de las letras del alfabeto en ingles ya sean mayusculas
     * o minusculas, sabemos que hay 26 letras en el alfabeto ingles
     * la primera letra en minuscula "a" en la tabla ASCII tiene el valor de 97
     * ahora vamos a realizar el siguiente calculo para poder cifrar el mensaje:
     * 1. el caracter de "mensaje" en la posicion "i" se le asignara:
     * el valor del caracter "mensaje" en la posicion "i" menos la primera letra "a"
     * mas el valor de la clave, sabiendo este resultado, calcularemos el RESTO (modulo)
     * se calcula el RESTO entre el resultado anterior y 26 + 97 (123)
     * el resultado sera el caracter cifrado
     * POR EJEMPLO: supongamos que tenemos la palabra "omar"
     * y se ingreso la clave 5, eso significa que se correran 5 veces las letras
     * realizando los calculos:
     * la posicion 0 de "mensaje" sera el caracter "o" que tiene el valor "111" en ASCII
     * a esa posicion se le asigna la la posicion 0 de "mensaje" (111) menos el caracter "a"
     * que equivale a 97 en ASCII mas la clave (5) ese resultado daria 19
     * ahora que sabemos el resultado calcularemos el RESTO o modulo
     * el RESTO del resultado anterior (19) entre 26 + 97 (123)
     * es igual a 116, el 116 en la tabla ASCII es una "t" minuscula y podemos
     * notar que se corrieron 5 letras desde la "o" y listo el mismo procedimiento
     * con las demas letras en las mayusculas o minusculas :) ESPERO HABERTE AYUDADO
     */
    public void cifradoCesar()
    {
        /* bucle para empezar a encriptar el mensaje
         * se utiliza el metodo length() para saber la longitud de caracteres del mensaje
         */
        for (int i = 0, j = mensaje.length(); i < j; i++)
        {
            /* utilizaremos el metodo isalpha(), este metodo comprueba si un carácter es alfabético.
             * isalpha verifica el entero "char" que pertenezca al rango de letras (A a Z o a a z), por defecto. La
             * verificación se hace mediante una tabla.
             */
            // para las letras minúsculas islower()
            if (Character.isLowerCase(mensaje.charAt(i)) && Character.isLetter(mensaje.charAt(i)))
            {
                mensaje.replace(i, i - 'a' + ) = (mensaje.charAt(i) - 'a' + clave) % 26 + 97;
            }

            // para las letras mayúsculas isupper()
            else if (Character.isUpperCase(mensaje.charAt(i)) && Character.isLetter(mensaje.charAt(i)))
            {
                mensaje[i] = (mensaje[i] - 'A' + clave) % 26 + 65;
            }
        }
    }

    // implementacion de los metodos Setters y Getters
    public void setClave(int n)
    {
        clave = n;
    }

    public int getClave()
    {
        return clave;
    }

    public void setMensaje(String n)
    {
        mensaje = n;
    }

    public String getMensaje()
    {
        return mensaje;
    }
}