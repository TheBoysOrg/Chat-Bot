package br.edu.uteis;

import java.io.IOException;
import okhttp3.*;


public class AnalizaMensagem {
    
    private static final String token = "A36BETK6AQEMMMVPCHQO2OQXCL3IITW4";
    private static final String url_wit = "https://api.wit.ai/message";
    
    public static String mandamensagem(String mensagem) throws IOException {
        
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = HttpUrl.parse(url_wit).newBuilder()
                .addQueryParameter("q", mensagem)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", "Bearer " + token)
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Erro na requisição ao Wit.ai: " + response);
            }
            return response.body().string();
        }
    }
  
}
