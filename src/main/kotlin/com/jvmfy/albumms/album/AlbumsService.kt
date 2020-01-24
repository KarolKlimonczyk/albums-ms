package com.jvmfy.albumms.album

import org.springframework.stereotype.Service

@Service
class AlbumsService {

    fun getUserAlbums(userId: String): List<AlbumResponse> {
        return listOf(
                AlbumResponse("album1", "user1", "name1", "description1"),
                AlbumResponse("album1", "user1", "name1", "description1")
        )
    }
}