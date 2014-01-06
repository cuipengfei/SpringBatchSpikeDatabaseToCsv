package com.mkyong.processor;

import com.mkyong.model.Report;
import org.springframework.batch.item.ItemProcessor;

//run before writing
public class FilterReportProcessor implements ItemProcessor<Report, Report> {

    @Override
    public Report process(Report item) throws Exception {
        return item;
    }

}