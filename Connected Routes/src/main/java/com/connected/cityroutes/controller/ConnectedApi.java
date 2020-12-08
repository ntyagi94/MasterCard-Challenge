package com.connected.cityroutes.controller;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-01T16:40:35.336-04:00")

@Api(value = "connected", description = "the connected API")

public interface ConnectedApi {

	@ApiOperation(value = "Find out is a route is available", notes = "Find out is a route is available", response = String.class, tags = {
	    "connected", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = String.class),
	    @ApiResponse(code = 400, message = "Invalid Request", response = Void.class) })

	@RequestMapping(value = "/connected", produces = { "application/json" }, method = RequestMethod.GET)
	default ResponseEntity<String> connected(
	    @NotNull @ApiParam(value = "City name at the start of the route.", required = true) @RequestParam(value = "origin", required = true) String origin,
	    @NotNull @ApiParam(value = "City name at the end of the route.", required = true) @RequestParam(value = "destination", required = true) String destination) {
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
