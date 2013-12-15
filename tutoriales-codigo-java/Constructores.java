package paquete;

//Creado Por: Jean Bernuy

public class Constructores {
	 int idUsuario;
	 String usuario;
	 String password;
	 
	/*public Constructores(){
     	 idUsuario= 1015;
     	 usuario="jean@gmail.com";
     	 password="jean2"; 
     	 
     	 mostrar();
     	 
     }*/
	public  Constructores(){}

	public Constructores(int idUsuario){
    	 this.idUsuario=idUsuario;
    	 usuario="jean@gmail.com";
    	 password="jean2"; 
    	 
    	 mostrar();
    	 
    }
	public Constructores(int idUsuario, String usuario){
   	 this.idUsuario=idUsuario;
   	 this.usuario=usuario;
   	 password="jean2"; 
   	 
   	 mostrar();
   	 
   }
	public void mostrar(){
		System.out.println(idUsuario);
		System.out.println(usuario);
		System.out.println(password);
		System.out.println();
	}

	public static void main(String[] args) {
	  Constructores t=new Constructores();
	  Constructores t2=new Constructores(1120);
	  Constructores t3=new Constructores(1123,"jean3@gmail.com");
	 
	}

}
