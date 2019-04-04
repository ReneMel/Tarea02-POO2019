package Clases;

import java.util.Date;

public class Factura {
    public void imprimir_factura(Cliente uncliente){

        java.util.Date fecha= new Date();
        String total=null;
        total=uncliente.total();
        System.out.println("----------------------FACTURA------------------------\n|                     "+uncliente.getNombres().substring(0,5)+" "+uncliente.getApellidos().substring(0,4)+"                      |\n|             "+fecha+"            |");
        System.out.println("|                                                     |");
        for (Producto s:uncliente.compras
             ) {
            String sbtotal;
            String precio;
            precio=s.getPrecio().toString()+"   ";
            Double subtotal=s.getPrecio()*s.getCantidad();
            sbtotal=subtotal.toString()+"  ";
            System.out.println("|   "+s.getNombre().substring(0,6)+"        $"+precio.substring(0,4)+"p/u    "+s.getCantidad()+"   "+sbtotal.substring(0,5)+"               |");
        }
        System.out.println("|                                                     |");
        System.out.println("|                                     TOTAL:$ "+total.substring(0,6)+"  |");
        System.out.println("|                                                     |");
        System.out.println("|                    "+uncliente.getTel().substring(0,8)+"                         |");
        System.out.println("------------------------------------------------------");


    }
}
