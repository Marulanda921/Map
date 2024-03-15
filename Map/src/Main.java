import java.util.*;
public class Main {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente(1, "Alejandro", "Marulanda", 200000);
        Cliente cliente2 = new Cliente(2, "Maryhug", "Duran", 300000);

        // create and populate hash map
        HashMap<Integer, String> map = new HashMap<Integer, String>();


        System.out.println("\n");
        System.out.println("Map sin eliminar: "+ map + "\n");
        // Remove value of key 5
        map.remove(3);
        System.out.println("Map eliminado: "+ map + "\n");

        map.forEach((i,n) -> System.out.println("Pocision: " + i + "\n" + "Valor: " + n  + "\n"));




        Map<Integer, String> map1 = new TreeMap<Integer, String>();
        for (int i = 1; i <= 5; i++) {
            map1.put(i, "Valor " + cliente1.getApellido() + " " + i + " " +  cliente1.getNombre());
        }
        map1.forEach((l,z) -> System.out.println("Nombre: " + l + " Apellido: " + z + "\n"));
        System.out.println(map1.values());

        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

    }

}