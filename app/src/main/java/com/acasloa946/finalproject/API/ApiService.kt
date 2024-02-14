package com.acasloa946.finalproject.API

import com.acasloa946.finalproject.API.Models.APIResponse
import com.acasloa946.finalproject.API.const.Companion.ENDPOINT
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(ENDPOINT)
    suspend fun getResultByName(
                                @Query("search") search:String,
                                @Query("search_precise") searchPrecise:Boolean,
                                @Query("search_exact") searchExact:Boolean,
                                @Query("page_size") pageSize:Int,
                                @Query("exclude_additions") excludeAdditions:Boolean,
                                @Query("key") apiKey:String): APIResponse

}

//CURL -X GET https://api.rawg.io/api/games?search=Palworld&search?precise=true&page_size=1&key=1b7d0cfbab3b49df8c16c045b2feb223
// https://api.rawg.io/api/games?ordering=name&search=Bloodborne&search_precise=true&page_size=1&key=176671a1699f4c3ea0fb1c6297db6c4a