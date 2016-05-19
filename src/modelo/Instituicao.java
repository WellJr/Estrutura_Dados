package modelo;

import modelo.Curso;

public class Instituicao {
 
	private String nome;
	 
	private String endereco;
	 
	private String CNPJ;
	 
	private String CEP;
	 
	private String telefone;
	 
	private String email;
        
        private String cidade;
        
        private String estado;
	 
	private Curso[] curso;
	 
	private Pessoa pessoa;
	 
	public Instituicao() {
	 
	}

    public Instituicao(String nome,String endereco,String cnpj,String cep, String cidade,String estado,String telefone,String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.CNPJ = cnpj;
        this.CEP = cep;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
        this.curso = curso;
        this.pessoa = pessoa;
    }

  
	 
	
	 
	public void DeletarInstituicao(String nome) {
          
	}
	 
	public void BuscarInstituicao(String nome) {
	 
	}
	 
	public void setEndereco(String end) {
	 
            this.endereco = end;
            
	}
	 
	public void setNome(String nome)
        {
            this.nome = nome;
            
        }
        
        public void setCNPJ(String cnpj) {
	  this.CNPJ = cnpj;
	}
	 
	public void setCEP(String cep) {
	  this.CEP = cep;
	}
	 
	public void setTelefone(String tel) {
	  this.telefone = tel;
	}
	 
	public void setEmail(String email) {
	  this.email = email;
	}
        
        public void setCidade(String cidade)
        {
           this.cidade = cidade; 
            
            
        }
        
        public void setEstado(String estado)
        {
            
            this.estado = estado;
        }
        
	 
	public String getInstituicao(String inst) {
		return null;
	}
	 
	public void imprimeInstituicao() {
	 
	}
	 
	public String getCadastrarInstituicao() {
		return null;
	}
	 
	
        public String getNome()
        {
            return nome;
        }
        
        public String getEndereco() {
		return endereco;
	}
	 
	public String getCNPJ() {
		return CNPJ;
	}
	 
	public String getCEP() {
		return CEP;
	}
        
        public String getEmail()
        {
            return email;
        }
        
        public String getCidade()
        {
            return cidade;
            
        }
        
        public String getEstado()
        {
            return estado;
            
        }
        
        public String getTelefone()
        {
            return telefone;
        }
	 
        
        public String toString()
        {
            
            return nome     + "\n" +
                   endereco + "\n" + 
                   CNPJ     + "\n" +
                   CEP      + "\n" +
                   cidade   +  "\n"+
                   estado   +  "\n"+ 
                   telefone + "\n" +
                   email; 
            
            
        }
        
        
        
}
 
