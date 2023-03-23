import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;

public class URLClassTest extends TradingTest{

public static void urlList() throws IOException {
    
    URL linkAPPL = new URL("https://www.google.com/finance/quote/AAPL:NASDAQ");
    URL linkMSFT = new URL("https://www.google.com/finance/quote/MSFT:NASDAQ");
    URL linkAMZN = new URL("https://www.google.com/finance/quote/AMZN:NASDAQ");
    URL linkFB = new URL("https://www.google.com/finance/quote/FB:NASDAQ");
    URL linkGOOGL = new URL("https://www.google.com/finance/quote/GOOGL:NASDAQ");
    URL linkGOOG = new URL("https://www.google.com/finance/quote/GOOG:NASDAQ");
    URL linkTSLA = new URL("https://www.google.com/finance/quote/TSLA:NASDAQ");
    URL linkNVDA = new URL("https://www.google.com/finance/quote/NVDA:NASDAQ");
    URL linkBRKB = new URL("https://www.google.com/finance/quote/BRK.B:NYSE");
    URL linkJPM = new URL("https://www.google.com/finance/quote/JPM:NYSE");
}

}