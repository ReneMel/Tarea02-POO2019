package Clases;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Random;

public class Producto {
    private String nombre;
    private String tipo;
    private Double precio;
    private int cantidad;

    public Producto() {
        nombre = null;
        tipo = null;
        precio = null;
        cantidad = 0;
    }

    public Producto(String nombre, String tipo, Double precio, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio() {
        String precio;
        Random generador = new Random();

        Double precio1;
        precio1=5+(7-5)*generador.nextDouble();

        DecimalFormatSymbols separador = new DecimalFormatSymbols();
        separador.setDecimalSeparator('.');

        DecimalFormat formato1 =new DecimalFormat(  "#.00",separador);

        precio=formato1.format(precio1);
        precio1=Double.parseDouble(precio);
        this.precio =precio1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
