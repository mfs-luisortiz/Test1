package mx.edu.uaz.SistemaControlEscolar.Design;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class PrincipalDesign extends HorizontalLayout {
	protected Button menuButton;
	protected CssLayout menu;
	protected Button btnUsuarios;
	protected Button btnAlumnos;
	protected Button btnMaterias;
	protected Button btnDocentes;
	protected Button btnEstados;
	protected HorizontalLayout hlTitulo;
	protected Label viewTitle;
	protected HorizontalLayout hlUsuario;
	protected Label lblUsuario;
	protected Button btnSalir;
	protected CssLayout content;
	protected CssLayout contenedor;

	public PrincipalDesign() {
		Design.read(this);
	}
}