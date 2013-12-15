package paquete;


public class JavaBeans {
  
    public String usuario;
    private String password;
    private int codigo;
    
    public void setUsuario(String usuario){
    	this.usuario=usuario;
    }
    public String getUsuario(){
    	return usuario;
    }
    
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	  
}
