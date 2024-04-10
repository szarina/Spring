package com.example.task2;
import com.example.task2.wsdl.NumberToDollars;
import com.example.task2.wsdl.NumberToDollarsResponse;
import com.example.task2.wsdl.NumberToWords;
import com.example.task2.wsdl.NumberToWordsResponse;
import jdk.jfr.Unsigned;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SoapClient extends  WebServiceGatewaySupport{

    private static final Logger log = LoggerFactory.getLogger(SoapClient.class);


    public NumberToWordsResponse numberToWords(BigInteger ubiNum){
        NumberToWords request = new NumberToWords();
        request.setUbiNum(ubiNum);

        log.info("Converting number  " + ubiNum + "to words");

        NumberToWordsResponse response = (NumberToWordsResponse) getWebServiceTemplate().
                marshalSendAndReceive("https://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL",
                request,
                new SoapActionCallback("http://www.dataaccess.com/webservicesserver/NumberToWords"));

        return response;

    }

    public NumberToDollarsResponse numberToDollars(BigDecimal dNum){
        NumberToDollars request = new NumberToDollars();
        request.setDNum(dNum);

        log.info("Coverting number " + dNum + "to dollars");
        NumberToDollarsResponse response = (NumberToDollarsResponse) getWebServiceTemplate().
                marshalSendAndReceive("https://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL",
                        request,
                        new SoapActionCallback("http://www.dataaccess.com/webservicesserver/NumberToDollars"));

        return response;

    }







}
