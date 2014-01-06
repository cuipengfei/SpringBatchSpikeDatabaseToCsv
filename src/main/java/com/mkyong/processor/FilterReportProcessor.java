package com.mkyong.processor;

import com.mkyong.model.Person;
import org.springframework.batch.item.ItemProcessor;

//run before writing
public class FilterReportProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person item) throws Exception {
        return item;
    }
}