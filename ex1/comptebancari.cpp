#include <iostream>
#include <string>

class CompteBancari {
private:
    std::string titular;
    double saldo;

public:
    // Constructor
    CompteBancari(const std::string& nomTitular, double saldoInicial) 
        : titular(nomTitular), saldo(saldoInicial) {}

    // Mètode per ingressar diners
    void ingressar(double quantitat) {
        if (quantitat > 0) {
            saldo += quantitat;
            std::cout << "Has ingressat " << quantitat << "€. Nou saldo: " << saldo << "€.\n";
        } else {
            std::cout << "La quantitat a ingressar ha de ser positiva.\n";
        }
    }

    // Mètode per retirar diners
    void retirar(double quantitat) {
        if (quantitat > 0 && quantitat <= saldo) {
            saldo -= quantitat;
            std::cout << "Has retirat " << quantitat << "€. Nou saldo: " << saldo << "€.\n";
        } else if (quantitat > saldo) {
            std::cout << "Saldo insuficient per retirar " << quantitat << "€.\n";
        } else {
            std::cout << "La quantitat a retirar ha de ser positiva.\n";
        }
    }

    // Mètode per mostrar el saldo
    void mostrarSaldo() const {
        std::cout << "2a convocatòria\n Compte bancari: " << titular << " Saldo: " << saldo << "€.\n";
    }
};

int main() {
    // Crear un compte bancari
    CompteBancari compte("Joan Garcia", 700.0);

    // Operacions amb el compte
    compte.mostrarSaldo();
    compte.ingressar(100.0);
    compte.retirar(150.0);
    compte.retirar(1100.0); // Intentar retirar més del saldo disponible
    compte.mostrarSaldo();

    return 0;
}