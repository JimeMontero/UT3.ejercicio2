public class Persona {
    public int edad;
    public String nombre;

    public Persona(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
    public void decirNombre(){
        System.out.println("Mi nombre es "+ nombre);
    }
    public void  esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Soy mayor de edad");
        } else
            System.out.println("Soy menor de edad");
    }

}
