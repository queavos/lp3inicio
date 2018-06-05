package unae.lp3.app.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="Noticias")
public class Noticia {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	private String titulo;
	private Date fecha;
	private int publicado;
	private String contenido;
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFecha() {

		return fecha;
	}
	public void setFecha(String fecha) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
		this.fecha = formatter.parse(fecha);
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	public int getPublicado() {
		return publicado;
	}
	public void setPublicado(int publicado) {
		this.publicado = publicado;
	}
	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titulo=" + titulo + ", fecha=" + fecha + ", publicado=" + publicado
				+ ", contenido=" + contenido + "]";
	}
	
	
	

}
