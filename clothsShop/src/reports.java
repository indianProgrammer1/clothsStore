import com.google.gson.Gson;
import java.util.List;

public class reports implements IReportable{

    public void generateReport(){}
    public void itemsReport(){}
    public void customersReport(){}

    public String generateSalesReportByProduct(String productId) {
        List<Sale> sales = salesManager.getSalesByProduct(productId);
        Gson gson = new Gson();
        return gson.toJson(sales);
}

