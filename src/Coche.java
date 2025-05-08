public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje = 0;
    private boolean detallado = false;

    public Coche() {
    }

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    public void mostrarInformacionDetallada() {
        mostrarInformacion();
        if (detallado) {
            System.out.println("Kilometraje: " + kilometraje + " km");
        }
    }

    public void actualizarKilometraje(int nuevoKilometraje) {
        if (nuevoKilometraje >= 0) {
            this.kilometraje += nuevoKilometraje;
            System.out.println("Kilometraje actualizado a: " + this.kilometraje + " km");
            detallado = true;
        } else {
            System.out.println("Error: El kilometraje no puede ser negativo.");
        }
    }
}