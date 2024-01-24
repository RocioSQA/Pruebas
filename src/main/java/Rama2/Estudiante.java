package Rama2;

public class Estudiante {
        String programa;
        String nombre;
        int edad;
        /**
         *
         * @author Godie007
         * Metodo Main
         */
        public static void main(String[] args) {
            Estudiante e1  = new Estudiante("Juana", 20, "Sistemas");
            Estudiante e2  = new Estudiante("Pacho", 18, "Español");
            System.out.println(e1.nombre+": "+e1.edad);
            System.out.println(e2.nombre+": "+e2.edad);
        }

        /**
         * @param edad
         * @param programa
         */

        public Estudiante(String nombre, int edad, String programa) {
            super();
            this.nombre = nombre;
            this.edad = edad;
            this.programa = programa;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public String getPrograma() {
            return programa;
        }
        public void setPrograma(String programa) {
            this.programa = programa;
        }
    }


