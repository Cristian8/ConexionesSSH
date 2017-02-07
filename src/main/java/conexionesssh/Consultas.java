package conexionesssh;

import java.util.List;

public class Consultas {
	public static final String PATOLOGIA_NOMBRE 
	= "Select nom_patol From Patologias Where id_patol IN (Select id_patol from Patologias Where nom_patol = 'Queratocono')";
	
	public static final String SINTOMA_NOMBRE 
	= "SELECT des_sint From Sintomas Where id_sint IN (Select id_sint From Sintomas Where id_sint)";
	
	public static final String LISTAR_PATOLOGIAS 
	= "SELECT nom_patol From Patologias Where id_patol IN (Select id_patol From Patologias Where id_patol)";
	
	public static final String LISTAR_PATOLOGIA_SINTOMA 
	= "SELECT nom_patol FROM Patologias WHERE id_patol IN (SELECT id_patol FROM Causas WHERE id_sint = 3)";
	
	public static final String LISTAR_PATOLOGIA_SINTOMA2 
	= "SELECT nom_patol FROM Patologias WHERE id_patol IN (SELECT id_patol FROM Causas WHERE id_sint = *)";
	
	public void sustituirArgumentos(String cadena,List<Object> Argumentos){
		char c_aux = 0;
		for(int i = 0;i<cadena.length();i++){
			c_aux = cadena.charAt(i);
			if(c_aux == '*'){
				cadena.charAt(i);
			}
		}
		
	}
}
