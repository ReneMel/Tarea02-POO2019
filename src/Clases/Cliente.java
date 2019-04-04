package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nombres;
    private String apellidos;
    private String tel;
    Scanner data = new Scanner(System.in);
    ArrayList<Producto> compras= new ArrayList<>();

    public Cliente() {
        nombres = null;
        apellidos = null;
        tel = null;
    }

    public Cliente(String nombres, String apellidos, String tel, int numerocliente) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tel = tel;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    private String cambiar (String input){
        int cant;
        if (input.length()<6){
            cant=input.length();
            switch (cant){
                case 1: input=input+"      "; break;
                case 2: input=input+"    "; break;
                case 3: input=input+"   "; break;
                case 4: input=input+"  "; break;
                case 5: input=input+" "; break;
            }
        }
        return input;
    }

    public void crear_producto (){
        String input;
        int cant;
        Producto unproducto= new Producto();
        System.out.println("Nombre del producto: ");input=data.nextLine().toUpperCase();
        input=cambiar(input);
        unproducto.setNombre(input);

        System.out.println("Tipo de producto (Bebida/Comida/Otros)");input=data.nextLine().toUpperCase();
        unproducto.setTipo(input);
        unproducto.setPrecio();
        System.out.println("Precio: $"+unproducto.getPrecio());
        System.out.println("Cantidad a comprar");cant=data.nextInt();data.nextLine();
        unproducto.setCantidad(cant);
        compras.add(unproducto);
    }

    public void imprimircompras(){
        for (Producto e:compras
             ) {
            System.out.println(e.getNombre()+"  "+e.getCantidad()+"  "+e.getTipo()+"  $"+e.getPrecio());
        }

    }
    public String total(){
        Double total = 0.0;
        String impr;
        for (Producto e:compras
             ) {
            total+=(e.getPrecio()*e.getCantidad());
        }
        impr=total.toString()+"      ";
        return impr;
    }


}
