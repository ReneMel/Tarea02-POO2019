package Facturador;

import Clases.Cliente;
import Clases.Factura;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        Cliente uncliente = new Cliente();
        Scanner data = new Scanner(System.in);
        boolean continuar=false;
        int op;
        System.out.println("Bienvenido a la tienda!");

        if (continuar==false){
            //Creando cliente

            System.out.println("Nombre Cliente"); input=data.nextLine().toUpperCase()+"            ";
            uncliente.setNombres(input);
            System.out.println("Apellidos Cliente");input=data.nextLine().toUpperCase()+"          ";
            uncliente.setApellidos(input);
            System.out.println("Telefono: "); input=data.nextLine()+"            ";
            uncliente.setTel(input);
            System.out.println("Cliente agregado!!!");
            continuar= true;
        }

        while(continuar){
            System.out.println("Menu\n\r\t1.Ingresar producto\n\r\t2.Listar productos\n\r\t3.Calcular total\n\r\t4.Generar factura");
            op=data.nextInt();
            switch (op){
                case 1: uncliente.crear_producto();
                    break;
                case 2:uncliente.imprimircompras();
                    break;
                case 3: System.out.println("Total es de $"+uncliente.total());
                    break;
                case 4:
                    Factura unafactura=new Factura();
                    unafactura.imprimir_factura(uncliente);
                    continuar=false;
                    break;
            }
        }

    }
}
