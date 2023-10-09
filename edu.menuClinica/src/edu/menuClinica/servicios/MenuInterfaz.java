package edu.menuClinica.servicios;

import java.util.Scanner;

/**
 * Interfaz que enumera los metodos de la uncionalidad del menu
 * @author Jal-031023
 */
public interface MenuInterfaz {
	
	/**
	 *Método para mostrar el menu y las opciones que tiene*
	 * @author Jal-031023
	 * @return (int)el número de la accion que seleccione el usuario
	 */
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM);

}
