package nutrisoft.model;

import java.util.ArrayList;
import java.util.List;

public class ListaConsulta {
    private static final List<Consulta> lista = new ArrayList<>();

    public static List<Consulta> Listar() {
        return lista;
    }

    public static void Adicionar(Consulta consulta) {
        lista.add(consulta);
    }

    public static void Excluir(int index) {
        if (index >= 0 && index < lista.size()) {
            lista.remove(index);
        }
    }

    public static Consulta getConsulta(int index) {
        if (index >= 0 && index < lista.size()) {
            return lista.get(index);
        }
        return null;
    }
}