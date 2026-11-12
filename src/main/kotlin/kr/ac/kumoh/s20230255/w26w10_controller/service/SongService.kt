package kr.ac.kumoh.s20230255.w26w10_controller.service

import kr.ac.kumoh.s20230255.w26w10_controller.model.Song
import org.springframework.stereotype.Service

@Service
class SongService {
    fun findAllSongs() = listOf(Song(1, "Cosmic Echo", "NEBULA"))
}