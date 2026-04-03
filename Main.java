import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        VectorHeap<Paciente> cola = new VectorHeap<>();

        BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"));
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");

            String nombre = partes[0].trim();
            String sintoma = partes[1].trim();
            char prioridad = partes[2].trim().charAt(0);

            cola.add(new Paciente(nombre, sintoma, prioridad));
        }

        br.close();

        // Atender pacientes
        Paciente p;
        while ((p = cola.remove()) != null) {
            System.out.println(p);
        }
    }
}