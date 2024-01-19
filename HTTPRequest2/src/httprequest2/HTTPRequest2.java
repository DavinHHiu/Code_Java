/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package httprequest2;

import java.io.IOException;
import org.apache.commons.io.IOUtil;
import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.entity.mime.Header;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpResponse;

public class HTTPRequest2 {
    public static void main(String[] args) throws ClientProtocolException, IOException {
        HttpGet httpGet = new HttpGet("https://www.google.com.vn/");
        HttpClient client = HttpClients.createDefault();
        HttpResponse httpResponse = client.execute(httpGet);
        System.out.println("Protocol: " + httpResponse.getProtocolVersion());
        System.out.println("Status:" + httpResponse.getStatusLine().toString());
        System.out.println("Content type:" + httpResponse.getEntity().getContentType());
        System.out.println("Locale:" + httpResponse.getLocale());
        System.out.println("Headers:");
        for(Header header : httpResponse.getAllHeaders()) {
            System.out.println("          " + header.getName()+": " + header.getValue());
        }
        System.out.println("Content:");
        
        String content = IOUtils.toString(httpResponse.getEntity().getContent(), "UTF-8");
        System.out.println(content);
  }
}
