package com.test;

import cn.hutool.core.util.StrUtil;
import com.example.queue.Package;
import com.example.queue.PackageChannel;
import com.example.utils.AESUtil;
import com.google.common.base.Splitter;
import org.junit.jupiter.api.Test;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * @className: ApplicationTest
 * @author: YanBo
 * @date: 2023/9/2 09:45
 */
public class ApplicationTest {
    private Splitter splitter = Splitter.on("#");
    @Test
    public void demoTest(){
        List<String> strings = splitter.splitToList("1212#12121213#12133");



        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("1121", "34");
        map.put("2", "4");
        map.put("3", "5");

        for (String value : map.values()) {
            System.out.println(value + "" );
        }

    }

    @Test
    public void addFromHeaderTest(){
        ArrayList<String>  list = new ArrayList<String>();
        int i = 0;

        while (i < 10) {
            list.add(0, i+ "aaaaavvv");
            i++;
        }

        System.out.println(list.toString());
    }

    @Test
    public void forLinkList() {
        LinkedList<String> link = new LinkedList<>();
        int i = 0;

        while (i < 10) {

            link.add("nihao" + i);
            i++;
        }

        Iterator iterator = link.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Map<String, String> map = new HashMap<>();
    }

    @Test
    public void workerTest() {
        final PackageChannel channel = new PackageChannel(8);
        channel.startWorker();
        for (int i = 0; i < 100; i ++) {
            Package packagerq = new Package();
            packagerq.setAddress("test");
            packagerq.setName("test");
            channel.put(packagerq);
        }
    }

    @Test
    public void caseTest() {
        BiConsumer<Integer, Integer> consumer = (i, j) ->{
        };
        String as = StrUtil.toCamelCase("hello_word");
        System.out.println(as);
        String as1 = StrUtil.toUnderlineCase("helloWord");
        System.out.println(as1);

        System.out.println(StrUtil.toCamelCase("helloWord_Case"));
        System.out.println(StrUtil.toUnderlineCase("helloWord_Case"));

        String name = "hello_word";
        int length = name.length();
        StringBuilder sb = new StringBuilder(length);

        Map<String, Integer> userMap =  new HashMap<>();
        Integer v = userMap.computeIfAbsent("1", s->1);
    }
    public interface LoadFunc<T> {
        List<T> load(int start, int size);
    }
    @Test
    public void case1Test() throws NoSuchAlgorithmException {
        //AESUtil.getSecretKey("11121212");

        String s = AESUtil.decrypt("g9/4ymYAA91HgSFKvFRAGQ==","UwqpZsWbScSibklNYmzYkCSDzdxGGZIG");

        System.out.println(s);
    }


    @Test
    public void queryTest() {

    }

}
