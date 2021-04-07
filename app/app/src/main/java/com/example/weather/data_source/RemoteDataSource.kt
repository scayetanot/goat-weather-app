package com.example.weather.data_source

import com.example.weather.data.ResultForeCast
import com.example.weather.data.entity.WeatherForeCastResponse

interface RemoteDataSource {
    suspend fun getForecast(latitude: Double, longitude: Double): ResultForeCast<WeatherForeCastResponse>
}