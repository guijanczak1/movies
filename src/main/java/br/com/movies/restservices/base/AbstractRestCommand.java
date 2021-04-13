package br.com.movies.restservices.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.movies.common.exception.BussinessException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public abstract class AbstractRestCommand<T> {

	private T objectType;

	@Value("${service.api.key}")
	private String apiKey;

	@Value("${service.url.endpoint}")
	private String url;

	protected AbstractRestCommand() {

	}

	@SuppressWarnings("unchecked")
	public T callRest(HttpMethod method, Object postBody, String urlRequest) throws BussinessException {

		ResponseEntity<T> response = null;
		RestTemplate restTemplate = new RestTemplate();

		String uri = url + urlRequest;

		switch (method) {
		case GET:
			
			String urlGet = url + "?t=" + urlRequest + "&apikey=" + apiKey;
			
			HttpHeaders headers = new HttpHeaders();
			headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

			HttpEntity<?> entity = new HttpEntity<>(headers);

			response = (ResponseEntity<T>) restTemplate.exchange(urlGet, HttpMethod.GET, entity, objectType.getClass());
			
			if(response.getStatusCodeValue() == 200) {
				return (T) response.getBody();
			}

			break;
		case POST:

			break;

		case PUT:

			break;

		case PATCH:
			break;

		}

		return objectType;

	}

}
