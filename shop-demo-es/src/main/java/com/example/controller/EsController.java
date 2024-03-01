package com.example.controller;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import com.example.entity.MyUser;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @className: EsController
 * @author: YanBo
 * @date: 2023/8/29 15:13
 */
@RestController
public class EsController {

    @Autowired
    private ElasticsearchClient elasticsearchClient;
    @GetMapping("/es")
    public Object hello() throws IOException {
        MyUser myUser = new MyUser("10012", "test", "test-desc");
        IndexRequest<Object> indexRequest = new IndexRequest.Builder<>()
                .index("myuser")
                .id("10012")
                .document(myUser.toString())
                .build();

        elasticsearchClient.index(indexRequest);
        return "es";
    }
}
