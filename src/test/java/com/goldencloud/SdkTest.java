package com.goldencloud;

import com.goldencloud.common.Sdk;
import com.goldencloud.invoice.models.InvoiceQueryVO;

import org.junit.Before;
import org.junit.Test;

public class SdkTest {

    Sdk sdk;

//    区块链测试用appkey：EgDjckWzyGxwIi7e9J1A8LdruWMidFFH
//    区块链测试用appsecret：9Q8744Oe0nv8aw738b3HkjdylYZzNeZOcTz53KI4pchKpqIi

    @Before
    public void before() {
        sdk = new Sdk("EgDjckWzyGxwIi7e9J1A8LdruWMidFFH", "9Q8744Oe0nv8aw738b3HkjdylYZzNeZOcTz53KI4pchKpqIi",  "test","1.0.0");
    }

    @Test
    public void genereateSignTest() throws Exception{

    }

    @Test
    public void httpPostTest()throws Exception{
        InvoiceQueryVO queryVO = new InvoiceQueryVO();
        queryVO.setBuyer_tax_id("9144030027939873X7");
        sdk.invoiceQuery(queryVO);
    }
}
