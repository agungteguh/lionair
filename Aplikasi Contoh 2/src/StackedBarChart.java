import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.GradientPaintTransformType;
import org.jfree.ui.RefineryUtilities;
import org.jfree.ui.StandardGradientPaintTransformer;

/**
 * A simple demonstration application showing how to create a stacked bar chart
 * using data from a {@link CategoryDataset}.
 */
public class StackedBarChart extends ApplicationFrame {

    /**
     * Creates a new demo.
     *
     * @param title  the frame title.
     */
    public StackedBarChart(final String title) {
        super(title);
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(590, 350));
        setContentPane(chartPanel);
    }
    
    /**
     * Creates a sample dataset.
     * 
     * @return A sample dataset.
     */
    private CategoryDataset createDataset() {
        DefaultCategoryDataset result = new DefaultCategoryDataset();

        result.addValue(2, "Oktober(1)", "Tires and Wheels");
        result.addValue(0, "Oktober(2)", "APU Indicating System");
        result.addValue(0, "Oktober(3)", "Taxi and Runway Turn Off Lights");
        result.addValue(0, "Oktober(4)", "Exhaust Gas Temperature Indicating");
        result.addValue(0, "Oktober(5)", "Flight Data Recorder (FDR)");
        result.addValue(0, "Oktober(6)", "Ignition Exceter");
        result.addValue(0, "Oktober(7)", "Flight Compartment Conditioned Air Distribution");
        result.addValue(0, "Oktober(8)", "Zone Temperature Control and Indication");
        result.addValue(0, "Oktober(9)", "Traffic Alert and Collision Avoidance System (TCAS)");
     
        result.addValue(0, "November(1)", "Tires and Wheels");
        result.addValue(0, "November(2)", "APU Indicating System");
        result.addValue(0, "November(3)", "Taxi and Runway Turn Off Lights");
        result.addValue(0, "November(4)", "Exhaust Gas Temperature Indicating");
        result.addValue(0, "November(5)", "Flight Data Recorder (FDR)");
        result.addValue(0, "November(6)", "Ignition Exceter");
        result.addValue(0, "November(7)", "Flight Compartment Conditioned Air Distribution");
        result.addValue(0, "November(8)", "Zone Temperature Control and Indication");
        result.addValue(0, "November(9)", "Traffic Alert and Collision Avoidance System (TCAS)");
      

        result.addValue(3, "Desember(1)", "Tires and Wheels");
        result.addValue(3, "Desember(2)", "APU Indicating System");
        result.addValue(2, "Desember(3)", "Taxi and Runway Turn Off Lights");
        result.addValue(1, "Desember(4)", "Exhaust Gas Temperature Indicating");
        result.addValue(1, "Desember(5)", "Flight Data Recorder (FDR)");
        result.addValue(1, "Desember(6)", "Ignition Exceter");
        result.addValue(1, "Desember(7)", "Flight Compartment Conditioned Air Distribution");
        result.addValue(1, "Desember(8)", "Zone Temperature Control and Indication");
        result.addValue(1, "Desember(9)", "Traffic Alert and Collision Avoidance System (TCAS)");
       
        return result;
    }
    
    /**
     * Creates a sample chart.
     * 
     * @param dataset  the dataset for the chart.
     * 
     * @return A sample chart.
     */
    private JFreeChart createChart(final CategoryDataset dataset) {

        final JFreeChart chart = ChartFactory.createStackedBarChart(
            "Top Ten Pirep",  // chart title
            "Category",                  // domain axis label
            "Value",                     // range axis label
            dataset,                     // data
            PlotOrientation.VERTICAL,    // the plot orientation
            true,                        // legend
            true,                        // tooltips
            false                        // urls
        );
        
        GroupedStackedBarRenderer renderer = new GroupedStackedBarRenderer();
        KeyToGroupMap map = new KeyToGroupMap("G1");
        map.mapKeyToGroup("Oktober(1)", "G1");
        map.mapKeyToGroup("Oktober(2)", "G2");
        map.mapKeyToGroup("Oktober(3)", "G3");
        map.mapKeyToGroup("Oktober(4)", "G4");
        map.mapKeyToGroup("Oktober(5)", "G5");
        map.mapKeyToGroup("Oktober(6)", "G6");
        map.mapKeyToGroup("Oktober(7)", "G7");
        map.mapKeyToGroup("Oktober(8)", "G8");
        map.mapKeyToGroup("Oktober(9)", "G9");
        map.mapKeyToGroup("November(1)", "G1");
        map.mapKeyToGroup("November(2)", "G2");
        map.mapKeyToGroup("November(3)", "G3");
        map.mapKeyToGroup("November(4)", "G4");
        map.mapKeyToGroup("November(5)", "G5");
        map.mapKeyToGroup("November(6)", "G6");
        map.mapKeyToGroup("November(7)", "G7");
        map.mapKeyToGroup("November(8)", "G8");
        map.mapKeyToGroup("November(9)", "G9");
        map.mapKeyToGroup("Desember(1)", "G1");
        map.mapKeyToGroup("Desember(2)", "G2");
        map.mapKeyToGroup("Desember(3)", "G3");
        map.mapKeyToGroup("Desember(4)", "G4");
        map.mapKeyToGroup("Desember(5)", "G5");
        map.mapKeyToGroup("Desember(6)", "G6");
        map.mapKeyToGroup("Desember(7)", "G7");
        map.mapKeyToGroup("Desember(8)", "G8");
        map.mapKeyToGroup("Desember(9)", "G9");
        renderer.setSeriesToGroupMap(map); 
        
        renderer.setItemMargin(0.0);
        Paint p1 = new GradientPaint(
            0.0f, 0.0f, new Color(0x22, 0x22, 0xFF), 0.0f, 0.0f, new Color(0x88, 0x88, 0xFF)
        );
        renderer.setSeriesPaint(0, p1);
        renderer.setSeriesPaint(1, p1);
        renderer.setSeriesPaint(2, p1);
        renderer.setSeriesPaint(3, p1);
        renderer.setSeriesPaint(4, p1);
        renderer.setSeriesPaint(5, p1);
        renderer.setSeriesPaint(6, p1);
        renderer.setSeriesPaint(7, p1);
        renderer.setSeriesPaint(8, p1);
        
         
        Paint p2 = new GradientPaint(
            0.0f, 0.0f, new Color(0x22, 0xFF, 0x22), 0.0f, 0.0f, new Color(0x88, 0xFF, 0x88)
        );
        renderer.setSeriesPaint(9, p2); 
        renderer.setSeriesPaint(10, p2); 
        renderer.setSeriesPaint(11, p2);
        renderer.setSeriesPaint(12, p2); 
        renderer.setSeriesPaint(13, p2); 
        renderer.setSeriesPaint(14, p2); 
        renderer.setSeriesPaint(15, p2); 
        renderer.setSeriesPaint(16, p2); 
        renderer.setSeriesPaint(17, p2);
        
        Paint p3 = new GradientPaint(
            0.0f, 0.0f, new Color(0xFF, 0x22, 0x22), 0.0f, 0.0f, new Color(0xFF, 0x88, 0x88)
        );
        renderer.setSeriesPaint(18, p3);
        renderer.setSeriesPaint(19, p3);
        renderer.setSeriesPaint(20, p3);
        renderer.setSeriesPaint(21, p3);
        renderer.setSeriesPaint(22, p3);
        renderer.setSeriesPaint(23, p3);
        renderer.setSeriesPaint(24, p3);
        renderer.setSeriesPaint(25, p3);
        renderer.setSeriesPaint(26, p3);
        renderer.setGradientPaintTransformer(
            new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL)
        );
        
       // SubCategoryAxis domainAxis = new SubCategoryAxis("ATA CATEGORY");
        //domainAxis.setCategoryMargin(0.05);
       // domainAxis.addSubCategory("1");
       // domainAxis.addSubCategory("2");
        //domainAxis.addSubCategory("3");
       
       
      
        
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
      // plot.setDomainAxis(domainAxis);
        //plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        plot.setRenderer(renderer);
        plot.setFixedLegendItems(createLegendItems());
        return chart;
        
    }

    /**
     * Creates the legend items for the chart.  In this case, we set them manually because we
     * only want legend items for a subset of the data series.
     * 
     * @return The legend items.
     */
    private LegendItemCollection createLegendItems() {
        LegendItemCollection result = new LegendItemCollection();
        LegendItem item1 = new LegendItem("Oktober", new Color(0x22, 0x22, 0xFF));
        LegendItem item2 = new LegendItem("November", new Color(0x22, 0xFF, 0x22));
        LegendItem item3 = new LegendItem("Desember", new Color(0xFF, 0x22, 0x22));
        result.add(item1);
        result.add(item2);
        result.add(item3);
        return result;
    }
    
    // ****************************************************************************
    // * JFREECHART DEVELOPER GUIDE                                               *
    // * The JFreeChart Developer Guide, written by David Gilbert, is available   *
    // * to purchase from Object Refinery Limited:                                *
    // *                                                                          *
    // * http://www.object-refinery.com/jfreechart/guide.html                     *
    // *                                                                          *
    // * Sales are used to provide funding for the JFreeChart project - please    * 
    // * support us so that we can continue developing free software.             *
    // ****************************************************************************
    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
 
}