
package modelo;
public class Curso  {
 
	private int codigoCurso;
	 
	private String nomeCurso;
        
        private String dataInicial;
        
        private String dataFinal;
        
        private String requisitos;
        
        private String ementa;
        
        private String observacoes;
	 
	private String duracao;
	
        private String instituicao;
        
	private int quantidade_vagas;
	 
	
	 
	//private Instituicao instituicao;
	 
	//private Disciplina[] disciplina;
	 
	//private Pessoa pessoa;
	 
	public Curso() {
	 
	}
        
       public Curso(int codigo, String nome, String dataInicial, String dataFinal, String instituicao, String requisito, String ementa, String Observacoes)
       {
           
           
           this.codigoCurso = codigo;
           this.nomeCurso = nome;
           this.dataInicial = dataInicial; 
           this.dataFinal = dataFinal;
           this.instituicao = instituicao;
           
           
           
           
       }

    /**
     * @return the codigoCurso
     */
    public int getCodigoCurso() {
        return codigoCurso;
    }

    /**
     * @param codigoCurso the codigoCurso to set
     */
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    /**
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return the dataInicial
     */
    public String getDataInicial() {
        return dataInicial;
    }

    /**
     * @param dataInicial the dataInicial to set
     */
    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    /**
     * @return the dataFinal
     */
    public String getDataFinal() {
        return dataFinal;
    }

    /**
     * @param dataFinal the dataFinal to set
     */
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    /**
     * @return the requisitos
     */
    public String getRequisitos() {
        return requisitos;
    }

    /**
     * @param requisitos the requisitos to set
     */
    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    /**
     * @return the ementa
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the duracao
     */
    public String getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the quantidade_vagas
     */
    public int getQuantidade_vagas() {
        return quantidade_vagas;
    }

    /**
     * @param quantidade_vagas the quantidade_vagas to set
     */
    public void setQuantidade_vagas(int quantidade_vagas) {
        this.quantidade_vagas = quantidade_vagas;
    }
	
    public void setInstituicao(String inst)
    {
        this.instituicao = inst;
    }
     public String getInstituicao()
     {
         return instituicao;
     }

	 
     
     
     
}
 
