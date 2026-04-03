import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VectorHeapTest {

    @Test
    public void testAddAndRemove() {
        VectorHeap<Paciente> cola = new VectorHeap<>();

        cola.add(new Paciente("Juan", "fractura", 'C'));
        cola.add(new Paciente("Maria", "apendicitis", 'A'));
        cola.add(new Paciente("Pedro", "fiebre", 'B'));

        assertEquals('A', cola.remove().getPrioridad());
        assertEquals('B', cola.remove().getPrioridad());
        assertEquals('C', cola.remove().getPrioridad());
    }
}