package com.alwin.youtubemobileplayer.videoList

import android.util.Log
import com.alwin.youtubemobileplayer.storage.VideoDao
import org.junit.Before
import org.junit.Test

class VideoListTest {
    private lateinit var videoEditViewModel: VideoEditViewModel
    private lateinit var videoDao: VideoDao

    @Test
    fun addVideoTest() {
        if (this::videoDao.isInitialized && this::videoEditViewModel.isInitialized) {
            videoEditViewModel = VideoEditViewModel(videoDao)
            val testingVideoName = "Add video Test Name"
            val testingVideoUrl = "Add video Test url"
            videoEditViewModel.addVideo(
                    1,
                    testingVideoName,
                    testingVideoUrl
            ) {
            }
            var testingVideo = videoEditViewModel.get(1)
            assert(testingVideo == videoEditViewModel.get(1))
         }
    }
}