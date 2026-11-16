package nutrisoft.model;

public class Consulta {
    private String nomePaciente;
    private String telefone;
    private String cpf;
    private String data;
    private boolean jaEraPaciente;
    private boolean consultaRealizada;
    private String receitaObservacoes;

    public Consulta() {
        this.consultaRealizada = false;
        this.receitaObservacoes = "";
    }

    public Consulta(String nomePaciente, String telefone, String cpf, String data, boolean jaEraPaciente) {
        this.nomePaciente = nomePaciente;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data = data;
        this.jaEraPaciente = jaEraPaciente;
        this.consultaRealizada = false;
        this.receitaObservacoes = "";
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isJaEraPaciente() {
        return jaEraPaciente;
    }

    public void setJaEraPaciente(boolean jaEraPaciente) {
        this.jaEraPaciente = jaEraPaciente;
    }

    public boolean isConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

    public String getReceitaObservacoes() {
        return receitaObservacoes;
    }

    public void setReceitaObservacoes(String receitaObservacoes) {
        this.receitaObservacoes = receitaObservacoes;
    }
}