/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BubbleChartModel;
import org.primefaces.model.chart.BubbleChartSeries;

/**
 *
 * @author tmp_samb2639
 */
public class BubbleBean {

    private BubbleChartModel model;

    /**
     * Creates a new instance of BubbleBean
     */
    public BubbleBean() {

        model = new BubbleChartModel();
        model.add(new BubbleChartSeries("Acura", 70, 183, 55));
        model.add(new BubbleChartSeries("Alfa Romeo", 45, 92, 36));
        model.add(new BubbleChartSeries("AM General", 24, 104, 40));
        model.add(new BubbleChartSeries("Bugatti", 50, 123, 60));
        model.add(new BubbleChartSeries("BMW", 15, 89, 25));
        model.add(new BubbleChartSeries("Audi", 40, 180, 80));
        model.add(new BubbleChartSeries("Aston Martin", 70, 70, 48));
        model.setTitle("Bubble Chart");
        model.getAxis(AxisType.X).setLabel("Price");
        Axis yAxis = model.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(250);
        yAxis.setLabel("Labels");
    }

    public BubbleChartModel getModel() {
        return model;
    }

}
