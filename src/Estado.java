public class Estado {
    private String nome;

    public Estado(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
