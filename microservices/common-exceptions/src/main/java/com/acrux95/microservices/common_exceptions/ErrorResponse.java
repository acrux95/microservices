package com.acrux95.microservices.common_exceptions;

import java.util.Map;

public record ErrorResponse(Map<String,String> error) {

}
