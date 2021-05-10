package com.smlnskgmail.jaman.hashchecker.calculator.jdk;

import com.smlnskgmail.jaman.hashchecker.logic.hashcalculator.api.HashType;
import com.smlnskgmail.jaman.hashchecker.logic.hashcalculator.impl.jdk.JdkHashCalculatorDigest;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import static org.junit.Assert.assertEquals;

public class JdkHashCalculatorDigestTest {

    private final byte[] input = "Test".getBytes();

    @Test
    public void md5HashDigest() throws NoSuchAlgorithmException, NoSuchProviderException {
        JdkHashCalculatorDigest jdkHashCalculatorDigest = JdkHashCalculatorDigest.instanceFor(
                HashType.MD5
        );
        jdkHashCalculatorDigest.update(input);
        assertEquals(
                "0cbc6611f5540bd0809a388dc95a615b",
                jdkHashCalculatorDigest.result()
        );
    }

    @Test
    public void crc32HashDigest() throws NoSuchAlgorithmException, NoSuchProviderException {
        JdkHashCalculatorDigest jdkHashCalculatorDigest = JdkHashCalculatorDigest.instanceFor(
                HashType.CRC_32
        );
        jdkHashCalculatorDigest.update(input);
        assertEquals(
                "784dd132",
                jdkHashCalculatorDigest.result()
        );
    }

}
