package com.dojo.springboot.playlists.service.impl;

import org.springframework.stereotype.Component;

import com.dojo.springboot.playlists.client.MusicaClient;
import com.dojo.springboot.playlists.entity.Musica;
import com.dojo.springboot.playlists.service.MusicaService;


@Component
public class MusicaServiceImpl implements MusicaService {

	private MusicaClient client;

	public MusicaServiceImpl(MusicaClient client) {
		this.client = client;
	}

	@Override
	public Musica getById(String id) {
		return this.client.getMusica(id);
	}

	
}
