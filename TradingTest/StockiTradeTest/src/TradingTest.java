import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * A simple program for printing the prices for the 
 * S and P 500 top 10 stocks by weight
 * Extrodinarily simple version
 * Still needs an OOP element
 * this is a mess but i got it working. 
 */
public class TradingTest {

public static int inUse;
    public static void main(String[] args) throws IOException{

    final String SYM2 = "MSFT";
    final String SYM = "AAPL"; // Stock name to look for
    URL urlAAPL = new URL("https://www.google.com/finance/quote/AAPL:NASDAQ"); //URL LIST FOR CHOSENSTOCKS
    URL urlMSFT = new URL("https://www.google.com/finance/quote/MSFT:NASDAQ");
    URL urlAMZN = new URL("https://www.google.com/finance/quote/AMZN:NASDAQ");
    URL urlFB = new URL("https://www.google.com/finance/quote/FB:NASDAQ");
    URL urlGOOGL = new URL("https://www.google.com/finance/quote/GOOGL:NASDAQ");
    URL urlGOOG = new URL("https://www.google.com/finance/quote/GOOG:NASDAQ");
    URL urlTSLA = new URL("https://www.google.com/finance/quote/TSLA:NASDAQ");
    URL urlNVDA = new URL("https://www.google.com/finance/quote/NVDA:NASDAQ");
    URL urlBRKB = new URL("https://www.google.com/finance/quote/BRK.B:NYSE");
    URL urlJPM = new URL("https://www.google.com/finance/quote/JPM:NYSE");
    // Trying to find a better way to call and store the URL list rather than in main
    
    URLConnection urlconnAPPL = urlAAPL.openConnection(); // creating connection to APPL
    URLConnection urlconnMSFT = urlMSFT.openConnection(); // connection to MSFT
    URLConnection urlconnAMZN = urlAMZN.openConnection(); // connection to AMZN
    InputStreamReader inStreamAPPL = new InputStreamReader(urlconnAPPL.getInputStream()); // 
    InputStreamReader inStreamMSFT = new InputStreamReader(urlconnMSFT.getInputStream());
    InputStreamReader inStreamAMZN = new InputStreamReader(urlconnAMZN.getInputStream());
    BufferedReader buffAPPL = new BufferedReader(inStreamAPPL);
    BufferedReader buffMSFT = new BufferedReader(inStreamMSFT);
    BufferedReader buffAMZN = new BufferedReader(inStreamAMZN);
    String priceAPPL = "not found";
    String priceMSFT = "not found";
    String priceAMZN = "not found";
    String lineAPPL = buffAPPL.readLine();
    String lineMSFT = buffMSFT.readLine();
    String lineAMZN = buffAMZN.readLine();
    
    while(lineAPPL != null) {
        if (lineAPPL.contains("[\"AAPL\",")) {
            int target = lineAPPL.indexOf("[\"AAPL\",");
            int deci = lineAPPL.indexOf(".", target);
            int start = deci;
            while(lineAPPL.charAt(start) != '\"') {
                start--;
            }    
            priceAPPL = lineAPPL.substring(start +3, deci + 3);
    }
        lineAPPL = buffAPPL.readLine();
    }
    System.out.print("Apple price: " + priceAPPL + ", ");
    // buffer line========================================- will eventually delete
    while(lineMSFT != null) {
        if (lineMSFT.contains("[\"MSFT\",")) {
            int target = lineMSFT.indexOf("[\"MSFT\",");
            int deci = lineMSFT.indexOf(".", target);
            int start = deci;
            while(lineMSFT.charAt(start) != '\"') {
                start--;
            }    
            priceMSFT = lineMSFT.substring(start +3, deci + 3);
    }
        lineMSFT = buffMSFT.readLine();
    }
    System.out.print("Microsoft price: " + priceMSFT + ", ");
// buffer line ============================================= will eventually delete
    while(lineAMZN != null) {
        if (lineAMZN.contains("[\"AMZN\",")) {
            int target = lineAMZN.indexOf("[\"AMZN\",");
            int deci = lineAMZN.indexOf(",[", target);
            int start = deci;
            while(lineAMZN.charAt(start) != '\"') {
                start--;
            }    
            priceAMZN = lineAMZN.substring(start + 3 , deci + 9);
    }
        lineAMZN = buffAMZN.readLine();
    }
    System.out.print("Amazon price: " + priceAMZN + " ");
    

}
    
/**
 * Trying differnt methods to store URL data
 * URLS need to be able to be called and print the correct price 
 * 
 */
//public static listOfStocks(String[] stocks) {
    //String stockNames[] = {"AAPL", "MSFT", "AMZN", "FB", "GOOGL", "GOOG",
    //"TSLA", "NVDA", "BRK.B", "JPM"};

    //inUse = 0;
//String getContents (int position) {
    //String content = null;
    //if (position < inUse) {
        //content = stockNames[position];
    //}
    //return content;
    //}


}




    

