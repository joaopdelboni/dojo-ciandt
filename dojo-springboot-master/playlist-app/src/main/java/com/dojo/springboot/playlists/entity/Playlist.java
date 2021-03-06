package com.dojo.springboot.playlists.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Playlists")  
public class Playlist implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7280733629265134658L;
	@Id
	@Column(name = "Id")
	private String id;
	
	@OneToMany(mappedBy = "playlistId")
	private List<PlaylistMusicas> musicas;

	@OneToOne(mappedBy = "playlist")
	private Usuario usuario;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<PlaylistMusicas> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<PlaylistMusicas> musicas) {
		this.musicas = musicas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
