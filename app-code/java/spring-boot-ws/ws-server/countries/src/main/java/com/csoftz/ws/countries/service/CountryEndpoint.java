/*----------------------------------------------------------------------------*/
/* Source File:   COUNTRYENDPOINT.JAVA                                        */
/* Description:   Entry point to attend SOAP Requests.                        */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Feb.25/2018                                                 */
/* Last Modified: Feb.25/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2018 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Feb.25/2018  COQ  File created.
 -----------------------------------------------------------------------------*/

package com.csoftz.ws.countries.service;

import com.csoftz.ws.countries.domain.GetCountryRequest;
import com.csoftz.ws.countries.domain.GetCountryResponse;
import com.csoftz.ws.countries.repository.CountryRepository;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Entry point to attend SOAP Requests.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Feb.25/2018
 * @since 1.8 (JDK), Feb.25/2018
 */

@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://csoftz.com/ws/countries/domain";
    private CountryRepository countryRepository;

    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    /**
     * Handles the request to request a country information.
     *
     * @param request Holds the object that has the information to look for.
     * @return The Country information wrapped inside a Country Response object.
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));

        return response;
    }
}
