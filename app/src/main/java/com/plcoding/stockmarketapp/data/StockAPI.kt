package com.plcoding.stockmarketapp.data

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockAPI {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String
    ): ResponseBody

    companion object {
        const val API_KEY = "3I2E4UZG95VDC1YV"
        const val BASE_URL = "hhtps://alphavantage.co"
    }
}