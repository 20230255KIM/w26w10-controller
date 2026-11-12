package kr.ac.kumoh.s20230255.w26w10_controller.repository

import kr.ac.kumoh.s20230255.w26w10_controller.model.Song
import org.springframework.stereotype.Repository

@Repository
class MemorySongRepository: SongRepository {
    private val songs = listOf(
        Song(1, "Cosmic Echo", "NEBULA"),
        Song(2, "Neon Fever", "SPARK"),
        Song(3, "Velvet Bitter", "LUNA"),
        Song(4, "소란스러운 마을", "Windy"),
    )

    override fun findAll(): List<Song> {
        return songs.toList()
    }
}