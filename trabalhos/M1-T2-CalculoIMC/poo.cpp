#include <iostream>

using namespace std;

class Paciente {
private:
    float peso, altura, imc;

public:
    void definirDados(float p, float a) {
        peso = p;
        altura = a / 100; // converte CM para Metros
    }

    void calcularIMC() {
        imc = peso / (altura * altura);
    }

    void exibirClassificacao() {
        cout << "\n> Seu IMC: " << imc << " | Classificacao: ";

        if(imc < 18.5) cout << "Abaixo do peso";
        else if(imc >= 18.5 && imc <= 24.9) cout << "Peso normal";
        else if(imc >= 25.0 && imc <= 29.9) cout << "Sobrepreso";
        else if(imc >= 30.0 && imc <= 34.9) cout << "Obesidade Grau I";
        else if(imc >= 35.0 && imc <= 39.9) cout << "Obesidade Grau II";
        else if(imc >= 40.0) cout << "Obesidade Grau III";
        else cout << "Erro" << endl;
    }
};



int main(){
    cout << "\n--- Hospital - Calculo do IMC ---\n\n";

    float peso, altura;
    cout << "> Insira a altura do paciente (cm): ";
    cin >> altura;
    cout << "> Insira o peso do paciente (kg): ";
    cin >> peso;

    Paciente paciente;
    paciente.definirDados(peso, altura);
    paciente.calcularIMC();
    paciente.exibirClassificacao();

    return 0;
}