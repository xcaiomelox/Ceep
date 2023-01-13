package br.com.alura.ceep.webclient

import br.com.alura.ceep.webclient.service.NotaService
import retrofit2.Retrofit

class RetrofitInicializador {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("localhost:8080/")
        .build()

    val notaService = retrofit.create(NotaService::class.java   )
}