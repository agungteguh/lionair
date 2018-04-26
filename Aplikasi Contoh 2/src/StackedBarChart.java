import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import static java.lang.Math.floor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
//import java.util.logging;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.GradientPaintTransformType;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RefineryUtilities;
import org.jfree.ui.StandardGradientPaintTransformer;
import org.jfree.ui.TextAnchor;

/**
 * A simple demonstration application showing how to create a stacked bar chart
 * using data from a {@link CategoryDataset}.
 */
public class StackedBarChart extends ApplicationFrame {
     int a = 0,b = 0,c = 0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0,aa=0;
     int bulan_end=form_data_barang.month,bulan_teng=0,bulan_awal=0;
     int year_teng=0,year_awal=0;
     int cek1= bulan_end-1;
     int cek2= bulan_end-2;
     String bulan_akhir = "N/A";
     String bulan_mid = "N/A";
     String bulan_start = "N/A";
    /**
     * Creates a new demo.
     *
     * @param title  the frame title.
     */
    public StackedBarChart(final String title) throws IOException {
        super(title);
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(590, 350));
        //chartPanel.createImage(100, 100);
        if(form_data_barang.cekpdf){
        try {
         OutputStream out = new FileOutputStream("D:\\Project\\grafik.png");
         ChartUtilities.writeChartAsPNG(out,
            chart,
            600,
            400);

        } catch (IOException ex) {
            System.err.println("koneksi gagal" +ex.getMessage());
        }
        }
        setContentPane(chartPanel);
         String yourText = "32-45"+"        " +"49-72"+"        " +"33-45"+"        " +"77-21"+"        " 
            +"31-31"+"        " +"74-11"+"        " +"21-22"+"        " +"21-61"+"        " +"34-45";
   final BufferedImage image = ImageIO.read(new File("D:\\Project\\grafik.png"));
    Graphics graphics = image.getGraphics();
    //graphics.setColor(Color.LIGHT_GRAY);
   // graphics.fillRect(0, 0, 200, 50);
    graphics.setColor(Color.BLACK);
    graphics.setFont(new Font("Arial", Font.PLAIN, 12));
    graphics.drawString(yourText, 70, 390);
    //Graphics2D g2;
    graphics.drawRect(0, 0, 599, 399);
    float alpha = (float) 0.3;
    Color color = new Color(0, 0, 0, alpha); //Red 
    graphics.setColor(color);
    graphics.drawLine(60, 280, 60, 395);
    graphics.drawLine(115, 280, 115, 395);
    graphics.drawLine(170, 280, 170, 395);
    graphics.drawLine(225, 280, 225, 395);
    graphics.drawLine(285, 280, 285, 395);
    graphics.drawLine(335, 280, 335, 395);
    graphics.drawLine(390, 280, 390, 395);
    graphics.drawLine(455, 280, 455, 395);
    graphics.drawLine(510, 280, 510, 395);
    graphics.drawLine(575, 280, 575, 395);
   
    
    ImageIO.write(image,  "png", new File("D:\\Project\\grafik.png"));
    }
    
    /**
     * Creates a sample dataset.
     * 
     * @return A sample dataset.
     */
    private CategoryDataset createDataset() {
     if(form_data_barang.month !=0){
     if(cek2<=0){
     year_awal=form_data_barang.year-1;
     bulan_awal=12+cek2;
     }
     else{
     bulan_awal=form_data_barang.month-2;
     year_awal=form_data_barang.year;
     }
     if(cek1<=0){
     year_teng=form_data_barang.year-1;
     bulan_teng=12+cek1;
     }
     else{
     bulan_teng=form_data_barang.month-1;
     year_teng=form_data_barang.year;
     }
     }
        String sql = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_awal+" and year(dates)="+year_awal+" and ata=\"32-45\"";
        String sql1 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_teng+" and year(dates)="+year_teng+" and ata=\"32-45\"";
        String sql2 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_end+" and year(dates)="+form_data_barang.year+" and ata=\"32-45\"";
        String sql3 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_awal+" and year(dates)="+year_awal+" and ata=\"49-72\"";
        String sql4 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_teng+" and year(dates)="+year_teng+" and ata=\"49-72\"";
        String sql5 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_end+" and year(dates)="+form_data_barang.year+" and ata=\"49-72\"";
        String sql6 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_awal+" and year(dates)="+year_awal+" and ata=\"33-45\"";
        String sql7 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_teng+" and year(dates)="+year_teng+" and ata=\"33-45\"";
        String sql8 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_end+" and year(dates)="+form_data_barang.year+" and ata=\"33-45\"";
        String sql9 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_awal+" and year(dates)="+year_awal+" and ata=\"77-21\"";
        String sql10 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_teng+" and year(dates)="+year_teng+" and ata=\"77-21\"";
        String sql11 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_end+" and year(dates)="+form_data_barang.year+" and ata=\"77-21\"";
        String sql12 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_awal+" and year(dates)="+year_awal+" and ata=\"31-31\"";
        String sql13 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_teng+" and year(dates)="+year_teng+" and ata=\"31-31\"";
        String sql14 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_end+" and year(dates)="+form_data_barang.year+" and ata=\"31-31\"";
        String sql15 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_awal+" and year(dates)="+year_awal+" and ata=\"74-11\"";
        String sql16 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_teng+" and year(dates)="+year_teng+" and ata=\"74-11\"";
        String sql17 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_end+" and year(dates)="+form_data_barang.year+" and ata=\"74-11\"";
        String sql18 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_awal+" and year(dates)="+year_awal+" and ata=\"21-22\"";
        String sql19 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_teng+" and year(dates)="+year_teng+" and ata=\"21-22\"";
        String sql20 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_end+" and year(dates)="+form_data_barang.year+" and ata=\"21-22\"";
        String sql21 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_awal+" and year(dates)="+year_awal+" and ata=\"21-61\"";
        String sql22 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_teng+" and year(dates)="+year_teng+" and ata=\"21-61\"";
        String sql23 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_end+" and year(dates)="+form_data_barang.year+" and ata=\"21-61\"";
        String sql24 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_awal+" and year(dates)="+year_awal+" and ata=\"34-45\"";
        String sql25 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_teng+" and year(dates)="+year_teng+" and ata=\"34-45\"";
        String sql26 = "SELECT count(*) as jumlah FROM pirep2_data where aircraftreg2='"+form_data_barang.acreg+"' and month(dates)="+bulan_end+" and year(dates)="+form_data_barang.year+" and ata=\"34-45\"";
       
        Connection koneksi = new koneksi().getConnection();
        //Connection koneksi1 = new koneksi().getConnection();
        //Connection koneksi2 = new koneksi().getConnection();
        try {
            Statement stat = koneksi.createStatement();
            Statement stat1 = koneksi.createStatement();
            Statement stat2 = koneksi.createStatement();
            Statement stat3 = koneksi.createStatement();
            Statement stat4 = koneksi.createStatement();
            Statement stat5 = koneksi.createStatement();
            Statement stat6 = koneksi.createStatement();
            Statement stat7 = koneksi.createStatement();
            Statement stat8 = koneksi.createStatement();
            Statement stat9 = koneksi.createStatement();
            Statement stat10 = koneksi.createStatement();
            Statement stat11 = koneksi.createStatement();
            Statement stat12 = koneksi.createStatement();
            Statement stat13 = koneksi.createStatement();
            Statement stat14 = koneksi.createStatement();
            Statement stat15 = koneksi.createStatement();
            Statement stat16 = koneksi.createStatement();
            Statement stat17 = koneksi.createStatement();
            Statement stat18 = koneksi.createStatement();
            Statement stat19 = koneksi.createStatement();
            Statement stat20 = koneksi.createStatement();
            Statement stat21 = koneksi.createStatement();
            Statement stat22 = koneksi.createStatement();
            Statement stat23 = koneksi.createStatement();
            Statement stat24 = koneksi.createStatement();
            Statement stat25 = koneksi.createStatement();
            Statement stat26 = koneksi.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            ResultSet hasil1 = stat1.executeQuery(sql1);
            ResultSet hasil2 = stat2.executeQuery(sql2);
            ResultSet hasil3 = stat3.executeQuery(sql3);
            ResultSet hasil4 = stat4.executeQuery(sql4);
            ResultSet hasil5 = stat5.executeQuery(sql5);
            ResultSet hasil6 = stat6.executeQuery(sql6);
            ResultSet hasil7 = stat7.executeQuery(sql7);
            ResultSet hasil8 = stat8.executeQuery(sql8);
            ResultSet hasil9 = stat9.executeQuery(sql9);
            ResultSet hasil10 = stat10.executeQuery(sql10);
            ResultSet hasil11 = stat11.executeQuery(sql11);
            ResultSet hasil12 = stat12.executeQuery(sql12);
            ResultSet hasil13 = stat13.executeQuery(sql13);
            ResultSet hasil14 = stat14.executeQuery(sql14); 
            ResultSet hasil15 = stat15.executeQuery(sql15);
            ResultSet hasil16 = stat16.executeQuery(sql16);
            ResultSet hasil17 = stat17.executeQuery(sql17);
            ResultSet hasil18 = stat18.executeQuery(sql18);
            ResultSet hasil19 = stat19.executeQuery(sql19);
            ResultSet hasil20 = stat20.executeQuery(sql20); 
            ResultSet hasil21 = stat21.executeQuery(sql21);
            ResultSet hasil22 = stat22.executeQuery(sql22);
            ResultSet hasil23 = stat23.executeQuery(sql23); 
            ResultSet hasil24 = stat24.executeQuery(sql24);
            ResultSet hasil25 = stat25.executeQuery(sql25);
            ResultSet hasil26 = stat26.executeQuery(sql26); 
           
            if (hasil.next()) {
            a = hasil.getInt(1);
            } 
            if (hasil1.next()) {
            b = hasil1.getInt(1);
            } 
            if (hasil2.next()) {
            c = hasil2.getInt(1);
           }
            if (hasil3.next()) {
            d = hasil3.getInt(1);
           }
            if (hasil4.next()) {
            e = hasil4.getInt(1);
           }
            if (hasil5.next()) {
            f = hasil5.getInt(1);
           } 
            if (hasil6.next()) {
            g = hasil6.getInt(1);
           }
            if (hasil7.next()) {
            h = hasil7.getInt(1);
           }
            if (hasil8.next()) {
            i = hasil8.getInt(1);
           } 
            if (hasil9.next()) {
            j = hasil9.getInt(1);
            } 
            if (hasil10.next()) {
            k = hasil10.getInt(1);
            } 
            if (hasil11.next()) {
            l = hasil11.getInt(1);
           }
            if (hasil12.next()) {
            m = hasil12.getInt(1);
            } 
            if (hasil13.next()) {
            n = hasil13.getInt(1);
            } 
            if (hasil14.next()) {
            o = hasil14.getInt(1);
           }
            if (hasil15.next()) {
            p = hasil15.getInt(1);
            } 
            if (hasil16.next()) {
            q = hasil16.getInt(1);
            } 
            if (hasil17.next()) {
            r = hasil17.getInt(1);
           }
            if (hasil18.next()) {
            s = hasil18.getInt(1);
            } 
            if (hasil19.next()) {
            t = hasil19.getInt(1);
            } 
            if (hasil20.next()) {
            u = hasil20.getInt(1);
           }
            if (hasil21.next()) {
            v = hasil21.getInt(1);
            } 
            if (hasil22.next()) {
            w = hasil22.getInt(1);
            } 
            if (hasil23.next()) {
            x = hasil23.getInt(1);
           }
            if (hasil24.next()) {
            y = hasil24.getInt(1);
            } 
            if (hasil25.next()) {
            z = hasil25.getInt(1);
            } 
            if (hasil26.next()) {
            aa = hasil26.getInt(1);
           }
            koneksi.close();
           //System.out.print(Integer.toString(aa));
            //koneksi1.close();
            //koneksi2.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
      
   if(bulan_end==12){
   bulan_akhir="Dec-";
   }
   else if(bulan_end==11){
   bulan_akhir="Nov-";
   }
   else if(bulan_end==10){
   bulan_akhir="Oct-";
   }
     else if(bulan_end==9){
   bulan_akhir="Sep-";
   }
    else if(bulan_end==8){
   bulan_akhir="Aug-";
   }
     else if(bulan_end==7){
   bulan_akhir="Jul-";
   }
     else if(bulan_end==6){
   bulan_akhir="Jun-";
   }
     else if(bulan_end==5){
   bulan_akhir="May-";
   }
     else if(bulan_end==4){
   bulan_akhir="Apr-";
   }
     else if(bulan_end==3){
   bulan_akhir="Mar-";
   }
     else if(bulan_end==2){
   bulan_akhir="Feb-";
   }
     else if(bulan_end==1){
   bulan_akhir="Jan-";
   }
   //String bulan_mid=null;
   if(bulan_teng==12){
   bulan_mid="Dec-";
   }
   else if(bulan_teng==11){
   bulan_mid="Nov-";
   }
   else if(bulan_teng==10){
   bulan_mid="Oct-";
   }
     else if(bulan_teng==9){
   bulan_mid="Sept-";
   }
    else if(bulan_teng==8){
   bulan_mid="Aug-";
   }
     else if(bulan_teng==7){
   bulan_mid="Jul-";
   }
     else if(bulan_teng==6){
   bulan_mid="Jun-";
   }
     else if(bulan_teng==5){
   bulan_mid="May-";
   }
     else if(bulan_teng==4){
   bulan_mid="Apr-";
   }
     else if(bulan_teng==3){
   bulan_mid="Mar-";
   }
     else if(bulan_teng==2){
   bulan_mid="Feb-";
   }
     else if(bulan_teng==1){
   bulan_mid="Jan-";
   }
   //String bulan_start=null;
   if(bulan_awal==12){
   bulan_start="Dec-";
   }
   else if(bulan_awal==11){
   bulan_start="Nov-";
   }
   else if(bulan_awal==10){
   bulan_start="Oct-";
   }
     else if(bulan_awal==9){
   bulan_start="Sep-";
   }
    else if(bulan_awal==8){
   bulan_start="Aug-";
   }
     else if(bulan_awal==7){
   bulan_start="Jul-";
   }
     else if(bulan_awal==6){
   bulan_start="Jun-";
   }
     else if(bulan_awal==5){
   bulan_start="May-";
   }
     else if(bulan_awal==4){
   bulan_start="Apr-";
   }
     else if(bulan_awal==3){
   bulan_start="Mar-";
   }
     else if(bulan_awal==2){
   bulan_start="Feb-";
   }
     else if(bulan_awal==1){
   bulan_start="Jan-";
   }
   

        DefaultCategoryDataset result = new DefaultCategoryDataset();

        result.addValue(a, bulan_start+"(1)", "Tires and Wheels");
        result.addValue(d, bulan_start+"(2)", "APU Indicating System");
        result.addValue(g, bulan_start+"(3)", "Taxi and Runway Turn Off Lights");
        result.addValue(j, bulan_start+"(4)", "Exhaust Gas Temperature Indicating");
        result.addValue(m, bulan_start+"(5)", "Flight Data Recorder (FDR)");
        result.addValue(p, bulan_start+"(6)", "Ignition Exceter");
        result.addValue(s, bulan_start+"(7)", "Flight Compartment Conditioned Air Distribution");
        result.addValue(v, bulan_start+"(8)", "Zone Temperature Control and Indication");
        result.addValue(y, bulan_start+"(9)", "Traffic Alert and Collision Avoidance System (TCAS)");
     
        result.addValue(b, bulan_mid+"(1)", "Tires and Wheels");
        result.addValue(e, bulan_mid+"(2)", "APU Indicating System");
        result.addValue(h, bulan_mid+"(3)", "Taxi and Runway Turn Off Lights");
        result.addValue(k, bulan_mid+"(4)", "Exhaust Gas Temperature Indicating");
        result.addValue(n, bulan_mid+"(5)", "Flight Data Recorder (FDR)");
        result.addValue(q, bulan_mid+"(6)", "Ignition Exceter");
        result.addValue(t, bulan_mid+"(7)", "Flight Compartment Conditioned Air Distribution");
        result.addValue(w, bulan_mid+"(8)", "Zone Temperature Control and Indication");
        result.addValue(z, bulan_mid+"(9)", "Traffic Alert and Collision Avoidance System (TCAS)");
      

        result.addValue(c, bulan_akhir+"(1)", "Tires and Wheels");
        result.addValue(f, bulan_akhir+"(2)", "APU Indicating System");
        result.addValue(i, bulan_akhir+"(3)", "Taxi and Runway Turn Off Lights");
        result.addValue(l, bulan_akhir+"(4)", "Exhaust Gas Temperature Indicating");
        result.addValue(o, bulan_akhir+"(5)", "Flight Data Recorder (FDR)");
        result.addValue(r, bulan_akhir+"(6)", "Ignition Exceter");
        result.addValue(u, bulan_akhir+"(7)", "Flight Compartment Conditioned Air Distribution");
        result.addValue(x, bulan_akhir+"(8)", "Zone Temperature Control and Indication");
        result.addValue(aa,bulan_akhir+"(9)", "Traffic Alert and Collision Avoidance System (TCAS)");
       
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
        TextTitle my_Chart_title=new TextTitle("Top 10 Pirep "+form_data_barang.acreg, new Font ("Arial", Font.BOLD , 14));
        final JFreeChart chart = ChartFactory.createStackedBarChart(
            "Top Ten Pirep "+form_data_barang.acreg,  // chart title
            "\n\n",                  // domain axis label
            "",                     // range axis label
            dataset,                     // data
            PlotOrientation.VERTICAL,    // the plot orientation
            true,                        // legend
            true,                        // tooltips
            false                        // urls
        );
        chart.setTitle(my_Chart_title);
        chart.getTitle().setPadding(2, 2, 5, 2);
        //chart.setBackgroundPaint(Color.white);
       // chart.getTitle().setFont("SansSerif", Font.BOLD, 10);
        GroupedStackedBarRenderer renderer = new GroupedStackedBarRenderer();
        KeyToGroupMap map = new KeyToGroupMap("G1");
        map.mapKeyToGroup(bulan_start+"(1)", "G1");
        map.mapKeyToGroup(bulan_start+"(2)", "G2");
        map.mapKeyToGroup(bulan_start+"(3)", "G3");
        map.mapKeyToGroup(bulan_start+"(4)", "G4");
        map.mapKeyToGroup(bulan_start+"(5)", "G5");
        map.mapKeyToGroup(bulan_start+"(6)", "G6");
        map.mapKeyToGroup(bulan_start+"(7)", "G7");
        map.mapKeyToGroup(bulan_start+"(8)", "G8");
        map.mapKeyToGroup(bulan_start+"(9)", "G9");
        map.mapKeyToGroup(bulan_mid+"(1)", "G1");
        map.mapKeyToGroup(bulan_mid+"(2)", "G2");
        map.mapKeyToGroup(bulan_mid+"(3)", "G3");
        map.mapKeyToGroup(bulan_mid+"(4)", "G4");
        map.mapKeyToGroup(bulan_mid+"(5)", "G5");
        map.mapKeyToGroup(bulan_mid+"(6)", "G6");
        map.mapKeyToGroup(bulan_mid+"(7)", "G7");
        map.mapKeyToGroup(bulan_mid+"(8)", "G8");
        map.mapKeyToGroup(bulan_mid+"(9)", "G9");
        map.mapKeyToGroup(bulan_end+"(1)", "G1");
        map.mapKeyToGroup(bulan_end+"(2)", "G2");
        map.mapKeyToGroup(bulan_end+"(3)", "G3");
        map.mapKeyToGroup(bulan_end+"(4)", "G4");
        map.mapKeyToGroup(bulan_end+"(5)", "G5");
        map.mapKeyToGroup(bulan_end+"(6)", "G6");
        map.mapKeyToGroup(bulan_end+"(7)", "G7");
        map.mapKeyToGroup(bulan_end+"(8)", "G8");
        map.mapKeyToGroup(bulan_end+"(9)", "G9");
        renderer.setSeriesToGroupMap(map); 
        
        renderer.setItemMargin(-3);
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
        
         
        Paint p2 =  new GradientPaint(
            0.0f, 0.0f, new Color(0xFF, 0x22, 0x22), 0.0f, 0.0f, new Color(0xFF, 0x88, 0x88)
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
            0.0f, 0.0f, new Color(0x22, 0xFF, 0x22), 0.0f, 0.0f, new Color(0x88, 0xFF, 0x88)
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
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(true);
        ItemLabelPosition position = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE9, 
                TextAnchor.TOP_CENTER);
        renderer.setBasePositiveItemLabelPosition(position);
        renderer.setItemLabelAnchorOffset(-10);
        //renderer.setItemMargin(.1);
       // renderer.setMaximumBarWidth(0.01);
       //SubCategoryAxis domainAxis = new SubCategoryAxis("ATA CATEGORY");
        //domainAxis.setCategoryMargin(0.05);
       // domainAxis.addSubCategory("1");
       // domainAxis.addSubCategory("2");
        //domainAxis.addSubCategory("3");
       
       
      
        
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        CategoryAxis xAxis = (CategoryAxis)plot.getDomainAxis();
        ValueAxis range = plot.getRangeAxis();
        range.setAxisLineVisible(false);
        xAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_90);
        xAxis.setMaximumCategoryLabelLines(3);
       // xAxis.setMinorTickMarksVisible(true);
       // xAxis.setMaximumCategoryLabelWidthRatio(1);
        //xAxis.setCategoryLabelPositionOffset(100);
        Font font3 = new Font("Arial", Font.PLAIN, 10);
        xAxis.setLabelFont(font3); 
        xAxis.setTickMarksVisible(false);
       // xAxis.setFixedDimension(40);
        LegendTitle legend = chart.getLegend();
        legend.setItemFont(font3);
        legend.setPosition(RectangleEdge.TOP);
        legend.setBorder(0, 0, 0, 0); 
        legend.setPadding(2, 2, 3, 2);
       
      // plot.setDomainAxis(domainAxis);
        //plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        plot.getDomainAxis().setLabelFont(font3);
        plot.getRangeAxis().setLabelFont(font3);
       // plot.setRangeZeroBaselineVisible(false);
        plot.setBackgroundPaint(Color.white);
        plot.setDomainGridlinePaint(Color.black);
        plot.setRangeGridlinePaint(Color.black);
     //   plot.setRangeCrosshairPaint(Color.black);
       // plot.setRangeMinorGridlinesVisible(true);
        //plot.setDomainGridlinesVisible(true);
        plot.setOutlineVisible(false);
        //plot.setDomainGridlineStroke(stroke);
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
        LegendItem item1 = new LegendItem(bulan_start+year_awal, new Color(0x22, 0x22, 0xFF));
        LegendItem item2 = new LegendItem(bulan_mid+year_teng, new Color(0xFF, 0x22, 0x22));
        LegendItem item3 = new LegendItem(bulan_akhir+form_data_barang.year, new Color(0x22, 0xFF, 0x22));
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