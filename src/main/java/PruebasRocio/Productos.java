package PruebasRocio;

public class Productos {
        private String nombre;
        private float precio;
        private String descripcion;

        public Productos(){

        }

        public Productos(String nombre, float precio, String descripcion){
            this.nombre = nombre;
            this.precio = precio;
            this.descripcion = descripcion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        @Override
        public String toString() {
            return "Productos{" + "nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + '}';
        }

        public float calcular(int cantidad_productos){

            float fin = precio * cantidad_productos;
            setPrecio(fin);
            return fin;
        }



    }
