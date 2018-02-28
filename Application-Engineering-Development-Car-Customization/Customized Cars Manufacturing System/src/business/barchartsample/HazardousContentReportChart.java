/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.barchartsample;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author sonalichaudhari
 */
public class HazardousContentReportChart {

    private Report report;
    private JFreeChart barChart;

    public HazardousContentReportChart(String applicationTitle, String chartTitle, Report report) {
        //super(applicationTitle);
        this.report = report;
        this.barChart = ChartFactory.createBarChart3D(
                chartTitle,
                "CAR COMPONENTS",
                "LEVEL OF CONTENTS",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);
    }

    public ChartPanel getChartPanel() {
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 350));
        return chartPanel;
    }

    private CategoryDataset createDataset() {
        final String airFilter = "AIR FILTERS";
        final String engine = "ENGINE";
        final String paint = "PAINT";
        final String fuel = "FUEL";
        final String lead = "Lead";
        final String carbonMonoxide = "Carbon Monoxide";
        final String formaldehyde = "Formaldehyde";
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //adding values to the dataset 
        dataset.addValue(report.getLeadAirFilter(), lead, airFilter);
        dataset.addValue(report.getLeadEngine(), lead, engine);
        dataset.addValue(report.getLeadPaint(), lead, paint);
        dataset.addValue(report.getLeadFuel(), lead, fuel);

        dataset.addValue(report.getCmAirFilter(), carbonMonoxide, airFilter);
        dataset.addValue(report.getCmEngine(), carbonMonoxide, engine);
        dataset.addValue(report.getCmPaint(), carbonMonoxide, paint);
        dataset.addValue(report.getCmFuel(), carbonMonoxide, fuel);

        dataset.addValue(report.getFmdhAirFilter(), formaldehyde, airFilter);
        dataset.addValue(report.getFmdhEngine(), formaldehyde, engine);
        dataset.addValue(report.getFmdhPaint(), formaldehyde, paint);
        dataset.addValue(report.getFmdhFuel(), formaldehyde, fuel);

        return dataset;
    }

}
