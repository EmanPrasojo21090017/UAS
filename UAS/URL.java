package UAS;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Scanner;

public class URL {
    private final String USER_AGENT = "Mozilla/5.0";

    public static java.net.URL buildURL(String urlQuery) {
        java.net.URL url = null;

        try {
            url = new java.net.URL(urlQuery.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        //Log.v(TAG, "Built URI " + url);
        return url;
    }

    public static String getResponseFromHttpUrl(java.net.URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }
    public void postJSON(java.net.URL address, String jsonData) throws IOException{
        HttpURLConnection con = (HttpURLConnection) address.openConnection();

        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Languange", "UTF-8");

        con.setDoOutput(true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(con.getOutputStream());
        outputStreamWriter.write(jsonData.toString());
        outputStreamWriter.flush();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + address);
        System.out.println("Post parameters : ");
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null){
            response.append(inputLine);
        }
        in.close();

        System.out.println("Responses are = "+response.toString());
    }
}
