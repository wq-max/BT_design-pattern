package chart;

public class Client {

    public static void main(String[] args) {
        Chart chart;
        String type = XMLUtil.getChartType();
        assert type != null;
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}
