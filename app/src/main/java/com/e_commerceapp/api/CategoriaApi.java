package com.e_commerceapp.api;

import com.e_commerceapp.entity.GenericResponse;
import com.e_commerceapp.entity.service.Categoria;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CategoriaApi {
    String base = "api/categoria";

    @GET(base)
    Call<GenericResponse<List<Categoria>>> listarCategoriasActivas();
}
