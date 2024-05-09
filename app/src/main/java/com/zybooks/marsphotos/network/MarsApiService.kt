package com.zybooks.marsphotos.network

import com.zybooks.marsphotos.model.MarsPhoto
import retrofit2.http.GET

interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}
