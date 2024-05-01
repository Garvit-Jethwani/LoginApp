/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
		date = "2024-03-27T18:23:55.118803+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
@Validated
@Tag(name = "login-button-click", description = "the login-button-click API")
public interface LoginButtonClickApi {

	default Optional<NativeWebRequest> getRequest() {
		return Optional.empty();
	}

	/**
	 * GET /login-button-click : Check if login button is clickable
	 * @return Successful operation (status code 200)
	 */
	@Operation(operationId = "loginButtonClickGet", summary = "Check if login button is clickable",
			responses = { @ApiResponse(responseCode = "200", description = "Successful operation") })
	@RequestMapping(method = RequestMethod.GET, value = "/login-button-click")

	default ResponseEntity<Void> loginButtonClickGet(

	) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

	}

}
