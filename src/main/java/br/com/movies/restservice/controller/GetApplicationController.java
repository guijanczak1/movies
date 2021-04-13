package br.com.movies.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.movies.common.exception.BussinessException;
import br.com.movies.restservice.api.GetApplicationApi;
import br.com.movies.restservice.model.ResponseDTO;
import br.com.movies.restservice.services.GetMovieService;

@RestController
public class GetApplicationController implements GetApplicationApi {

	@Autowired
	GetMovieService getMovieService;
		
	@Override
	public ResponseEntity<ResponseDTO> getMovie(String title) throws Exception {
		
	    return new ResponseEntity<ResponseDTO>(getMovieService.getMovie(title), HttpStatus.FOUND);
	}

}
