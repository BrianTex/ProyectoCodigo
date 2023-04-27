package modelado;

public interface Rentable {
    public double precioEntretenimiento=100;
    public double precioJuego=150;

    public void rentar(Renta r);
    public void devolver(int dia, int i);
}
