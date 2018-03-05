package Bean;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.AdministradorDao;
import vo.AdministradorVo;

@ManagedBean
@SessionScoped
public class AdministradorBean {

	private AdministradorVo miAdmin;
	private boolean siinicio=false;
	private AdministradorDao administradorDao;
	private String msjLG;
	
	
	public AdministradorBean(){   
		 miAdmin=new AdministradorVo();  
		 administradorDao=new AdministradorDao(); 
		 }
	
	public String getMsjLG() {
		return msjLG;
	}

	public void setMsjLG(String msjLG) {
		this.msjLG = msjLG;
	}
	
	
	
	public boolean isSiinicio() {
		return siinicio;
	}
	

	public void setSiinicio(boolean siinicio) {
		this.siinicio = siinicio;
	}
	
	  
	
	public AdministradorVo getMiAdmin() {
		return miAdmin;
	}

	public void setMiAdmin(AdministradorVo miAdmin) {
		this.miAdmin = miAdmin;
	}
	
	public void validarUsuario(){
		setMsjLG(administradorDao.ValidarUsuario(miAdmin.getDocumento(),miAdmin.getContraseña()));
		
			
	}


	public String laotrapagina(){
		String inicio="";
		if(administradorDao.isSi()==true){
		inicio="inicio";
		setSiinicio(true);
		System.out.println("Aqui entro tambien");
		}else{
			inicio="Error";
			setMsjLG("Verifique los datos");
			setSiinicio(false);
			System.out.println("Aqui no  entro tambien");

		}
		return inicio;
	}
}
