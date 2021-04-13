package br.com.movies.restservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.movies.common.exception.BussinessException;
import br.com.movies.restservice.command.MoviesCommand;
import br.com.movies.restservice.model.ResponseDTO;

@Service
public class GetMovieServiceImp implements GetMovieService {

	@Autowired
	MoviesCommand moviesCommand;

	@Override
	public ResponseDTO getMovie(String title) throws Exception {

		ResponseDTO response = new ResponseDTO();

		try {
			response = moviesCommand.get(title);
		} catch (BussinessException ex) {
			throw ex;
		}
		
		return response;

	}

}
