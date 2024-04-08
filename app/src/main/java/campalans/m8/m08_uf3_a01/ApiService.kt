package campalans.m8.m08_uf3_a01

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    @GET("/0.2/languages")
    suspend fun getLanguages(): Response<List<Language>>

    @Headers("Authorization: Bearer 658d13846cf5bd9f1268db63fb0af2c3")
    @FormUrlEncoded
    @POST("/0.2/detect")
    suspend fun getTextLanguage(@Field("q") text:String):Response<DetectionResponse>
}