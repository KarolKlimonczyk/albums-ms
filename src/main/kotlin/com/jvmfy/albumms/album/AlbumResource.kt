package com.jvmfy.albumms.album

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users/{id}/albums")
class AlbumResource(val albumsService: AlbumsService) {

    @GetMapping
    fun userAlbums(@PathVariable id : String): ResponseEntity<List<AlbumResponse>> {
        return ResponseEntity.ok(this.albumsService.getUserAlbums(id))
    }
}