package dz.imdrissi.labs.spring.config;

import dz.imdrissi.labs.spring.model.CountryLanguageId;
import org.springframework.core.convert.converter.Converter;

public class CountryLanguageIdConverter implements Converter<String, CountryLanguageId> {

    /**
     * @param id countryCode-languageCode
     * @return CountryLanguageId
     */
    @Override
    public CountryLanguageId convert(String id) {
        String[] strings = id.split("-");
        return new CountryLanguageId(strings[0], strings[1]);
    }
}
