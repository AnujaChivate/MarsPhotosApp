package com.zybooks.marsphotos.data

import com.zybooks.marsphotos.model.MarsPhoto
import com.zybooks.marsphotos.network.MarsApiService


interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}
