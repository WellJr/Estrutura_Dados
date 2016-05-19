package modelo;

import modelo.Pessoa;

public class Usuario {
    //super();
 
	private String nickname;
	 
	private String senha;
        
        private String tipoUsuario;
        
        private String usuarioLogado;
	 
	// private image foto; //ver variavel para foto
	 
	
	 
	public Usuario() {
	 
	}
	 
	public void Usuario(String nome, String senha) {
	 
            nickname = nome;
            this.senha = senha;
        
        }
	 
	public void setUsuario(String usuario) {
	 nickname = usuario;
	}
	 
	public String getUsuario() {
		return nickname;
	}
	 
	public void setSenha(String senha) {
	 this.senha = senha;
	}
	 
	public String getSenha() {
		return senha;
	}
	 
        
        public void setTipoUsuario(String tipo)
        {
            
        
            tipoUsuario  = tipo;
        
        }
        
        
        
        public String getTipousuario()
        {
            return tipoUsuario;
        }
        
        
        public void setUsuarioLogado(String ul)
        {
            usuarioLogado  = ul;
            
        }
        
        public String getUsuarioLogado()
        {
            return usuarioLogado;
        }
        
	
        
        public void setFoto(String foto) {
	 
	}
	 
	public String getFoto() {
		return null;
	}
	 
	public void imprimirUsuario() {
	 
	}
	 
	public void setAlterarDadosUsuario() {
	 
	}
	 
	public void setDeletarUsuario() {
	 
	}
	 
}
 
