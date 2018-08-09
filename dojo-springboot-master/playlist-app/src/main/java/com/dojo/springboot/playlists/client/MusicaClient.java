package com.dojo.springboot.playlists.client;

import com.dojo.springboot.playlists.entity.Musica;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("music-app")
public interface MusicaClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/musicas/{id}")
    Musica getMusica(@PathVariable("id") String id);
}