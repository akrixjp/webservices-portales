package pe.edu.sise.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO_CLIENTE")
public class Usuario {
	
	private Integer COD_USUA;
	private Integer COD_CLIE;
	private String NOM_USUA;
	private String CLV_USUA;
	private String CLV_RECU;
	private String SIT_USUA;
	
	public Usuario() {
		super();
	}

	public Usuario(Integer cOD_USUA, Integer cOD_CLIE, String nOM_USUA, String cLV_USUA, String cLV_RECU,
			String sIT_USUA) {
		super();
		COD_USUA = cOD_USUA;
		COD_CLIE = cOD_CLIE;
		NOM_USUA = nOM_USUA;
		CLV_USUA = cLV_USUA;
		CLV_RECU = cLV_RECU;
		SIT_USUA = sIT_USUA;
	}

	public Integer getCOD_USUA() {
		return COD_USUA;
	}

	public void setCOD_USUA(Integer cOD_USUA) {
		COD_USUA = cOD_USUA;
	}

	public Integer getCOD_CLIE() {
		return COD_CLIE;
	}

	public void setCOD_CLIE(Integer cOD_CLIE) {
		COD_CLIE = cOD_CLIE;
	}

	public String getNOM_USUA() {
		return NOM_USUA;
	}

	public void setNOM_USUA(String nOM_USUA) {
		NOM_USUA = nOM_USUA;
	}

	public String getCLV_USUA() {
		return CLV_USUA;
	}

	public void setCLV_USUA(String cLV_USUA) {
		CLV_USUA = cLV_USUA;
	}

	public String getCLV_RECU() {
		return CLV_RECU;
	}

	public void setCLV_RECU(String cLV_RECU) {
		CLV_RECU = cLV_RECU;
	}

	public String getSIT_USUA() {
		return SIT_USUA;
	}

	public void setSIT_USUA(String sIT_USUA) {
		SIT_USUA = sIT_USUA;
	}
	
	
	
	
	
	
	

}
