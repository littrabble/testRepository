package com.fredyang.example;

import com.google.gson.Gson;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringEscapeUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


/**
 * Created by fred.yang on 2016/5/26.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(DigestUtils.md5Hex("a1234567"));

        String str = "';alert(123);'";
        String str1 = "1234444";
        String str2 = null;
        String str3 = "";

        System.out.println(" ================ " + org.apache.commons.lang.StringEscapeUtils.escapeXml(str));
        System.out.println(" ================ " + StringEscapeUtils.escapeXml(str1));
        System.out.println(" ================ " + StringEscapeUtils.escapeXml(str1));
        System.out.println(" ================ " + StringEscapeUtils.escapeXml(str2));
        System.out.println(" ================ " + StringEscapeUtils.escapeXml(str3));

        for(int i=0;i<str.length();i++) {
            System.out.print(("%" + Integer.toHexString(str.charAt(i))));
        }

		// user2 commit
    }
}
