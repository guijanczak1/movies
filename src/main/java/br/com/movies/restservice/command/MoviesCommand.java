package br.com.movies.restservice.command;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import br.com.movies.common.exception.BussinessException;
import br.com.movies.restservice.model.ResponseDTO;
import br.com.movies.restservices.base.AbstractRestCommand;

@Component
public class MoviesCommand extends AbstractRestCommand<ResponseDTO> {
	
	public ResponseDTO get(String title) throws BussinessException {
		
		super.setObjectType(new ResponseDTO());		
		return super.callRest(HttpMethod.GET, null, title);
		
	}

}
