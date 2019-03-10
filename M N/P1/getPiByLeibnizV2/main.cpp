#include <iostream>
using namespace std;

double getPiByLeibnizV2(double porError);//prototipo de la funcion

void main(void) {
	double porError; //porcentaje de error relativo deseado
	double pi;
	cout << "Error  relativo" << endl;
	cin >> porError;

	pi = getPiByLeibnizV2(porError);

	cout << "PI(" << porError << ")" << pi << endl;
	system("pause");
}

double getPiByLeibnizV2(double porError) {
	int i = 0;
	double valorPiActual = 0.0;
	double valorPiAnterior = 0.0;
	double errorRelativo;

	while (true) {
		valorPiAnterior = valorPiActual;
		valorPiActual = valorPiActual + 4 * (pow(-1, i) / (2 * i + 1));

		cout << "Valor de Pi Anterior " << valorPiAnterior << "Valor de Pi Actual " << valorPiActual << endl;

		i++;

		errorRelativo = abs((valorPiActual - valorPiAnterior) / valorPiActual) * 100;
		cout << "Error Relativo " << errorRelativo << endl;

		if (errorRelativo < porError) {
			break;
		}
	}
	return valorPiActual;

}