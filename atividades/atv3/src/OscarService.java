@Service
public class OscarService {
    private List<Indicacao> indicados = new ArrayList<>();

    public void adicionarIndicacao(Indicavel indicavel, String categoria) {
        if (indicavel.isElegivel()) {
            indicavel.setNumeroDeIndicacoes(indicavel.getNumeroDeIndicacoes() + 1);
            Indicacao novaIndicacao = new Indicacao();
            novaIndicacao.setIndicavel(indicavel);
            novaIndicacao.setCategoria(categoria);
            indicados.add(novaIndicacao);
        }
    }

    public List<Indicacao> listarIndicados() {
        return indicados;
    }
}