/*----------------------------------------------------------------------------*/
/* Source File:   COUNTRYREPOSITORY.JAVA                                      */
/* Description:   Provides Country data to the web service.                   */
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

package com.csoftz.ws.countries.repository;

import com.csoftz.ws.countries.domain.Country;
import com.csoftz.ws.countries.domain.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Provides Country data to the web service.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Feb.25/2018
 * @since 1.8 (JDK), Feb.25/2018
 */

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    /**
     * Creates a data in memory for countries.
     */
    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        countries.put(uk.getName(), uk);
    }

    /**
     * Find a country given its name.
     *
     * @param name What to look for.
     * @return The Country object.
     */
    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }

}
