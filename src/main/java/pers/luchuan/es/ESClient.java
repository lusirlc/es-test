package pers.luchuan.es;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

/**
 * @author luchuan
 * @className ESClient
 * @description ES客户端
 * @date 2021/6/29 22:18
 */
public class ESClient {
    public static void main(String[] args) {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200))
        );

        try {
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
