/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author tmp_samb2639
 */
@javax.faces.bean.ManagedBean
@SessionScoped
public class ManagedBean implements Serializable {

    private BarChartModel model;

    /**
     * Creates a new instance of ManagedBean
     */
    public ManagedBean() {
        model = new BarChartModel();
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 135);
        girls.set("2008", 120);
        model.addSeries(boys);
        model.addSeries(girls);
        model.setTitle("Bar Chart");
        model.setLegendPosition("ne");
        Axis xAxis = model.getAxis(AxisType.X);
        xAxis.setLabel("Gender");
        Axis yAxis = model.getAxis(AxisType.Y);
        yAxis.setLabel("Births");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }

    public BarChartModel getModel() {
        return model;
    }
}

