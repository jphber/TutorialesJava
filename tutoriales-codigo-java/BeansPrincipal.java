package paquete;

public class BeansPrincipal {

	public static void main(String[] args) {
		 
		JavaBeans obj=  new JavaBeans();
		
		obj.setUsuario("jean@gmail.com");
		obj.setPassword("esta es una contraseña");
		obj.setCodigo(121);
		
		System.out.println(obj.getUsuario());
		System.out.println(obj.getPassword());
		System.out.println(obj.getCodigo());
		 
	}

}
