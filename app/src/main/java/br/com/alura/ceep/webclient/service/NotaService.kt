package br.com.alura.ceep.webclient.service

import android.telecom.Call
import br.com.alura.ceep.model.Nota
import retrofit2.http.GET

interface NotaService {

    @GET("notas")
    fun buscaTodos(): retrofit2.Call<List<Nota>>

}