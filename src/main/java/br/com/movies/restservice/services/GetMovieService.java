package br.com.movies.restservice.services;

import br.com.movies.common.exception.BussinessException;
import br.com.movies.restservice.model.ResponseDTO;

public interface GetMovieService {
	
	ResponseDTO getMovie(String title) throws Exception;

}
