#include <iostream>

using namespace std;

int main(){
    cout << "\n--- Hospital - Calculo do IMC ---\n\n";

    float peso, altura;
    cout << "> Insira a altura do paciente (cm): ";
    cin >> altura;
    altura = altura / 100; // converter CM para Metros
    cout << "> Insira o peso do paciente (kg): ";
    cin >> peso;

    float resultadoIMC = peso / (altura * altura);

    cout << "\n> Seu IMC: " << resultadoIMC << " | Classificacao: ";

    if(resultadoIMC < 18.5) cout << "Abaixo do peso";
    else if(resultadoIMC >= 18.5 && resultadoIMC <= 24.9) cout << "Peso normal";
    else if(resultadoIMC >= 25.0 && resultadoIMC <= 29.9) cout << "Sobrepreso";
    else if(resultadoIMC >= 30.0 && resultadoIMC <= 34.9) cout << "Obesidade Grau I";
    else if(resultadoIMC >= 35.0 && resultadoIMC <= 39.9) cout << "Obesidade Grau II";
    else if(resultadoIMC >= 40.0) cout << "Obesidade Grau III";
    else cout << "Erro" << endl;



    return 0;
}