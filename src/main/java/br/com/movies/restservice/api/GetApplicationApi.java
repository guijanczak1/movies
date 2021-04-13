package br.com.movies.restservice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.movies.restservice.model.ResponseDTO;


public interface GetApplicationApi {
	
	@GetMapping("/findmovie/{title}")
	public ResponseEntity<ResponseDTO> getMovie(@PathVariable("title") String title) throws Exception;
			
}
