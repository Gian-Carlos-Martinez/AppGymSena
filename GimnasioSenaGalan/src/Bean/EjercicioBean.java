package Bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import dao.EjercicioDao;

import vo.EjercicioVo;
import vo.UsuarioVo;


@ManagedBean
@SessionScoped
@ViewScoped
public class EjercicioBean {
	
	
String MsjBD;

private ArrayList<EjercicioVo> listaEjercicio = new ArrayList<>();
private ArrayList<EjercicioVo> listaEjercicio2 = new ArrayList<>();	
private ArrayList<EjercicioVo> listaEjercicioPecho = new ArrayList<>();	
private ArrayList<EjercicioVo> listaEjercicioEspalda = new ArrayList<>();	
private ArrayList<EjercicioVo> listaEjercicioBiceps = new ArrayList<>();	
private ArrayList<EjercicioVo> listaEjercicioTriceps = new ArrayList<>();	
private ArrayList<EjercicioVo> listaEjercicioCadera = new ArrayList<>();	
private ArrayList<EjercicioVo> listaEjercicioHombros = new ArrayList<>();	
private ArrayList<EjercicioVo> listaEjercicioPierna = new ArrayList<>();	
private ArrayList<EjercicioVo> listaEjercicioMuslo= new ArrayList<>();	
private ArrayList<EjercicioVo> listaEjercicioTrapesio = new ArrayList<>();	
EjercicioVo miejercicio;
EjercicioDao miejerciciodao;


public EjercicioBean() {
	miejercicio= new EjercicioVo();
	miejerciciodao = new EjercicioDao();
	
}

public void eliminarEjercicio(EjercicioVo EjercicioVo) {
	setMsjBD(miejerciciodao.eliminarEjercicio(EjercicioVo));
	
	listaEjercicio2.remove(EjercicioVo);
	listaEjercicioPecho.remove(EjercicioVo);
	listaEjercicioEspalda.remove(EjercicioVo);
	listaEjercicioHombros.remove(EjercicioVo);
	listaEjercicioCadera.remove(EjercicioVo);
	listaEjercicioBiceps.remove(EjercicioVo);
	listaEjercicioTriceps.remove(EjercicioVo);
	listaEjercicioMuslo.remove(EjercicioVo);
	listaEjercicioPierna.remove(EjercicioVo);
	listaEjercicioTrapesio.remove(EjercicioVo);
	
	
}

public void editarEjercicio(EjercicioVo EjercicioVo) {

	System.out.println("ingresa");
	EjercicioVo.setEditar(true);;
	
}
public void guardarEjercicio(EjercicioVo EjercicioVo) {
	setMsjBD(miejerciciodao.editarEjercicio(EjercicioVo));
	EjercicioVo.setEditar(false);
	// for (Persona persona : listaPersona){
	// persona.setEditar(false);
	// }}
	
}


public void agregarEjercicio() {
	setMsjBD(miejerciciodao.agregarEjercicio(miejercicio));
	miejercicio = new EjercicioVo();// limpiamos el objeto
	
}
public void listaEjercicios() {
	listaEjercicio.clear();
	listaEjercicio = miejerciciodao.obtenerListaEjercicios2();
	
	if (listaEjercicio == null) {
		setMsjBD("No se pudo conectar, verifique que la Base de Datos " + "se encuentre iniciada");
	}
}
public void listaEjerciciosPecho() {
	listaEjercicioPecho.clear();
	listaEjercicioPecho = miejerciciodao.obtenerListaEjerciciosPecho() ;
	
	if (listaEjercicioPecho == null) {
		setMsjBD("No se pudo conectar, verifique que la Base de Datos " + "se encuentre iniciada");
	}
}
public void listaEjerciciosEspalda() {
	listaEjercicioEspalda.clear();
	listaEjercicioEspalda = miejerciciodao.obtenerListaEjerciciosEspalda() ;
	
	if (listaEjercicioEspalda == null) {
		setMsjBD("No se pudo conectar, verifique que la Base de Datos " + "se encuentre iniciada");
	}
}
public void listaEjerciciosBiceps() {
	listaEjercicioBiceps.clear();
	listaEjercicioBiceps = miejerciciodao.obtenerListaEjerciciosBiceps() ;
	
	if (listaEjercicioBiceps == null) {
		setMsjBD("No se pudo conectar, verifique que la Base de Datos " + "se encuentre iniciada");
	}
}
public void listaEjerciciosTriceps() {
	listaEjercicioTriceps.clear();
	listaEjercicioTriceps = miejerciciodao.obtenerListaEjerciciosTriceps() ;
	
	if (listaEjercicioTriceps == null) {
		setMsjBD("No se pudo conectar, verifique que la Base de Datos " + "se encuentre iniciada");
	}
}
public void listaEjerciciosCadera() {
	listaEjercicioCadera.clear();
	listaEjercicioCadera = miejerciciodao.obtenerListaEjerciciosCadera() ;
	
	if (listaEjercicioCadera == null) {
		setMsjBD("No se pudo conectar, verifique que la Base de Datos " + "se encuentre iniciada");
	}
}
public void listaEjerciciosHombros() {
	listaEjercicioHombros.clear();
	listaEjercicioHombros = miejerciciodao.obtenerListaEjerciciosHombros() ;
	
	if (listaEjercicioHombros == null) {
		setMsjBD("No se pudo conectar, verifique que la Base de Datos " + "se encuentre iniciada");
	}
}
public void listaEjerciciosPierna() {
	listaEjercicioPierna.clear();
	listaEjercicioPierna = miejerciciodao.obtenerListaEjerciciosPierna() ;
	
	if (listaEjercicioPierna == null) {
		setMsjBD("No se pudo conectar, verifique que la Base de Datos " + "se encuentre iniciada");
	}
}
public void listaEjerciciosMuslo() {
	listaEjercicioMuslo.clear();
	listaEjercicioMuslo = miejerciciodao.obtenerListaEjerciciosMuslo() ;
	
	if (listaEjercicioMuslo == null) {
		setMsjBD("No se pudo conectar, verifique que la Base de Datos " + "se encuentre iniciada");
	}
}
public void listaEjerciciosTrapecio() {
	listaEjercicioTrapesio.clear();
	listaEjercicioTrapesio = miejerciciodao.obtenerListaEjerciciosTrapecio() ;
	
	if (listaEjercicioTrapesio == null) {
		setMsjBD("No se pudo conectar, verifique que la Base de Datos " + "se encuentre iniciada");
	}
}



public String getMsjBD() {
	return MsjBD;
}


public void setMsjBD(String msjBD) {
	MsjBD = msjBD;
}

public ArrayList<EjercicioVo> getListaEjercicioPecho() {
	return listaEjercicioPecho;
}


public void setListaEjercicio3(ArrayList<EjercicioVo> listaEjercicioPecho) {
	this.listaEjercicioPecho = listaEjercicioPecho;
}


public ArrayList<EjercicioVo> getListaEjercicio() {
	return listaEjercicio;
}


public void setListaEjercicio(ArrayList<EjercicioVo> listaEjercicio) {
	this.listaEjercicio = listaEjercicio;
}


public ArrayList<EjercicioVo> getListaEjercicio2() {
	return listaEjercicio2;
}


public void setListaEjercicio2(ArrayList<EjercicioVo> listaEjercicio2) {
	this.listaEjercicio2 = listaEjercicio2;
}


public EjercicioVo getMiejercicio() {
	return miejercicio;
}


public void setMiejercicio(EjercicioVo miejercicio) {
	this.miejercicio = miejercicio;
}


public EjercicioDao getMiejerciciodao() {
	return miejerciciodao;
}


public void setMiejerciciodao(EjercicioDao miejerciciodao) {
	this.miejerciciodao = miejerciciodao;
}


public ArrayList<EjercicioVo> getListaEjercicioEspalda() {
	return listaEjercicioEspalda;
}


public void setListaEjercicioEspalda(ArrayList<EjercicioVo> listaEjercicioEspalda) {
	this.listaEjercicioEspalda = listaEjercicioEspalda;
}


public ArrayList<EjercicioVo> getListaEjercicioBiceps() {
	return listaEjercicioBiceps;
}


public void setListaEjercicioBiceps(ArrayList<EjercicioVo> listaEjercicioBiceps) {
	this.listaEjercicioBiceps = listaEjercicioBiceps;
}


public ArrayList<EjercicioVo> getListaEjercicioTriceps() {
	return listaEjercicioTriceps;
}


public void setListaEjercicioTriceps(ArrayList<EjercicioVo> listaEjercicioTriceps) {
	this.listaEjercicioTriceps = listaEjercicioTriceps;
}


public ArrayList<EjercicioVo> getListaEjercicioCadera() {
	return listaEjercicioCadera;
}


public void setListaEjercicioCadera(ArrayList<EjercicioVo> listaEjercicioCadera) {
	this.listaEjercicioCadera = listaEjercicioCadera;
}


public ArrayList<EjercicioVo> getListaEjercicioHombros() {
	return listaEjercicioHombros;
}


public void setListaEjercicioHombros(ArrayList<EjercicioVo> listaEjercicioHombros) {
	this.listaEjercicioHombros = listaEjercicioHombros;
}


public ArrayList<EjercicioVo> getListaEjercicioPierna() {
	return listaEjercicioPierna;
}


public void setListaEjercicioPierna(ArrayList<EjercicioVo> listaEjercicioPierna) {
	this.listaEjercicioPierna = listaEjercicioPierna;
}


public ArrayList<EjercicioVo> getListaEjercicioMuslo() {
	return listaEjercicioMuslo;
}


public void setListaEjercicioMuslo(ArrayList<EjercicioVo> listaEjercicioMuslo) {
	this.listaEjercicioMuslo = listaEjercicioMuslo;
}


public ArrayList<EjercicioVo> getListaEjercicioTrapesio() {
	return listaEjercicioTrapesio;
}


public void setListaEjercicioTrapesio(ArrayList<EjercicioVo> listaEjercicioTrapesio) {
	this.listaEjercicioTrapesio = listaEjercicioTrapesio;
}


public void setListaEjercicioPecho(ArrayList<EjercicioVo> listaEjercicioPecho) {
	this.listaEjercicioPecho = listaEjercicioPecho;
}




}
