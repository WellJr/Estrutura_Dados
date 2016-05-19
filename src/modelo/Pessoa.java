package modelo;

import modelo.Curso;
import modelo.Usuario;

public class Pessoa extends Usuario {
 
	
    
        private int id;
        
        private String nome;
	 
	private String RG;
	 
	private String CPF;
	 
	private String endereco;
        
        private String cidade;
        
        private String numero;
	 
	private String data_nasc;
	 
	private String sexo;
	 
	private String telefone;
	 
	private String email;
	 
	private String registro;
	 
	private String RA;
        
        private String instituicao;
	 
	
        private String usuarioPessoa;
        private String senhaPessoa;
        
        
        private Usuario usuario;
	 
	//private TipoUsuario tipoUsuario;
	 
	private Curso curso;
	 
	private Disciplina disciplina;
	 
	private GrupoPessoas grupoPessoas;
	 
	private Atividade atividade;
	 
	private Material material;
	 
	
	 
	private Questionario questionario;
	 
	private BibliotecaDigital bibliotecaDigital;
	 
	private LivroDigital livroDigital;
	 
	private Forum forum;
        
	 
	public Pessoa() {
	 
            
	}
	 
	public Pessoa(String n, String cpf, String rg, char s) {
	 
	}

    public Pessoa(String nome, String RG, String CPF, String endereco, String cidade, String numero, String data_nasc, String sexo, String telefone, String email, String registro, String usuario, String senha, int id, String ra, String instituicao, String tipoUser) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.cidade = cidade;
        this.numero = numero;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.registro = registro;
        this.id = id;
        this.RA = ra;
        this.instituicao = instituicao;
        
        super.setUsuario(usuario);
        super.setSenha(senha);
        super.setTipoUsuario(tipoUser);
       
        //this.usuario.setUsuario(usuario);
        //this.usuario.setSenha(senha);
       
      
       
        
        
        
    }
	 
	public void setNome(String n) {
	 
            nome = n;
        
        }
	 
	public void setCPF(String cpf) {
	 this.CPF = cpf;
	}
	 
	public void setEnd(String end) {
	 
            this.endereco = end;
        }
	 
	public void setRG(String r) {
	 this.RG = r;
	}
	 
	public void setDate(String d) {
            this.data_nasc = d;
	}
	 
	public void setSexo(String s) {
	  this.sexo = s;
	}
	 
	public void setRegistro() {
	 
	}
	 
	public void setRA(String ra) {
	 this.RA = ra;
            
	}
        
        public void setTelefone(String tel)
        {
            telefone = tel;
        }
	 
        public void setEmail(String em)
        {
            email = em;
            
        }
        
        public void setRegistro(String reg)
        {
            registro = reg;
        }
        
        public void setID(int id)
        {
            this.id = id;
            
        }
        
        public void setInstituicao(String inst)
        {
            instituicao = inst;
        }
        
        
        //public void setUsuario(String usu)
        //{
          //usuario.setUsuario(usu);
        //}
        
        
        //public String getUsuario()
        //{
         //return usuario.getUsuario();
        //}
        
       // public void setSenha(String s)
        //{
            //usuario.setSenha(s);
        //}
        
       // public String getSenha()
        //{
            //return usuario.getSenha();
        //}
        
        
	
        
        
        
        public void setCadastrarProfessor() {
	 
	}
	 
	public void setAlterarDadosProfessor() {
	 
	}
	 
	public void setDeletarProfessor() {
	 
	}
	 
	public void setCadastrarAluno() {
	 
	}
	 
	public void setAlterarDadosAluno() {
	 
	}
	 
	public void setDeletarAluno() {
	 
	}
	 
	public String getNome() {
		return nome;
	}
	 
	public String getCPF() {
		return CPF;
	}
	 
	public String getRG() {
		return RG;
	}
	 
	public String getEnd() {
		return endereco;
	}
	 
	public String getDate() {
	return data_nasc;
	}
	 
	public String getSexo() {
		return this.sexo;
	}
	 
	public String getRegistro() {
		return registro;
	}
	 
	public String getRA() {
            return RA;
	}
        
        public String getTelefone()
        {
            return telefone;
        }
        
        public String getEmail()
        {
            return email;
        }
        
       public int getID()
       {
           return id;
       }
       
       public String getInstituicao()
       {
           return instituicao;
           
       }
	 
	public String getCadastrarProfessor() {
		return null;
	}
	 
	public String getAlterarDadosProfessor() {
		return null;
	}
	 
	public String getDeletarProfessor() {
		return null;
	}
	 
	public void getCadastrarAluno() {
	 
	}
	 
	public String getAlterarDadosAluno() {
		return null;
	}
	 
	public String getDeletarAluno() {
		return null;
	}

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
	 

    public String toString()
    {
        
        return nome     +"\n"+ 
               RG       +"\n"+
               CPF      +"\n"+
               endereco +"\n"+
               data_nasc+"\n"+
               sexo     +"\n"+
               telefone +"\n"+ 
               email    +"\n"+
               cidade   +"\n"+
               numero   +"\n"+
               registro +"\n"+
               instituicao +"\n"+ 
               super.getUsuario()+"\n"+
               super.getSenha()+"\n"+
               super.getTipousuario();
    }

    public String getNome(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
 
