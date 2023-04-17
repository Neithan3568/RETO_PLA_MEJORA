package Daviplata;

import java.util.Scanner;

public class bolsillo {
    private String usuario;
    private String contrasena;
    private double saldo;

    public bolsillo(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.saldo = 0;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Se han depositado " + monto + " pesos. Saldo actual: " + saldo + " pesos.");
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Se han retirado " + monto + " pesos. Saldo actual: " + saldo + " pesos.");
        } else {
            System.out.println("No se pueden retirar " + monto + " pesos. Saldo insuficiente.");
        }
    }

    public boolean loguearse(String usuario, String contrasena) {
        if (this.usuario.equals(usuario) && this.contrasena.equals(contrasena)) {
            System.out.println("Bienvenido, " + usuario + ".");
            return true;
        } else {
            System.out.println("Usuario y/o contraseña incorrectos.");
            return false;
        }
    }

    public double consultarSaldo() {
        System.out.println("Saldo actual: " + saldo + " pesos.");
        return saldo;
    }

    public void recargar(double monto) {
        saldo += monto;
        System.out.println("Se ha recargado " + monto + " pesos. Saldo actual: " + saldo + " pesos.");
    }

    public static void main(String[] args) {
        bolsillo bolsillo = new bolsillo("usuario", "contrasena");
        Scanner scanner = new Scanner(System.in);

        bolsillo.loguearse("usuario", "contrasena");

        bolsillo.depositar(1000);
        bolsillo.consultarSaldo();

        bolsillo.retirar(500);
        bolsillo.consultarSaldo();

        bolsillo.recargar(200);
        bolsillo.consultarSaldo();

        scanner.close();
    }
}